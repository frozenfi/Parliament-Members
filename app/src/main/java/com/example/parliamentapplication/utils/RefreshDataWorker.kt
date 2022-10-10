package com.example.parliamentapplication.utils
/*
* Name: Binod Panta
* Student No: 2012206
* Date: 05.10.2022
*/
import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.parliamentapplication.data.membersdata.MemberOfParliamentDatabase.Companion.getInstance
import com.example.parliamentapplication.repo.MembersRepo
import retrofit2.HttpException

/*
* It setup the work, work calls repository method and refresh or fill the database
*/

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