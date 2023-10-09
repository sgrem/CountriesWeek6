package com.kodeco.android.countryinfo.network

import com.kodeco.android.countryinfo.models.Country
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface CountryService {
    @Headers("timeout:5000")
    @GET("all")
    suspend fun getAllCountries(): Response<List<Country>>
}
