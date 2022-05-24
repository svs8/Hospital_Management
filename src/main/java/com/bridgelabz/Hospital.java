package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {

    static Scanner scanner=new Scanner(System.in);
    private String hospitalName;
    private String address;

    List<Patient> patientList=new ArrayList<>();
    public Hospital(){

    }
    public Hospital(String hospitalName, String address) {
        this.hospitalName = hospitalName;
        this.address = address;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }



    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address='" + address + '\'' +
                ", patientList=" + patientList +
                '}';
    }

    public void addPatient() {

        Patient patient=new Patient();
        System.out.println("Enter the patient name");
        String name=scanner.next();
        patient.setName(name);
        System.out.println("Enter the PatientID");
        int patientId=scanner.nextInt();
        patient.setPatientId(patientId);
        System.out.println("Enter the age");
        int age=scanner.nextInt();
        patient.setAge(age);
        System.out.println("Enter the phonenNumber");
        String phoneNumber=scanner.next();
        patient.setPhoneNumber(phoneNumber);
        System.out.println("Enter the Diagnosis");
        String diagnosis=scanner.next();
        patient.setDiagnosis(diagnosis);

        patientList.add(patient);

        System.out.println(patientList.toString());

    }

    public void addMultiplePatient(){

        System.out.println("Please enter the Choice");
        System.out.println("1.Add Patient, 2.Delete Patient, 3.Display Patient 4.editPatient, 5.exit");
        int choice=scanner.nextInt();
        do {
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    delPatient();
                    break;
                case 3:
                    displayPatient();
                    break;
                case 4:
                    editPatient();
                    break;
                default:
                    System.out.println("Wrong Choice Entered");
                    addMultiplePatient();
            }
        }while(choice!=5);

    }

    private void editPatient() {
        System.out.println("Please enter the ID ");
        int patientId=scanner.nextInt();
        patientList.stream().forEach(patient -> {
                    if (patientId == patient.getPatientId()) {
                        patient.editOldPatient();
                    }
                }
        );

    }

    private void displayPatient() {
        System.out.println("Please enter the ID ");
        int patientId=scanner.nextInt();
        patientList.stream().forEach(patient -> {
                    if (patientId == patient.getPatientId()) {
                        System.out.println(patient);
                    }
                }
                );
    }

    private void delPatient() {
        //stram
    }
}
