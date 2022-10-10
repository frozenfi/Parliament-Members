package com.example.parliamentapplication
/*
* Name: Binod Panta
* Student No: 2012206
* Date: 04.10.2022
*/

import android.app.Application
import androidx.work.*
import com.example.parliamentapplication.utils.RefreshDataWorker
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

/*
* It set up the background work, refresh members data fro api through WORKMANAGER
* It is set in Manifest XML file as MyApp.kt
*/
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

    private fun setupWork() {
        val cons = Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()
        val repeatRequest = PeriodicWorkRequestBuilder<RefreshDataWorker>(1,TimeUnit.DAYS).setConstraints(cons).build()

        WorkManager.getInstance().enqueueUniquePeriodicWork(
            RefreshDataWorker.RefreshDatabase,ExistingPeriodicWorkPolicy.KEEP,repeatRequest
        )
    }
}

