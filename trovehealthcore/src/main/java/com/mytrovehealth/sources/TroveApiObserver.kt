package com.mytrovehealth.sources

import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

abstract class TroveApiObserver<M : Any> : Observer<M> {

    abstract fun onSuccess(data: M)

    abstract fun onFailure(code: Int, errorMessage: String)

    override fun onComplete() {
    }

    override fun onNext(t: M) {
        onSuccess(t)
    }

    override fun onSubscribe(d: Disposable) {
    }

    override fun onError(e: Throwable) {
        e.printStackTrace()
        when (e) {
            is HttpException -> {

                var baseDao: M? = null
                try {
                    val body = e.response()?.errorBody()
                } catch (exception: Exception) {
                    onFailure(504, exception.message!!)
                }

                onFailure(504, "Error Response")
            }

            is UnknownHostException -> onFailure(
                -1,
                "Something went wrong: ${e.message}"
            )
            is SocketTimeoutException -> onFailure(
                -1,
                "Something went wrong: ${e.message}"
            )
            else -> onFailure(-1, e.message ?: "Unknown error occured")
        }

    }


}