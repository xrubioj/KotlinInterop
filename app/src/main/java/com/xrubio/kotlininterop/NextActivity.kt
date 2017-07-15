package com.xrubio.kotlininterop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

import butterknife.BindView
import butterknife.ButterKnife

class NextActivity : AppCompatActivity() {

    @BindView(R.id.textView)
    internal var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        supportActionBar?.title = "Activity B"

        ButterKnife.bind(this)

        textView?.text = "Injected! It worked!"
    }
}
