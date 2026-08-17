/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author PC
 */
public class ClinicControler {
    
    private clinic clinic;
    private views view;
    private static ClinicControler controller;

    public clinic getClinic() {
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
       this.clinic=new Clinic();
       this.view=view;
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
