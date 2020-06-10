package com.example.studytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewStub
import android.widget.Button
import android.widget.TextView
import com.example.studytest.eventbus.MessageEvent
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

open class BaseActivity : AppCompatActivity() {

    private var loadErrorView: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EventBus.getDefault().register(this)
    }

    protected fun showErroeView(tip: String) {
        if (loadErrorView != null) {
            loadErrorView?.visibility= View.VISIBLE
            return
        }
        val viewStub = findViewById<ViewStub>(R.id.load_error_view)
        if (viewStub != null) {
            loadErrorView = viewStub.inflate()
            val loadErrorText = loadErrorView?.findViewById<TextView>(R.id.loadErrorText)
            loadErrorText?.text = tip
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    open fun onMessageEvent(event: MessageEvent) {

    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }
}
