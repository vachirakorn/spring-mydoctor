package com.mydoctor.controller;



import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mydoctor.service.PharmacistServiceImpl;
import com.mydoctor.service.PrescriptionServiceImpl;



@Controller
//@SessionAttributes("username")
public class PrescriptionController
{
		@Autowired
		private PrescriptionServiceImpl prescriptionServiceImpl;

//		@RequestMapping(value="/pharmacist-profile",method=RequestMethod.GET)
//		public String profile(ModelMap model) throws SQLException 
//		{
//				model.addAttribute("pharmacist",pharmacistServiceImpl.retrievePharmacist((String)model.get("username")));
//				return "pharmacistProfile";
//		}
		
		
//		@RequestMapping(value="/welocomePharmacist",method=RequestMethod.GET)
//		public String welcomePharmacist(ModelMap model) throws SQLException 
//		{				
//				return "welcomePharmacist";
//		}
		
//		@RequestMapping(value="/view_prescription",method=RequestMethod.POST)
//		public String showPrescription(ModelMap model) throws SQLException 
//		{
//				System.out.println("");
//				return "welcomeNurse";
//		}
		
		
		
		
		
		
}
