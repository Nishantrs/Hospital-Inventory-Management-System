/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrimaghosh
 */
public class Patient {

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_address() {
        return patient_address;
    }

    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    public String getPatient_uname() {
        return patient_uname;
    }

    public void setPatient_uname(String patient_uname) {
        this.patient_uname = patient_uname;
    }

    public String getPatient_pass() {
        return patient_pass;
    }

    public void setPatient_pass(String patient_pass) {
        this.patient_pass = patient_pass;
    }

    public String getPatient_email() {
        return patient_email;
    }

    public void setPatient_email(String patient_email) {
        this.patient_email = patient_email;
    }

    public int getPatients_doctor() {
        return patients_doctor;
    }

    public void setPatients_doctor(int patients_doctor) {
        this.patients_doctor = patients_doctor;
    }
    
    int pid;
    
   String  patient_name;

    String patient_address;
    String patient_uname;
    String patient_pass;
    String patient_email;
    int patients_doctor;
    
   }
