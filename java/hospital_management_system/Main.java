package hospital_management_system;

public class Main {
   public static void main(String[] args){
    Hospital hospital=new Hospital();
    Doctor d1 = new Doctor("D101", "John", "Cardiology", 3);
    Doctor d2 = new Doctor("D102", "Sarah", "Neurology", 2);

    hospital.addDoctor(d2);
    hospital.addDoctor(d1);
            Patient p1 = new Patient("P101", "Alice", 25, 3);
        Patient p2 = new Patient("P102", "Bob", 30, 4);
        Patient p3 = new Patient("P103", "David", 40, 2);

    hospital.allocatePatient(p1, "Cardiology");
    hospital.allocatePatient(p2,"Neurology");
    hospital.allocatePatient(p3, "Cardiology");

    hospital.printAllDoctors();
    hospital.dischargePatient(p3);
   } 
}
