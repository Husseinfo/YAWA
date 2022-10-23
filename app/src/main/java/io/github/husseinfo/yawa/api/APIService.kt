package io.github.husseinfo.yawa.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET("/forecast?hourly=temperature_2m")
    suspend fun forecast(
        @Query("latitude") latitude: String,
        @Query("longitude") longitude: String,
    ): Response<ForecastResponse>
}
