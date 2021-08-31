package com.example.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.example.emp.domain.Results;
import com.example.emp.domain.Unit;
import com.example.emp.domain.User;
import com.example.emp.service.ResultsService;
import com.example.emp.service.UnitService;
import com.example.emp.service.UserService;

@Controller
public class ResultsController {

	 @Autowired
	    private ResultsService service;
	 @Autowired
	    private UserService Userservice;

	 @Autowired
	    private UnitService Unitservice;

	    @GetMapping("/admin/stuResult")
	    public String viewResultsPage(Model model) {
	        List<Results> listresults = service.listAll();
	        model.addAttribute("listresults", listresults);	
	        return "admin/result";
	    }

	    @GetMapping("/admin/addResult")
	    public String addResults(Model model) {
	        model.addAttribute("results", new Results());
	        List<User> listRegno = Userservice.listAll();
	        model.addAttribute("listRegno", listRegno);
	        List<Unit> listUnit = Unitservice.listAll();
	        model.addAttribute("listUnit", listUnit);
	        return "admin/addEditResult";
	    }

	    @RequestMapping(value = "/saveResult", method = RequestMethod.POST)
	    public String saveResult(@ModelAttribute("result") Results result) {
	        service.save(result);
	        return "redirect:/admin/stuResult";
	    }
	    @RequestMapping(value = "/saveLecEdit", method = RequestMethod.POST)
	    public String saveLecedit(@ModelAttribute("result") Results result) {
	        service.save(result);
	        return "redirect:/staff/result";
	    }

	    @RequestMapping("/editResult/{id}")
	    public ModelAndView showEditResultPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("lec/lecEditMarks");
	        Results results = service.get(id);
	        mav.addObject("results", results);
	        return mav;
	        
	    }
	    @RequestMapping("/lecEditResult/{id}")
	    public ModelAndView staffEditResultPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("admin/editResults");
	        Results results = service.get(id);
	        mav.addObject("results", results);
	        return mav;
	        
	    }
	    @RequestMapping("/deleteResult/{id}")
	    public String deleteResult(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/admin/stuResult";
	    }
}
