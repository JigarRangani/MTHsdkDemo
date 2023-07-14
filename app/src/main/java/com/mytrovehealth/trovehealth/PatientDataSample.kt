package com.mytrovehealth.trovehealth


import com.google.gson.annotations.SerializedName

data class PatientDataSample(
    @SerializedName("data")
    val dataModel: DataModel,
    @SerializedName("MAPPING_VERSION")
    val mAPPINGVERSION: String,
    @SerializedName("parsed_date")
    val parsedDate: String,
    @SerializedName("patient_id")
    val patientId: String,
    @SerializedName("response_type")
    val responseType: String,
    @SerializedName("unable_to_parse")
    val unableToParse: List<Any>
)