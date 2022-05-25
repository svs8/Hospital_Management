package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HospitalOperations {
    static Scanner scanner = new Scanner(System.in);

    static Map<Integer, Hospital> hospitalMap = new HashMap<>();

    public static void addMultipleHospitals() {
        int choice = 0;
        do {
            System.out.println("Please enter the Choice");
            System.out.println("1.Add Hospital, 2.Delete Hospital, 3.Display Hospital 4.edit Hospital, 5.Add/edit/delete/display patient 6.exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addHospital();
                    break;
                case 2:
                    deleteHospital();
                    break;
                case 3:
                    displayHospital();
                    break;
                case 4:
                    editHospital();
                    break;
                case 5:
                    updatePatients();
                case 6:
                    break;

                default:
                    System.out.println("Wrong Choice Entered");
                    addMultipleHospitals();
            }
        } while (choice != 6);

    }

    private static void updatePatients() {
        System.out.println("Please enter the Hospital ID ");
        Integer hospitalId = scanner.nextInt();
        Hospital hospital = hospitalMap.get(hospitalId);
        hospital.addMultiplePatient();

    }

    private static void editHospital() {
        System.out.println("Please enter the Hospital ID ");
        Integer hospitalId = scanner.nextInt();
        Hospital hospital = hospitalMap.get(hospitalId);
        hospital.editOldHospital();

    }

    private static void displayHospital() {
        System.out.println("Please enter the Hospital ID ");
        Integer hospitalId = scanner.nextInt();
        Hospital hospital=hospitalMap.get(hospitalId);

        if(hospital==null){
            System.out.println("Hospital not present");
        }else{
            System.out.println(hospital);
        }
    }

    private static void deleteHospital() {
        System.out.println("Please enter the Hospital ID ");
        Integer hospitalId = scanner.nextInt();
        hospitalMap.remove(hospitalId);

    }

    private static void addHospital() {
        Hospital hospital = new Hospital();
        System.out.println("Enter the Hospital ID");
        Integer hospitalId = scanner.nextInt();
        hospital.setHospitalId(hospitalId);
        System.out.println("Enter the Hospital name");
        String hospitalName = scanner.next();
        hospital.setHospitalName(hospitalName);
        System.out.println("Enter the Hospital Address");
        String hospitalAddress = scanner.next();
        hospital.setAddress(hospitalAddress);

        hospitalMap.put(hospital.getHospitalId(), hospital);
    }

    public static void main(String[] args) {

        addMultipleHospitals();
    }


}
