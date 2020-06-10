package com.example.studytest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewStub
import android.widget.Button
import com.example.studytest.dagger2.DaggerSecondActivityComponent
import com.example.studytest.dagger2.GsonModule
import com.example.studytest.eventbus.MessageEvent
import com.example.studytest.eventbus.StringEvent
import com.example.studytest.module.JsonData
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_second.*
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

class SecondActivity : BaseActivity() {

    @Inject
    lateinit var gson: Gson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button_stub.setOnClickListener {
            showErroeView("SecondActivity错误")
            EventBus.getDefault().post(StringEvent("123"))
        }
        DaggerSecondActivityComponent.create().inject(this)
        val json = "{\"id\":\"7\",\"version\":\"3.5\",\"name\":\"Clash Royale\"}"
        val jsonData = gson.fromJson(json, JsonData::class.java)
        Log.d("Dagger2","SecondActivity_"+jsonData.toString())
    }

    override fun onMessageEvent(event: MessageEvent) {
        if (event is StringEvent) {
            Log.d("SecondActivity",event.messaage)
        }
    }

    companion object {

        fun actionStart(activity:Activity) {
            val intent = Intent("com.example.studytest.ACTION_START")
            activity.startActivity(intent)
        }
    }
}
