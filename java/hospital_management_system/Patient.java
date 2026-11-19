package hospital_management_system;
import java.util.Objects;

class Patient{
    private String patientID;
    private String name;
    private int age;
    private int severity;

    Patient(String patientID,String name,int age,int severity){
        ValidatePatientID(patientID);
        ValidateName(name);
        ValidateAge(age);
        ValidateSeverity(severity);
        this.patientID=patientID;
        this.name=name;
        this.age=age;
        this.severity=severity;
    }

    public boolean ValidatePatientID(String patientID){
        if (patientID==null||patientID.length()==0){

            throw new IllegalArgumentException("patient id must not be null");
        }

        return true;
    }

    public boolean ValidateName(String name){
        if (name.length()<3){
            throw new IllegalArgumentException("name must be more than 3 letters");
        }
        return true;
    }

    public boolean ValidateAge(int age){
        if (age<0 || age>120){
            throw new IllegalArgumentException("age must be between 0 to 120");
        }

        return true;
    }

    public boolean ValidateSeverity(int severity){
        if(severity<1 || severity>5){
            throw new IllegalArgumentException("severity must be between 1 to 5");
        }

        return true;
    }

    public String getPatientID(){
        return this.patientID;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getSeverity(){
        return this.severity;
    }

    public void setPatientID(String patientID){
        ValidatePatientID(patientID);
        this.patientID=patientID;
    }

    public void setName(String name){
        ValidateName(name);
        this.name=name;
    }

    public void setAge(int age){
        ValidateAge(age);
        this.age=age;
    }

    public void setSeverity(int severity){
        ValidateSeverity(severity);
        this.severity=severity;
    }


    @Override 
    public String toString(){
        return "Patient details are PatientID : " + patientID + " name : "+ name+" Age : " + age +" Severity : " + severity;
    }

    @Override 
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
        return false;
    }

        Patient other = (Patient) obj;
        return this.patientID.equals(other.patientID);
    }

    @Override
    public int hashCode(){
        return Objects.hash(patientID);
    }

}