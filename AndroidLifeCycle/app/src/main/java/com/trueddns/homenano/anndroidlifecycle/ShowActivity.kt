package com.trueddns.homenano.anndroidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        print("onCreate2")
    }

    override fun onStart() {
        super.onStart()
        print("onStart2")
    }

    override fun onResume() {
        super.onResume()
        print("onResume2")
    }

    override fun onPause() {
        super.onPause()
        print("OnPause2")
    }

    override fun onStop() {
        super.onStop()
        print("onStop2")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart2")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy2")
    }

    fun print(msg: String) {
        Log.e("Activity State2", msg)
    }
}