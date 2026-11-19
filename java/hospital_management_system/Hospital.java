package hospital_management_system;
import java.util.ArrayList;
public class Hospital {

    ArrayList<Doctor> doctors;

    public Hospital(){
        doctors=new ArrayList<>();
    }

    public boolean addDoctor(Doctor doctor){
        for (Doctor d: doctors){
            if (d.getDoctorID().equals(doctor.getDoctorID())){
                return false;
            }
        }
        doctors.add(doctor);
        return true;
    }

    public void printAllDoctors(){
        for (int i=0;i<doctors.size();i++){
            System.out.println("Doctor id : " + doctors.get(i).getDoctorID());
            System.out.println("Doctor name : " + doctors.get(i).getName());
            System.out.println("Doctor Specialization : " + doctors.get(i).getSpecialization());
            System.out.println("Patients assigned : " + doctors.get(i).getAssignedPatients());
            System.out.println("*****************************");
        }
    }

    public Doctor findDoctor(String DoctorID){
        for (int i =0;i<doctors.size();i++){
            if (doctors.get(i).getDoctorID().equals(DoctorID)){
                return doctors.get(i);
            }
        }
        return null;
    }

    public boolean allocatePatient(Patient patient, String specialisation){
        ArrayList<Doctor> availabledoc;
        availabledoc=new ArrayList<>();
        for (Doctor d: doctors){
            if ((d.getSpecialization().equals(specialisation)) && (d.getAssignedPatients().size()<d.getMaxPatients())){
                 availabledoc.add(d);              
            }

        }
        Doctor docToAssign;
        if (availabledoc.size()>1){
            Doctor min_patients=availabledoc.get(0);
            for (int i =1 ; i<availabledoc.size();i++){
                if (availabledoc.get(i).getAssignedPatients().size()<min_patients.getAssignedPatients().size()){
                    min_patients=availabledoc.get(i);
                }
            }
            docToAssign=min_patients;
            return docToAssign.addPatient(patient);
        }
        if (availabledoc.size()==1) {
            docToAssign=availabledoc.get(0);
            return docToAssign.addPatient(patient);
        } else {
            return false;
        }
    }

    public void dischargePatient(Patient patient){
        for (Doctor d : doctors){
            if (d.getAssignedPatients().contains(patient)){
                d.removePatient(patient);
                return;
            }
        }

        throw new IllegalArgumentException("patient not found in any doctos list");

    }





}
