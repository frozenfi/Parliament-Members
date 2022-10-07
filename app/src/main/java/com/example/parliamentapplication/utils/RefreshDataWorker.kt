package com.example.parliamentapplication.utils

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.parliamentapplication.data.MemberOfParliamentDatabase.Companion.getInstance
import com.example.parliamentapplication.repo.MembersRepo
import retrofit2.HttpException

class RefreshDataWorker(appContext: Context, params: WorkerParameters):
    CoroutineWorker(appContext, params) {

    companion object{
        const val RefreshDatabase = "com.example.parliamentapplication.utils.RefreshDataWorker"
    }
    override suspend fun doWork(): Result  {
        val database = getInstance(applicationContext)
        val repository = MembersRepo(database.memberOfParliamentDAO)
        return try {
            repository.refreshData()
            Result.success()
        } catch (exception: HttpException){
            Result.retry()
        }

    }
}