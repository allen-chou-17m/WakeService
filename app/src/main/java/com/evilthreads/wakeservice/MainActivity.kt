package com.evilthreads.wakeservice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent().apply {
            putExtra(MyWakeService.KEY_DURATION, 30000)
            setClass(this@MainActivity, MyWakeService::class.java)
        }
        startService(intent)
    }
}