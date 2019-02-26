package fauzi.hilmy.lumutidtest.base

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import org.jetbrains.anko.progressDialog

abstract class MVPActivity : AppCompatActivity() {

    abstract fun initPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initPresenter()
    }

    fun <T> goAndFinish(cls: Class<T>) {
        val intent = Intent(this, cls)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    private var progressDialog: AlertDialog? = null

    fun showProgressMessage(message: String, cancelable: Boolean?) {
        progressDialog = progressDialog(message) {
            cancelable?.let { setCancelable(it) }
            isIndeterminate = true
        }
        progressDialog?.show()
    }

    fun dismissProgressMessage() {
        progressDialog?.let { it.dismiss() }
    }

    fun View.visible() {
        visibility = View.VISIBLE
    }

    fun View.gone() {
        visibility = View.GONE
    }

    fun View.invisible() {
        visibility = View.INVISIBLE
    }
}