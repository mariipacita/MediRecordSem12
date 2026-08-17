/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

import appointments.Appointment;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import patients.Patient;

/**
 *
 * @author PC
 */
public class ClinicControler {
    
    private Clinic clinic;
    private views view;
    private static ClinicControler controller;
    

    public Clinic getClinic() {
        return clinic;
    }

    public views getView() {
        return view;
    }

    public static ClinicControler getController() {
        return controller;
    }

    public void setView(views view) {
        this.view = view;
    }  
    
    public static ClinicControler getInstance(views view){
        
        if (controller==null)
            controller=new ClinicControler(view);
        return controller;
    }
    
   private ClinicControler(views view){
       
       
       this.clinic= new Clinic();
       this.view=view;
   }
    
   public void addPatient(Patient patient){
       

       
    }

    public void findPatient(String id){
        
    }

    public void removePatient(String id){
        
    }

    public Iterator<Patient> getPatients(){
        
    }

    public boolean scheduleAppointment(Appointment appointment){
        
        
        return false;
    }

    public Appointment findAppointment(String code){
        return null;
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime){
    if (clinic.rescheduleAppointment(code, newDate, newTime)){
        view.showMessage("Cita correctamente reagendada");
    }else{
        view.showError("No se pudo reagendar la cita");
    }
        
         
      
    }

    public boolean cancelAppointment(String code){
        return false;
    }

    public Iterator<Appointment> getAppointments(){
        return null;
    }

    public boolean checkInPatient(String patientId){
        //agregarpaciente a la lista de espera
        return false;
    }

    public Patient getNextPatient(){
        return null;
    }

    public Patient attendNextPatient(){
        return null;
    }

    public int getWaitingPatientCount(){
        return 0;
    }

    public boolean isPatientWaiting(String patientId){
        return false;
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
