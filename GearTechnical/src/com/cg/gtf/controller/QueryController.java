package com.cg.gtf.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.gtf.dto.Client;
import com.cg.gtf.service.IQueryService;

@Controller
public class QueryController {

	@Autowired
	IQueryService queryMasterService;

	@RequestMapping(value="all")
	public String getAll() {
		return "search";
	}

	@RequestMapping(value="update")
	public ModelAndView updateClient(@ModelAttribute("uu") Client client, Map<String,Object> model){

		Client newClient = queryMasterService.searchId(client.getQueryId());
		int id =client.getQueryId();
		if(newClient==null|| newClient.getQueryId()==0){
			return new ModelAndView("failure","queId",id);
		}
		else{
			Client clientOne =queryMasterService.searchId(client.getQueryId());
			clientOne.setQueryId(client.getQueryId());
			List<String> answeredBy = new ArrayList<String>();
			answeredBy.add("Uma");
			answeredBy.add("Rahul");
			answeredBy.add("Kavita");
			answeredBy.add("Hema");
			model.put("answered", answeredBy);
			model.put("temp", clientOne);			
			return new ModelAndView("answer");
		}
	}

	@RequestMapping(value="updated")
	public ModelAndView updated(@ModelAttribute("uu") Client client){
		int id=client.getQueryId();
		queryMasterService.updateClient(client);
		return new ModelAndView("answerSuccess","queId",id);

	}

}	

