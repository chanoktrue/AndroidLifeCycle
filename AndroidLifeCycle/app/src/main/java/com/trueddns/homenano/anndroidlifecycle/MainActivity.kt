package com.trueddns.homenano.anndroidlifecycle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.trueddns.homenano.anndroidlifecycle.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

//    private var showButton: Button? = null

//    private val showButton: Button by lazy{ findViewById<Button>(R.id.showButton)}
//
    private  val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

//    val binding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("onCreate")

        binding.titleTextView.text = "Main Activity"
        binding.nameTextView.text = " Ok....."

        binding.showButton.setOnClickListener {
            binding.titleTextView.text = "showActivity"
            val intent = Intent(this, ShowActivity::class.java)
            intent.putExtra("name", binding.nameTextView.text)
            startActivity(intent)
        }

        setContentView(binding.root)


//        showButton = findViewById<Button>(R.id.showButton)

//        showButton!!.setOnClickListener {
//            val intent = Intent(this, ShowActivity::class.java)
//            startActivity(intent)
//        }
//
//        binding.titleTextView.text = "Test Binding..."

    }

    override fun onStart() {
        super.onStart()
        print("onStart")
    }

    override fun onResume() {
        super.onResume()
        print("onResume")

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
        binding.titleTextView.text = msg
    }

}