package com.mytrovehealth.sources



interface TroveApiResponse {

    interface DataResponse<T> {
        fun onShowProgress()
        fun onHideProgress()
        fun onEmpty()
        fun onSuccess(data: T)
        fun onFailed(statusCode: Int, errorMessage: String? = "")
    }
}