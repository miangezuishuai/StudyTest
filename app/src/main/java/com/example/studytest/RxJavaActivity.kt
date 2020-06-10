package com.example.studytest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studytest.rxjava.RxJavaTest
import kotlinx.android.synthetic.main.activity_rx_java.*

class RxJavaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rx_java)
        initViews()
    }

    fun initViews() {
        button_interval.setOnClickListener { RxJavaTest.getInstance().interval() }
    }

    companion object {

        fun actionStart(activity: Activity) {
            val intent = Intent(activity,RxJavaActivity::class.java)
            activity.startActivity(intent)
        }
    }
}
