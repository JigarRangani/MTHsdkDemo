package com.mytrovehealth.trovehealth


import com.google.gson.annotations.SerializedName

data class DataModel(
    @SerializedName("demographic")
    val demographic: Demographic,
    @SerializedName("sections")
    val sections: List<Section>
)