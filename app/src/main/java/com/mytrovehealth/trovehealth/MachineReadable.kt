package com.mytrovehealth.trovehealth


import com.google.gson.annotations.SerializedName

data class MachineReadable(
    @SerializedName("Advancedirectives_Code")
    val advancedirectivesCode: String,
    @SerializedName("Allergy_Status")
    val allergyStatus: String,
    @SerializedName("Assigning_Authority")
    val assigningAuthority: String,
    @SerializedName("Component")
    val component: String,
    @SerializedName("Date_Captured")
    val dateCaptured: String,
    @SerializedName("Date_Recorded")
    val dateRecorded: String,
    @SerializedName("Department")
    val department: String,
    @SerializedName("Dispense_Quantity")
    val dispenseQuantity: String,
    @SerializedName("Document_Id")
    val documentId: String,
    @SerializedName("Does_Unit")
    val doesUnit: String,
    @SerializedName("Does_Value")
    val doesValue: String,
    @SerializedName("End_Date")
    val endDate: String,
    @SerializedName("Evaluationnote_Code")
    val evaluationnoteCode: String,
    @SerializedName("Guarantor")
    val guarantor: String,
    @SerializedName("Healthconcerns_Code")
    val healthconcernsCode: String,
    @SerializedName("Healthinsurance_Type")
    val healthinsuranceType: String,
    @SerializedName("Immunization_Date")
    val immunizationDate: String,
    @SerializedName("Immunization_Vaccine")
    val immunizationVaccine: String,
    @SerializedName("Implant")
    val implant: String,
    @SerializedName("Insurance_Code")
    val insuranceCode: String,
    @SerializedName("Insurance_Codesystem")
    val insuranceCodesystem: String,
    @SerializedName("Insurance_Codesystemname")
    val insuranceCodesystemname: String,
    @SerializedName("Insurance_Coverage")
    val insuranceCoverage: String,
    @SerializedName("Insurance_Displayname")
    val insuranceDisplayname: String,
    @SerializedName("Insurance_Subscriberid")
    val insuranceSubscriberid: String,
    @SerializedName("Lab_Result")
    val labResult: String,
    @SerializedName("Lab_Result_Code")
    val labResultCode: String,
    @SerializedName("Lab_Result_Codesystem")
    val labResultCodesystem: String,
    @SerializedName("Lab_Result_Codesystemname")
    val labResultCodesystemname: String,
    @SerializedName("Loinc")
    val loinc: String,
    @SerializedName("Medication")
    val medication: String,
    @SerializedName("Medication_Code")
    val medicationCode: String,
    @SerializedName("Medication_Codesystem")
    val medicationCodesystem: String,
    @SerializedName("Medication_Codesystemname")
    val medicationCodesystemname: String,
    @SerializedName("Medication_Status")
    val medicationStatus: String,
    @SerializedName("Mentalstatus_Code")
    val mentalstatusCode: String,
    @SerializedName("Mentalstatus_Codesystem")
    val mentalstatusCodesystem: String,
    @SerializedName("Mentalstatus_Codesystemname")
    val mentalstatusCodesystemname: String,
    @SerializedName("Observation")
    val observation: String,
    @SerializedName("Plantreatment_Code")
    val plantreatmentCode: String,
    @SerializedName("Plantreatment_Codesystem")
    val plantreatmentCodesystem: String,
    @SerializedName("Plantreatment_Codesystemname")
    val plantreatmentCodesystemname: String,
    @SerializedName("Problem")
    val problem: String,
    @SerializedName("Problem_Code")
    val problemCode: String,
    @SerializedName("Problem_Codesystem")
    val problemCodesystem: String,
    @SerializedName("Problem_Codesystemname")
    val problemCodesystemname: String,
    @SerializedName("Procedure_Code")
    val procedureCode: String,
    @SerializedName("Procedure_Codesystem")
    val procedureCodesystem: String,
    @SerializedName("Procedure_Codesystemname")
    val procedureCodesystemname: String,
    @SerializedName("Procedure_Name")
    val procedureName: String,
    @SerializedName("Procedures_Code")
    val proceduresCode: String,
    @SerializedName("Producer")
    val producer: String,
    @SerializedName("Producer_Date")
    val producerDate: String,
    @SerializedName("Producer_Status")
    val producerStatus: String,
    @SerializedName("Question")
    val question: String,
    @SerializedName("Question_Code")
    val questionCode: String,
    @SerializedName("Question_Codesystem")
    val questionCodesystem: String,
    @SerializedName("Reaction")
    val reaction: String,
    @SerializedName("Reaction_Type")
    val reactionType: String,
    @SerializedName("Reading_Unit")
    val readingUnit: String,
    @SerializedName("Reading_Value")
    val readingValue: String,
    @SerializedName("Reference_Range")
    val referenceRange: String,
    @SerializedName("Relation_To_Patient")
    val relationToPatient: String,
    @SerializedName("Response")
    val response: String,
    @SerializedName("Response_Code")
    val responseCode: String,
    @SerializedName("Response_Codesystem")
    val responseCodesystem: String,
    @SerializedName("Response_Codesystemname")
    val responseCodesystemname: String,
    @SerializedName("Results_Code")
    val resultsCode: String,
    @SerializedName("Results_Datetime")
    val resultsDatetime: String,
    @SerializedName("Results_Unit")
    val resultsUnit: String,
    @SerializedName("Results_Value")
    val resultsValue: String,
    @SerializedName("Route_Code")
    val routeCode: String,
    @SerializedName("Route_Codesystem")
    val routeCodesystem: String,
    @SerializedName("Route_Codesystemname")
    val routeCodesystemname: String,
    @SerializedName("Route_Name")
    val routeName: String,
    @SerializedName("Section_Code_2")
    val sectionCode2: String,
    @SerializedName("Section_Name")
    val sectionName: String,
    @SerializedName("Section_Title")
    val sectionTitle: String,
    @SerializedName("Service_End_Date")
    val serviceEndDate: String,
    @SerializedName("Service_Start_Date")
    val serviceStartDate: String,
    @SerializedName("Start_Date")
    val startDate: String,
    @SerializedName("Status")
    val status: String,
    @SerializedName("Substance")
    val substance: String,
    @SerializedName("Time_Taken")
    val timeTaken: String,
    @SerializedName("Vaccine_Code")
    val vaccineCode: String,
    @SerializedName("Vaccine_Codesystem")
    val vaccineCodesystem: String,
    @SerializedName("Vaccine_Codesystemname")
    val vaccineCodesystemname: String,
    @SerializedName("Vital_Sign")
    val vitalSign: String,
    @SerializedName("Vitals_Code")
    val vitalsCode: String
)