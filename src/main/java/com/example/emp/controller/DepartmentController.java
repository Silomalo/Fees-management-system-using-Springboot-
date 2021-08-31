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
import com.example.emp.service.DepartmentService;

@Controller
public class DepartmentController {
	 @Autowired
	    private DepartmentService service;

	    @GetMapping("/department")
	    public String viewDeptPage(Model model) {
	        List<Department> listedpartment = service.listAll();
	        model.addAttribute("listedpartment", listedpartment);	
	        return "admin/department";
	    }

	    @GetMapping("/addDept")
	    public String addDept(Model model) {
	        model.addAttribute("department", new Department());
	        return "admin/addEditDept";
	    }

	    @RequestMapping(value = "/saveDept", method = RequestMethod.POST)
	    public String saveDepartment(@ModelAttribute("department") Department dpt) {
	        service.save(dpt);
	        return "redirect:/department";
	    }

	    @RequestMapping("/editDept/{id}")
	    public ModelAndView showEditDepartmentPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("admin/addEditDept");
	        Department dpt = service.get(id);
	        mav.addObject("department", dpt);
	        return mav;
	        
	    }
	    @RequestMapping("/deleteDept/{id}")
	    public String deleteDepartment(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/department";
	    }

}
