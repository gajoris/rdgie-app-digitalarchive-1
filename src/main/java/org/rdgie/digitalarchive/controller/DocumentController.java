package org.rdgie.digitalarchive.controller;

import java.util.Map;

import org.rdgie.digitalarchive.domain.Document;
import org.rdgie.digitalarchive.user.service.DocumentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class DocumentController {
	@Autowired
	private DocumentServices documentService;

	@RequestMapping(value = "/savereport1", method = RequestMethod.GET)
	public String registration(Map<String, Object> model) {
		model.put("sampleDocument", new Document());
		return "savereport";
	}
	@RequestMapping(value ="/savereportsuccess", method = RequestMethod.POST)
	public String postDocument(@ModelAttribute("sampleDocument") Document document) {

		System.out.println("=========="+document.getFirstname1());
		
		documentService.addDocument(document);
		
		return "savedsuccess";

	}

	
	
}
