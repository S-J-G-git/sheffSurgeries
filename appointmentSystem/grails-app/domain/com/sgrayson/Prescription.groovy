package com.sgrayson

class Prescription {

    //Variables
    String pharmacyName
    int prescripNumber
    String medicine
    int totalCost
    Date dateIssued
    Boolean patientPaying

    static constraints = {
        //contraints
        pharmacyName blank:false, nullable:false
        prescripNumber blank:false, nullable:false
        medicine blank:false, nullable:false
        totalCost blank:false, nullable:false
        dateIssued blank:false, nullable:false
        patientPaying blank:false, nullable:false
    }
    static belongsTo = [doctor:Doctor, patient:Patient] //belongsTo Relationships
}