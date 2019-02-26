package fauzi.hilmy.lumutidtest.main

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonParser
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import fauzi.hilmy.lumutidtest.api.ApiClient
import fauzi.hilmy.lumutidtest.base.BasePresenter
import fauzi.hilmy.lumutidtest.model.TodoModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.reflect.Type


class MainPresenter(view: MainView) : BasePresenter<MainView>(view) {
    fun todo() {
        val serviceAPI = ApiClient.instance
        val loadTeamCall = serviceAPI.country
        loadTeamCall.enqueue(object : Callback<JsonArray> {
            override fun onResponse(call: Call<JsonArray>, response: Response<JsonArray>) {

                val data: ArrayList<TodoModel>?

                val todo = response.body().toString()
                val listType = object : TypeToken<List<TodoModel>>() {

                }.type
                data = getTeamListFromJson(todo, listType)

                view?.todoSuccess(data!!)
            }

            override fun onFailure(call: Call<JsonArray>, t: Throwable) {
                view?.todoFail(t.message!!)
            }
        })
    }

    fun <T> getTeamListFromJson(jsonString: String, type: Type): ArrayList<T>? {
        return if (!isValid(jsonString)) {
            null
        } else Gson().fromJson<ArrayList<T>>(jsonString, type)
    }

    fun isValid(json: String): Boolean {
        try {
            JsonParser().parse(json)
            return true
        } catch (jse: JsonSyntaxException) {
            return false
        }

    }
}