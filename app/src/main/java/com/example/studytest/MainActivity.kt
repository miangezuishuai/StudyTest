package com.example.studytest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.studytest.algorithm.Algorithm
import com.example.studytest.dagger2.DaggerMainActivityComponent
import com.example.studytest.dagger2.Watch
import com.example.studytest.dagger2.abstract_inject.Car
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var watch:Watch

    @Inject
    lateinit var car: Car

    private var backPressTime = 0L

    override fun onBackPressed() {
        val nowTime = System.currentTimeMillis()
        if (nowTime - backPressTime > 2000) {
            backPressTime = nowTime
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show()
        } else {
            super.onBackPressed()
        }
    }

    lateinit var timeChangeReceiver: TimeChangeReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //dagger2
        DaggerMainActivityComponent.create().inject(this)
        watch.work()
        val str = car.run()
        Log.d("Dagger2","MainActivity_$str")


        Algorithm.getInstance().bubbleSort()

        button.setOnClickListener(View.OnClickListener { SecondActivity.actionStart(this) })


        //广播
        val intentFilter = IntentFilter()
        intentFilter.addAction("android.intent.action.TIME_TICK")
        timeChangeReceiver = TimeChangeReceiver()
        registerReceiver(timeChangeReceiver, intentFilter)


        //服务
        button_service.setOnClickListener(View.OnClickListener {
            Log.d("MainActivity", "当前线程是${Thread.currentThread().name}")
            MyIntentService.startActionFoo(this,"1","2")
        })

        button_third_activity.setOnClickListener {
            ThirdActivity.actionStart(this)
            Toast.makeText(this,resources.getString(R.string.test_name),Toast.LENGTH_SHORT).show()
        }

        button_jni_activity.setOnClickListener { JniActivity.actionStart(this) }

        button_rxjava.setOnClickListener { RxJavaActivity.actionStart(this) }
    }


    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(timeChangeReceiver)
    }

    //四大组件---广播
    inner class TimeChangeReceiver : BroadcastReceiver() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            Toast.makeText(p0,"系统时间改变",Toast.LENGTH_SHORT).show()
        }
    }
}
