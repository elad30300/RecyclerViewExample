package com.example.recyclerviewexample

import android.app.Application
import com.example.recyclerviewexample.di.DaggerApplicationComponent

class MyApplication : Application() {
    val appComponent = DaggerApplicationComponent.create()
}