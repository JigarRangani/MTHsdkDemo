package com.mytrovehealth.trovehealth


import com.google.gson.annotations.SerializedName

data class Demographic(
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("ethnicGroup")
    val ethnicGroup: String,
    @SerializedName("family_name")
    val familyName: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("given_name")
    val givenName: String,
    @SerializedName("maritalStatus")
    val maritalStatus: String,
    @SerializedName("patient_id")
    val patientId: String,
    @SerializedName("postalcode")
    val postalcode: String,
    @SerializedName("raceCode")
    val raceCode: String,
    @SerializedName("religiousAffiliation")
    val religiousAffiliation: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("streetaddressline1")
    val streetaddressline1: String,
    @SerializedName("streetaddressline2")
    val streetaddressline2: String,
    @SerializedName("telecom")
    val telecom: String
)