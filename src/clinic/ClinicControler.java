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

    public boolean scheduleAppointment(Appointment appo){
       boolean status = clinic.scheduleAppointment(appo);
       if(status){
           view.showMessage("Cita agendada correctamente");          
       }else{
           view.showError("Cita no se pudo agendar correctamente");
           
    }
    }

    public Appointment findAppointment(String code)
    { Appointment appo= clinic.findAppointment(code);
     if (appo == null){
         view.showError("No se encuentra una cita con el codigo: "+ code);
         view.clear();
     }
         view.showData(appo);
         return appo;
     
      
        
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime){
        
        boolean status=clinic.rescheduleAppointment(code, newDate, newTime);
    if (status){
        view.showMessage("Cita correctamente reagendada");
    }else{
        view.showError("No se pudo reagendar la cita");
    }
        
     return status;    
      
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
