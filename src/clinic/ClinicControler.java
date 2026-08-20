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
import waitingRoom.waitingRoomList;

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
      if( clinic.addPatient(patient)){
          view.showMessage("Paciente agregado correctamente");
      }else{
          view.showError("No se pudo agregar correctamente");
      }
      

       
    }

    public Patient findPatient(String id, Patient paciente){
       Patient patient = clinic.findPatient(id);
       if(patient==null){
           view.showError("Paciente no encontrado");
       }else{
        view.showMessage("nombre: " + paciente.getFullName()+ 
                "/nl Numero de telefono: "+ paciente.getPhone() +
                 "/nl Edad del paciente: " + paciente.getAge());
      
       }
        return patient;
    }

    public void removePatient(String id){
       if(  clinic.removePatient(id)){
           view.showMessage("Paciente eliminado correctamente");
       }
         
    }

    public Iterator<Patient> getPatients(){
        return clinic.getPatients();
        
    }

    public boolean scheduleAppointment(Appointment appo){
       boolean status = clinic.scheduleAppointment(appo);
       if(status){
           view.showMessage("Cita agendada correctamente");          
       }else{
           view.showError("Cita no se pudo agendar correctamente");
           
    }
       return status;
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
        boolean cita = clinic.cancelAppointment(code);
        if (cita){
            view.showMessage("Cita cancela exitosamente");
            
        }else{
            view.showError("No se pudo cancelar cita correctamente");
        }
        return cita;
    }

    public Iterator<Appointment> getAppointments(){
        
        
        return clinic.getAppointments();
    }

    public boolean checkInPatient(String patientId){
        boolean chequeo = clinic.checkInPatient(patientId);
        if(chequeo){
            view.showMessage("Nombre del paciente: " + clinic.getPatients());
            
        }
        return false;
    }

    public Patient getNextPatient(){
        
        return clinic.getNextPatient();
    }

    public Patient attendNextPatient(){
        return clinic.attendNextPatient();
    }

    public int getWaitingPatientCount(){
        return clinic.getWaitingPatientCount();
    }

    public boolean isPatientWaiting(String patientId){
      
    return  clinic.isPatientWaiting(patientId);
            
        
   
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
