package com.trueddns.homenano.anndroidlifecycle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("onCreate")
    }

    override fun onStart() {
        super.onStart()
        print("onStart")
    }

    override fun onResume() {
        super.onResume()
        print("onResume")

        val intent = Intent(this, ShowActivity::class.java)
        startActivity(intent)

    }

    override fun onPause() {
        super.onPause()
        print("OnPause")
    }

    override fun onStop() {
        super.onStop()
        print("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy")
    }

    fun print(msg: String) {
        Log.e("Activity State", msg)
    }

}