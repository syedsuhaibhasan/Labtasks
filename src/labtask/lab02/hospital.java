package labtask.lab02;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class hospital {
    int size = 0;
    patient first = null;
    patient last = null;

    hospital() {
        this.size = 0;
    }

    class patient {
        patient next;
        patient prev;
        int p_id;
        String p_name;
        // admission date = YYMMDD
        long p_admission_date;
        String p_type_of_illnesss;

        enum Severity {
            CRITICAL(4), HIGH(3), MEDIUM(2), LOW(1);

            private final int value;
            Severity(int v) { value = v; }
            public int getLevel() { return value; }
        }
        Severity sev;

        public patient(int p_id, String p_name, long p_admission_date, String p_type_of_illnesss, Severity sev) {
            this.p_id = p_id;
            this.p_name = p_name;
            this.p_admission_date = p_admission_date;
            this.p_type_of_illnesss = p_type_of_illnesss;
            this.sev = sev;
            this.next = null;
            this.prev = null;
        }
    } // END OF PATIENT CLASS

    public void insert(int p_id, String p_name, long p_admission_date, String p_type_of_illnesss, patient.Severity sev) {
        patient newPatient = new patient(p_id, p_name, p_admission_date, p_type_of_illnesss, sev);
        size++;

   
        if (first == null) {
            first = newPatient;
            last = newPatient;
            return;
        }
        
        //if new patient sevrity is high then that patient is prioritized
        if (newPatient.sev.getLevel() > first.sev.getLevel()) {
            newPatient.next = first;
            first.prev = newPatient;
            first = newPatient;
            return;
        }

        patient temp = first;
        //while there is a next node AND the new patient has a lower or equal priority
        while (temp.next != null &&
               (newPatient.sev.getLevel() < temp.next.sev.getLevel() ||
               (newPatient.sev.getLevel() == temp.next.sev.getLevel() &&
                newPatient.p_admission_date >= temp.next.p_admission_date))) 
        {
            temp = temp.next;
        }
        
        if (temp.next != null) {
            newPatient.next = temp.next;
            temp.next.prev = newPatient;
        } else {
            // If temp.next is null
            last = newPatient;
        }
        
        temp.next = newPatient;
        newPatient.prev = temp;
    }

    public void displayRecords() {
        patient temp = first;
        int count = 0;
        
        while (temp != null) {
            count++;
            System.out.println("******** Patient " + (count) + " ************");
            System.out.println("Patient id: " + temp.p_id);
            System.out.println("Patient Name: " + temp.p_name);
            System.out.println("Patient admission date: " + temp.p_admission_date);
            System.out.println("Patient illness: " + temp.p_type_of_illnesss);
            System.out.println("Patient severity: " + temp.sev + "\n");
            temp = temp.next;
        }
        if (count == 0) {
            System.out.println("No patients in the list.");
        }
    }
}