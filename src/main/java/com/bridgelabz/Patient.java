package com.bridgelabz;

import java.util.Scanner;

public class Patient extends Person{
    static Scanner scanner=new Scanner(System.in);
    private int patientId;
    private String diagnosis;
   public Patient(){

   }
    public Patient(String name, String phoneNumber, int age, int patientId, String diagnosis) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", patientId=" + patientId +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }

    public void editOldPatient() {
        System.out.println("Enter the patient name");
        String name=scanner.next();
        setName(name);
        System.out.println("Enter the age");
        int age=scanner.nextInt();
        setAge(age);
        System.out.println("Enter the phonenNumber");
        String phoneNumber=scanner.next();
        setPhoneNumber(phoneNumber);
        System.out.println("Enter the Diagnosis");
        String diagnosis=scanner.next();
        setDiagnosis(diagnosis);

    }
}
