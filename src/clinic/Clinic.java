/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

import appointments.Appointment;
import appointments.AppointmentList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import patients.Patient;
import patients.patienList;
import waitingRoom.waitingRoomList;

/**
 *
 * @author marii
 */
public class Clinic {

    private patienList patients;
    private AppointmentList appointments;
    private waitingRoomList waitingRoom;

    public Clinic() {

        this.patients = new patienList();
        this.appointments = new AppointmentList();
        this.waitingRoom = new waitingRoomList();
    }

    public boolean addPatient(Patient patient) {
        return patients.add(patient);
    }

    public Patient findPatient(String id) {
        return patients.get(id);
    }

    public boolean removePatient(String id) {
        Patient patient = patients.get(id);

        if (patient == null) {
            return false;
        }

        return patients.remove(patient);
    }

    public Iterator<Patient> getPatients() {
        return patients.getAll();
    }

    public boolean scheduleAppointment(Appointment appointment) {
        return appointments.add(appointment);
    }

    public Appointment findAppointment(String code) {
        return appointments.get(code);
    }

    public boolean rescheduleAppointment(
            String code,
            LocalDate newDate,
            LocalTime newTime) {

        Appointment appointment = appointments.get(code);

        if (appointment == null) {
            return false;
        }

        return false;
    }

    public boolean cancelAppointment(String code) {
        return appointments.remove(code);
    }

    public Iterator<Appointment> getAppointments() {
        return appointments.getAll();
    }

    public boolean checkInPatient(String patientId) {
        Patient patient = patients.get(patientId);

        if (patient == null) {
            return false;
        }

        if (isPatientWaiting(patientId)) {
            return false;
        }

        return waitingRoom.add(patient);
    }

    public Patient getNextPatient() {
        return waitingRoom.get();
    }

    public Patient attendNextPatient() {
        Patient patient = waitingRoom.get();

        if (patient == null) {
            return null;
        }

        waitingRoom.remove();
        return patient;
    }

    public int getWaitingPatientCount() {
        return waitingRoom.size();
    }

    public boolean isPatientWaiting(String patientId) {
        Iterator iterator = waitingRoom.getAll();

        while (iterator.hasNext()) {
            Patient patient = (Patient) iterator.next();

            if (patient.getId().equals(patientId)) {
                return true;
            }
        }

        return false;
    }
}
