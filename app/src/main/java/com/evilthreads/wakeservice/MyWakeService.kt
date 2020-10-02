package com.evilthreads.wakeservice

import android.content.Intent
import android.util.Log
import com.evilthreads.wakeservicelib.WakeService

class MyWakeService : WakeService("MyWakeService"){
    companion object{
        val KEY_DURATION = "KEY_DURATION"
    }
    override fun Intent.doWork() {
        Log.d("MyWakeService", "Doing Work")
        //wait 10 seconds
        Thread.sleep(getIntExtra(KEY_DURATION, 10000).toLong())
        Log.d("MyWakeService", "Finished Work")
    }
}