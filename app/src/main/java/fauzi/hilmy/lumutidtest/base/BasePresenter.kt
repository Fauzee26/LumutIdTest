package fauzi.hilmy.lumutidtest.base

open class BasePresenter<V>(view: V) {
    var view: V? = null

    init {
        this.view = view
    }

    fun attachView(view: V) {
        this.view = view
    }

    fun detachView() {
        view = null
    }
}