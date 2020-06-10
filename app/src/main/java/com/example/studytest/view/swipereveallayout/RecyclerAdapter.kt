package com.example.studytest.view.swipereveallayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chauthai.swipereveallayout.SwipeRevealLayout
import com.chauthai.swipereveallayout.ViewBinderHelper
import com.example.studytest.R


/**
 * https://github.com/chthai64/SwipeRevealLayout
 */

class RecyclerAdapter(val list:MutableList<String>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val binderHelper = ViewBinderHelper()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.swipe_reveal_layout_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val string = list.get(position)
        //此句
        binderHelper.bind(holder.swipe_layout,string)
        holder.textView.text = string
        holder.button.setOnClickListener {
            list.removeAt(position)
            notifyDataSetChanged()
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.recycler_text)
        val button = view.findViewById<Button>(R.id.button_delete)
        val swipe_layout = view.findViewById<SwipeRevealLayout>(R.id.swipe_layout)
    }
}