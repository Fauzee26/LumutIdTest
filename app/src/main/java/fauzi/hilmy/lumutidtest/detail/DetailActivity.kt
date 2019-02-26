package fauzi.hilmy.lumutidtest.detail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import fauzi.hilmy.lumutidtest.R
import fauzi.hilmy.lumutidtest.model.TodoModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val data = intent.getSerializableExtra("data") as TodoModel

        txtIsi.text = data.title
        if (data.completed == true){
            txtComplete.text = "COMPLETE"
        } else {
            txtComplete.text = "NOT COMPLETE"
        }
    }
}
