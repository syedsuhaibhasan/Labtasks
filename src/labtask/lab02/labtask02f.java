package labtask.lab02;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class labtask02f {
    public static void main(String[] args) {
        hospital obj = new hospital();
        
        obj.insert(101, "Ahmed Khan", 251016, "Fractured Leg", hospital.patient.Severity.MEDIUM);
        obj.insert(102, "Fatima Ali", 251016, "Common Cold", hospital.patient.Severity.LOW);
        obj.insert(103, "Bilal Shah", 251017, "Severe Chest Pain", hospital.patient.Severity.CRITICAL);
        obj.insert(104, "Aisha Begum", 251017, "Asthma Attack", hospital.patient.Severity.HIGH);
        obj.insert(105, "Zainab Raza", 251015, "Minor Burn", hospital.patient.Severity.MEDIUM);
        obj.insert(106, "Usman Tariq", 251018, "High Fever", hospital.patient.Severity.HIGH);
        
        obj.displayRecords();
    }
}
