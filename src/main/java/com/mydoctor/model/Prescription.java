package com.mydoctor.model;

public class Prescription  {
	private String prescriptionId, medicineId, instruction, amount;
	private Medicine medicine;
	
	public Prescription() {
		
	}
	
	public Prescription(String prescriptionId,String medicineId,String medicine,String instruction, String amount) {
		this.prescriptionId = prescriptionId;
		this.medicineId = medicineId;
		this.instruction = instruction;
		this.amount = amount;
	}

	public String getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}


}