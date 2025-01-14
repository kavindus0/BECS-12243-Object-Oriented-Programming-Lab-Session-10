﻿public class HospitalSystem {
     
    public static void main(String[] args) {
        
        Patient p1 = new Patient("P001", "John", "Fever");
        Patient p2 = new Patient("P002", "Mary", "Flu");

        p1.displayDetails();
        p2.displayDetails();

        Doctor doc = new Doctor("D001", "Smith", "General Medicine");
        doc.treatPatient(p1);
        doc.treatPatient(p2);
    }
}
