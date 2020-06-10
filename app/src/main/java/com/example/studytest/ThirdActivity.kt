package com.example.studytest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studytest.view.swipereveallayout.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val layoutManager: LinearLayoutManager = LinearLayoutManager(this)
        layoutManager.orientation = RecyclerView.VERTICAL
        recycler_view_swipe.layoutManager = layoutManager
        val list = mutableListOf<String>("1","222","555","666","777")
        val adapter = RecyclerAdapter(list)
        recycler_view_swipe.adapter = adapter
    }

    companion object {

        fun actionStart(activity: Activity) {
            val intent = Intent(activity,ThirdActivity::class.java)
            activity.startActivity(intent)
        }
    }
}
