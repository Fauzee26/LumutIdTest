package fauzi.hilmy.lumutidtest.api

import com.google.gson.JsonArray
import fauzi.hilmy.lumutidtest.model.TodoModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @get:GET("todos")
    val country: Call<JsonArray>
}