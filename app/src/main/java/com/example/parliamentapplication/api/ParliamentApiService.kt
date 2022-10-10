package com.example.parliamentapplication.api

/*
* Name: Binod Panta
* Student No: 2012206
* Date: 02.10.2022
*/
import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import com.example.parliamentapplication.ParliamentMembers


private const val BASE_URL = "https://users.metropolia.fi/~peterh/"


//Creates an instance of Moshi
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()


//Creates an instance of retrofit and pass an instance of MoshiConverter
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    //.addCallAdapterFactory(CoroutineCallAdapterFactory())
    .build()


//Data fetching function
interface ParliamentApiService {
    @GET("mps.json")
    suspend fun getParliamentMembers(): List<ParliamentMembers> // Removed suspend
}


//Retrofit Service
object ParliamentApi {
    val parliamentMembers: ParliamentApiService = retrofit.create(ParliamentApiService::class.java)
}

enum class ParliamentApiStatus { LOADING, DONE }