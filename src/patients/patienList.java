/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patients;

import clinic.KeyDynamicsList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author PC
 */
public class patienList implements KeyDynamicsList<Patient,String> {
    private HashMap<String, Patient> patients;

   //preguntar por el contructor

    @Override
    public Patient get(String id) {
        if(!patients.containsKey(id)) return null;
     return patients.get(id);  
    }

    public boolean remove(Patient id) {
        return patients.remove(id)!=null;
    }

    @Override
    public boolean add(Patient item) {
        if(patients.containsKey(item.getId())) return false;
        return patients.put(item.getId(), item)== null;
    
    }
    @Override
    public Iterator getAll() {
       if( patients.isEmpty()) return null; 
      return  patients.values().iterator();
        //esto regresa todas los objetos hashet        
        
    }

    @Override
    public int size() {
       return patients.size();
        
        
    }

    @Override
    public boolean isEmpty() {
    return patients.isEmpty();
    }
        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
