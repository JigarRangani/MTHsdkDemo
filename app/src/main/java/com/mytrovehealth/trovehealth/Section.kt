package com.mytrovehealth.trovehealth


import com.google.gson.annotations.SerializedName

data class Section(
    @SerializedName("human_readable")
    val humanReadable: List<HumanReadable>,
    @SerializedName("machine_readable")
    val machineReadable: List<MachineReadable>,
    @SerializedName("Section_Codes")
    val sectionCodes: List<String>,
    @SerializedName("Section_Name")
    val sectionName: String
)