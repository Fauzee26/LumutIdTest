package fauzi.hilmy.lumutidtest.api

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

object ApiClient {
    var BASE_URL = "https://jsonplaceholder.typicode.com/"

    val instance: ApiInterface
        get() = setInit().create(ApiInterface::class.java)

    fun setInit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
