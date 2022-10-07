package com.example.parliamentapplication

import android.app.Application
import androidx.work.*
import com.example.parliamentapplication.utils.RefreshDataWorker
import kotlinx.coroutines.*

import java.util.concurrent.TimeUnit

class MyApp: Application() {

    private val applicationScope = CoroutineScope(Dispatchers.Default)

    override fun onCreate() {
        super.onCreate()
        delayedInit()
    }

    private fun delayedInit() {
        applicationScope.launch {
            setupWork()
        }
    }

    @Suppress("DEPRECATION")
    private fun setupWork() {
        val cons = Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()
        val repeatRequest = PeriodicWorkRequestBuilder<RefreshDataWorker>(1,TimeUnit.DAYS).setConstraints(cons).build()

        WorkManager.getInstance().enqueueUniquePeriodicWork(
            RefreshDataWorker.RefreshDatabase,ExistingPeriodicWorkPolicy.KEEP,repeatRequest
        )
    }
}