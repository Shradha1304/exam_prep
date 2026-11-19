package hospital_management_system;
import java.util.ArrayList;

public class Doctor {
    private String doctorID;
    private String name;
    private String Specialisation;
    private int maxPatients;
    ArrayList<Patient> patients;

    public Doctor(String doctorID,String name,String Specialisation,int maxPatients){
        this.doctorID=doctorID;
        this.name=name;
        this.Specialisation=Specialisation;
        this.maxPatients=maxPatients;
        this.patients = new ArrayList<>();
    }

    public String getDoctorID(){
        return this.doctorID;
    }
    public String getName(){
        return this.name;
    }

    public String getSpecialization(){
        return this.Specialisation;
    }

    public int getMaxPatients(){
        return this.maxPatients;
    }

    public ArrayList<Patient> getAssignedPatients(){
        return this.patients;
    } 

    public boolean addPatient(Patient patient){
        if (patients.size()>=this.maxPatients){
            throw new IllegalArgumentException("max limit reached");
        }
        if (patients.contains(patient)){
            return false;
    }

        patients.add(patient);
        return true;
    }
public void removePatient(Patient patient){
    patients.remove(patient);
}

}
