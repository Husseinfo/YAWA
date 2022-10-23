package io.github.husseinfo.yawa.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    private var apiService: APIService? = null


    private const val baseUrl = "https://api.open-meteo.com/v1/"

    fun getAPIService(): APIService {
        if (apiService != null)
            return apiService!!
        apiService = Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIService::class.java)
        return apiService!!
    }
}
