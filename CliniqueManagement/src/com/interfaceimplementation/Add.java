package com.interfaceimplementation;

import java.util.List;



import com.models.Doctor;
import com.models.Patient;

public interface Add
{
List<Patient> addPatientDetail();
List<Patient> editPatientDetail(List<Patient> patientList);
List<Patient> deletePatientDetail(List<Patient> patientList);
List<Doctor> addDoctorDetail();
List<Doctor> editDoctorDetail(List<Doctor> doctorList);
List<Doctor> deleteDoctorDetail(List<Doctor> doctorList);
void fixingAppointmentForPatient(Doctor doctor,Patient patient);
void savePatientDetail(List<Patient> patientList);
void saveDoctorDetail(List<Doctor> doctorList);
}
