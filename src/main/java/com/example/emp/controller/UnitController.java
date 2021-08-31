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

import com.example.emp.domain.Department;
import com.example.emp.domain.Unit;
import com.example.emp.service.DepartmentService;
import com.example.emp.service.UnitService;



@Controller
public class UnitController {
	 @Autowired
	    private UnitService service;
	 @Autowired
	    private DepartmentService Departmentservice;

	    @GetMapping("/admin/unitView")
	    public String viewUnitPage(Model model) {
	        List<Unit> listunit = service.listAll();
	        model.addAttribute("listunit", listunit);	
	        return "admin/unit";
	    }

	    @GetMapping("/admin/addUnit")
	    public String addUnit(Model model) {
	        model.addAttribute("unit", new Unit());
	        List<Department> listedpartment = Departmentservice.listAll();
	        model.addAttribute("listedpartment", listedpartment);
	        return "admin/addEditUnit";
	    }

	    @RequestMapping(value = "/saveUnit", method = RequestMethod.POST)
	    public String saveUnit(@ModelAttribute("unit") Unit unit) {
	        service.save(unit);
	        return "redirect:/admin/unitView";
	    }

	    @RequestMapping("/editUnit/{id}")
	    public ModelAndView showEditUnitPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("admin/editUnit");
	        Unit unit = service.get(id);
	        mav.addObject("unit", unit);
	        return mav;
	        
	    }
	    @RequestMapping("/deleteUnit/{id}")
	    public String deleteUnit(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/admin/unitView";
	    }
}
