/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waitingRoom;

import clinic.SequentialDynamicLists;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import patients.Patient;

/**
 *
 * @author PC
 */
public class waitingRoomList implements SequentialDynamicLists<Patient> {
    Queue<Patient> waitingList;
    //queue porque elprimero que llego tiene que ser el primero en pasar a consulta
    //ya que guarda pacientes qeu estan en sala de espera

    public waitingRoomList() {
        this.waitingList = new LinkedList();
    }
    
    
    
    

    @Override
    public Patient get() {
        return waitingList.peek();
    }
        

    @Override
    public boolean remove() {
         return waitingList.poll()!=null;
    }

    @Override
    public boolean add(Patient item) {
        try{
            
        
      return  waitingList.add(item);
        }catch(IllegalStateException e){
            return false;
        }
    }
    

    @Override
    public Iterator getAll() {

        return waitingList.iterator();
    }
       

    @Override
    public int size() {
      return  waitingList.size();
    }
        

    @Override
    public boolean isEmpty() {
        return waitingList.isEmpty();
    }
        
    
    
}
