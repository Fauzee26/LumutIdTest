package fauzi.hilmy.lumutidtest.main

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fauzi.hilmy.lumutidtest.R
import fauzi.hilmy.lumutidtest.detail.DetailActivity
import fauzi.hilmy.lumutidtest.model.TodoModel
import fauzi.hilmy.lumutidtest.util.Commons
import kotlinx.android.synthetic.main.list_item.view.*
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.startActivity

class MainAdapter(private val activity: Activity) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    private var dataa: ArrayList<TodoModel> = ArrayList()

    fun update(data: ArrayList<TodoModel>) {
        dataa.clear()
        dataa.addAll(data)
        notifyDataSetChanged()
    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(data: TodoModel) = with(view) {
            txt_isi.text = data.title
            if (data.completed == true) {
                fab_complete.setImageDrawable(resources.getDrawable(R.drawable.ic_check_black_24dp))
            } else {
                fab_complete.setImageDrawable(resources.getDrawable(R.drawable.ic_clear_black_24dp))
            }
            val first = data.title!!.substring(0, 1).toUpperCase()
            txtSingle.text = first
            txtSingle.backgroundColor = Commons.getTopicColor(first)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MainAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = dataa.size

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, p1: Int) {
        holder.bind(dataa[p1])
        holder.itemView.setOnClickListener {
            activity.startActivity<DetailActivity>("data" to dataa[p1])
        }
    }
}