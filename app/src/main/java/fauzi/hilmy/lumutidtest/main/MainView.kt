package fauzi.hilmy.lumutidtest.main

import fauzi.hilmy.lumutidtest.base.BaseView
import fauzi.hilmy.lumutidtest.model.TodoModel

interface MainView : BaseView {
    fun todoSuccess(data: ArrayList<TodoModel>)
    fun todoFail(message: String)
}