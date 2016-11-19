package com.mydoctor.service;


import java.sql.SQLException;

import com.mydoctor.dao.PharmacistDaoImpl;
import com.mydoctor.model.Pharmacist;
import com.mydoctor.model.Prescription;


public class PharmacistServiceImpl
{
		
		private PharmacistDaoImpl pharmacistDaoImpl;

		public PharmacistDaoImpl getPharmacistDaoImpl() {
			return pharmacistDaoImpl;
		}

		public void setPharmacistDaoImpl(PharmacistDaoImpl pharmacistDaoImpl) {
			this.pharmacistDaoImpl = pharmacistDaoImpl;
		}
		
		public Pharmacist retrievePharmacist(String username)throws SQLException{
			return pharmacistDaoImpl.retrievePharmacist(username);
		}
		
		public Prescription createPrescription(String prescriptionId,String medicineId,String medicine,String instruction, String amount) {
			return new Prescription(prescriptionId, medicineId, medicine, instruction, amount);
		}
		
		
		
		

}