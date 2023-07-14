package com.mytrovehealth.trovehealth


import com.google.gson.annotations.SerializedName

data class HumanReadable(
    @SerializedName("Acute_Goals")
    val acuteGoals: String,
    @SerializedName("Address")
    val address: String,
    @SerializedName("Admit_Date")
    val admitDate: String,
    @SerializedName("Advance_Directives")
    val advanceDirectives: String,
    @SerializedName("Allergen")
    val allergen: String,
    @SerializedName("Answer")
    val answer: String,
    @SerializedName("Assessment_Datetime")
    val assessmentDatetime: String,
    @SerializedName("Assigned Birth Sex")
    val assignedBirthSex: String,
    @SerializedName("Chief_Complaint")
    val chiefComplaint: String,
    @SerializedName("Contact Info.")
    val contactInfo: String,
    @SerializedName("Coverage_Id")
    val coverageId: String,
    @SerializedName("Date_Implanted")
    val dateImplanted: String,
    @SerializedName("Date_Ordered")
    val dateOrdered: String,
    @SerializedName("Date_Performed")
    val datePerformed: String,
    @SerializedName("Date_Recorded")
    val dateRecorded: String,
    @SerializedName("Daterecorded")
    val daterecorded: String,
    @SerializedName("Datetime")
    val datetime: String,
    @SerializedName("Device_Details")
    val deviceDetails: String,
    @SerializedName("Diagnosis_Name")
    val diagnosisName: String,
    @SerializedName("Dictated_By")
    val dictatedBy: String,
    @SerializedName("Dictated_Datetime")
    val dictatedDatetime: String,
    @SerializedName("Directions")
    val directions: String,
    @SerializedName("Discharge_Depart_Date")
    val dischargeDepartDate: String,
    @SerializedName("Document_Id")
    val documentId: String,
    @SerializedName("Dosage")
    val dosage: String,
    @SerializedName("Encounter_Type")
    val encounterType: String,
    @SerializedName("Event_Date")
    val eventDate: String,
    @SerializedName("Guarantor_Name")
    val guarantorName: String,
    @SerializedName("Instructions")
    val instructions: String,
    @SerializedName("Lab_Results")
    val labResults: String,
    @SerializedName("Last_Updated")
    val lastUpdated: String,
    @SerializedName("Location_Details")
    val locationDetails: String,
    @SerializedName("Medical_Problem")
    val medicalProblem: String,
    @SerializedName("Medication")
    val medication: String,
    @SerializedName("Narrative_Text")
    val narrativeText: String,
    @SerializedName("Observation")
    val observation: String,
    @SerializedName("Payer")
    val payer: String,
    @SerializedName("Performing_Site")
    val performingSite: String,
    @SerializedName("Policy_Number")
    val policyNumber: String,
    @SerializedName("Procedure")
    val procedure: String,
    @SerializedName("Procedure_Name")
    val procedureName: String,
    @SerializedName("Provider")
    val provider: String,
    @SerializedName("Provider_Address")
    val providerAddress: String,
    @SerializedName("Provider_Contact_Information")
    val providerContactInformation: String,
    @SerializedName("Qty")
    val qty: String,
    @SerializedName("Reaction")
    val reaction: String,
    @SerializedName("Reaction_Type")
    val reactionType: String,
    @SerializedName("Reading")
    val reading: String,
    @SerializedName("Reading_Date")
    val readingDate: String,
    @SerializedName("Reason_For_Visit")
    val reasonForVisit: String,
    @SerializedName("Recent_Diagnosis")
    val recentDiagnosis: String,
    @SerializedName("Recorded_Datetime")
    val recordedDatetime: String,
    @SerializedName("Reference_Range")
    val referenceRange: String,
    @SerializedName("Report")
    val report: String,
    @SerializedName("Response")
    val response: String,
    @SerializedName("Result_Comment")
    val resultComment: String,
    @SerializedName("Result_Datetime")
    val resultDatetime: String,
    @SerializedName("Result_Status")
    val resultStatus: String,
    @SerializedName("Route")
    val route: String,
    @SerializedName("Row_Id")
    val rowId: String,
    @SerializedName("Scheduled_Date")
    val scheduledDate: String,
    @SerializedName("Section_Name")
    val sectionName: String,
    @SerializedName("Service_End_Date")
    val serviceEndDate: String,
    @SerializedName("Service_Start_Date")
    val serviceStartDate: String,
    @SerializedName("Source")
    val source: String,
    @SerializedName("Start_Date")
    val startDate: String,
    @SerializedName("Status")
    val status: String,
    @SerializedName("Stop_Date")
    val stopDate: String,
    @SerializedName("Subscriber_Id")
    val subscriberId: String,
    @SerializedName("Test_Name")
    val testName: String,
    @SerializedName("Units")
    val units: String,
    @SerializedName("Universal_Device_Identifier")
    val universalDeviceIdentifier: String,
    @SerializedName("Unknown0")
    val unknown0: String,
    @SerializedName("Vaccine_Name")
    val vaccineName: String,
    @SerializedName("Verified")
    val verified: String,
    @SerializedName("Vital_Reading")
    val vitalReading: String
)