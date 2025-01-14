﻿public class Doctor {
     
    private String doctorID;
    private String name;
    private String specialization;

    public Doctor(String doctorID, String name, String specialization) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
    }

    public void treatPatient(Patient patient) {
        System.out.println("Dr. " + name + " is treating " + patient.getName() + " for " + patient.getDisease());
    }
}
