package com.jeremyciske.rainassignment.network

import com.jeremyciske.rainassignment.model.ResultList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Jeremy Ciske on 1/27/2018.
 * Service to send query to whoisyourrepresentative
 */
interface RepsAndSensService {
    @GET("getall_mems.php")
    fun getRepZip(@Query("zip")zip: String, @Query("output")output: String = "json"): Call<ResultList>

    @GET("getall_reps_byname.php")
    fun getRepByName(@Query("name")name: String, @Query("output")output: String = "json"): Call<ResultList>

    @GET("getall_reps_bystate.php")
    fun getRepByState(@Query("state")state: String, @Query("output")output: String = "json"): Call<ResultList>

    @GET("getall_sens_byname.php")
    fun getSenByName(@Query("name")name: String, @Query("output")output: String = "json"): Call<ResultList>

    @GET("getall_sens_bystate.php")
    fun getSenByState(@Query("state")state: String, @Query("output")output: String = "json"): Call<ResultList>
}