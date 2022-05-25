package com.bridgelabz;

public class Doctor extends Person{

    private int doctorId;
    private HospitalUtility.DoctorDesignation doctorDesignation;

    public Doctor(int doctorId, HospitalUtility.DoctorDesignation doctorDesignation) {
        this.doctorId = doctorId;
        this.doctorDesignation = doctorDesignation;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public HospitalUtility.DoctorDesignation getDoctorDesignation() {
        return doctorDesignation;
    }

    public void setDoctorDesignation(HospitalUtility.DoctorDesignation doctorDesignation) {
        this.doctorDesignation = doctorDesignation;
    }
}
