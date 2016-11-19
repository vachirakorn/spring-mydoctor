package com.mydoctor.controller;



import java.beans.PropertyEditorSupport;
import java.util.Calendar;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.mydoctor.model.Prescription;
import com.mydoctor.model.Schedule;
import com.mydoctor.service.DoctorServiceImpl;
import com.mydoctor.service.PrescriptionServiceImpl;



@Controller
@SessionAttributes("username")
public class DoctorController
{
		@Autowired
		private DoctorServiceImpl doctorServiceImpl;
		private PrescriptionServiceImpl prescriptionServiceImpl;

		@RequestMapping(value="/doctor-profile",method=RequestMethod.GET)
		public String profile(ModelMap model) throws SQLException 
		{
				System.out.println((String)model.get("username"));
				model.addAttribute("doctor",doctorServiceImpl.retrieveDoctor((String)model.get("username")));
				return "doctorProfile";
		}
		
		@RequestMapping(value="/list-schedule",method=RequestMethod.GET)
		public String showDoctorSchedule(ModelMap model) throws SQLException 
		{
				System.out.println((String)model.get("username"));
				model.addAttribute("schedules",doctorServiceImpl.retriveAllSchedules((String)model.get("username")));
				
				return "schedules";
		}
		@RequestMapping(value="/add-schedule",method=RequestMethod.GET)
		public String showAddSchedulePage(ModelMap model) throws SQLException 
		{
				System.out.println((String)model.get("username"));
				model.addAttribute("schedule",new Schedule());
				return "addSchedule";
		}
		
		@InitBinder
		public void binder(WebDataBinder binder) {
			binder.registerCustomEditor(Timestamp.class,
		    new PropertyEditorSupport() {
		        public void setAsText(String value) {
		            try {
		            	DateFormat df = new SimpleDateFormat("E dd-MM-YYYY HH:mm");
		                Date parsedDate = df.parse(value);
		                Calendar c = Calendar.getInstance(); 
		                c.setTime(parsedDate); 
		                c.add(Calendar.DATE, -7);
		                c.add(Calendar.MONTH, -1);
		                c.add(Calendar.YEAR, 1);
		                parsedDate = c.getTime();
		               System.out.println(df.format(parsedDate));
		                setValue(new Timestamp(parsedDate.getTime()));
		            } catch (ParseException e) {
		                setValue(null);
		            }
		        }
		    });
		}
		
		@RequestMapping(value="/add-schedule",method=RequestMethod.POST)
		public String addSchedule(ModelMap model,@Valid Schedule schedule, BindingResult result) throws SQLException 
		{
				System.out.println("[Request]" + schedule.toString());
				
				if(result.hasErrors()){
					return "addSchedule";
				}
				int updateCount = doctorServiceImpl.saveSchedule((String)model.get("username"), schedule);
				if(updateCount > 0){
					model.clear();
					return "redirect:/list-schedule";
				} 
				
				return "addSchedule";
				
		}
		
		
		
		
		@RequestMapping(value="/create_prescription",method=RequestMethod.GET)
		public String showCreatePrescriptionPage(ModelMap model)
		{
			
			Prescription prescription = new Prescription();
			model.addAttribute("prescription", prescription);
			return "createPrescription";
		}
		
		
		@RequestMapping(value="/create_prescription",method=RequestMethod.POST)
		public String addPrescription(ModelMap model, @Valid Prescription prescription, BindingResult result) throws SQLException
		{
				
				if(result.hasErrors()){
					return "prescription";
				}
				// prescriptionId, medicineId, instruction, amount
				String medicineId = prescription.getMedicineId();
				//String medicine = prescription.
				String instruction = prescription.getInstruction();
				String amount = prescription.getAmount();
//				boolean isValidUser = loginServiceImpl.isValidUser(username, password);
//				if(isValidUser)
//				{
//					String role = loginServiceImpl.getUserRole(username);
//					model.put("username",username);
//					model.remove("loginBean");
//						if("patient".equals(role)){
//							return "welcomePatient";
//						}
//						else if("doctor".equals(role)){
//							return "welcomeDoctor";
//						}
//						else if("staff".equals(role)){
//							return "welcomeStaff";
//						}
//						else if("nurse".equals(role)){
//							return "welcomeNurse";
//						}
//						else if("pharmacist".equals(role)){
//							return "welcomePharmacist";
//						}
//				}
//				else
//				{
//						model.put("message", "Invalid credentials!!");
//						return "login";
//				}

				
				return "prescription";
		}
		
		
		
}
