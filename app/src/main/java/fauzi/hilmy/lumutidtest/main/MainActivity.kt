package fauzi.hilmy.lumutidtest.main

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import fauzi.hilmy.lumutidtest.R
import fauzi.hilmy.lumutidtest.base.MVPActivity
import fauzi.hilmy.lumutidtest.model.TodoModel
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : MVPActivity(), MainView {
    override fun initPresenter() {
        presenter = MainPresenter(this)
    }

    private var presenter: MainPresenter? = null
    private var adapter: MainAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter?.todo()
        rv_todo.layoutManager = LinearLayoutManager(this)
        adapter = MainAdapter(this)
        rv_todo.adapter = adapter
    }

    override fun todoSuccess(data: ArrayList<TodoModel>) {
        Log.v("Data", data.toString())
        adapter?.update(data)
    }

    override fun todoFail(message: String) {
        toast(message)
    }

    override fun showLoading(type: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading(type: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
