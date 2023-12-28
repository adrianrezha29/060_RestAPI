package com.example.act13

import android.app.Application
import com.example.act13.Repository.AppContainer
import com.example.act13.Repository.KontakContainer

class KontakAplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}