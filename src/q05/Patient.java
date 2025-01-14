﻿public class Patient {
     
    private String patientID;
    private String name;
    private String disease;

    public Patient(String patientID, String name, String disease) {
        this.patientID = patientID;
        this.name = name;
        this.disease = disease;
    }

    public void displayDetails() {
        System.out.println("Patient ID: " + patientID + ", Name: " + name + ", Disease: " + disease);
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }
}
