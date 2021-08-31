package com.example.emp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.emp.domain.Department;
import com.example.emp.domain.User;
import com.example.emp.repository.DepartmentRepository;
import com.example.emp.repository.ResultsRepository;
import com.example.emp.repository.RoomRepository;
import com.example.emp.repository.UnitRepository;
import com.example.emp.repository.UserRepository;
import com.example.emp.service.DepartmentService;
import com.example.emp.service.UserService;


@Controller
public class UserController {
	
	 @Autowired
	    private UserService service;
	 @Autowired
	    private DepartmentService Deptservice;
	 //start of counting only
	 @Autowired
     private UserRepository repo;
	 @Autowired
     private UnitRepository Unitrepo;
	 @Autowired
     private RoomRepository Roomrepo;
	 @Autowired
     private ResultsRepository Rrepo;
	 @Autowired
     private DepartmentRepository Drepo;
	 //stop of counting only
	    @GetMapping("/")
	    public String viewHomePage(Model model, Authentication authentication) {
	    	 //start of counting only
	    	model.addAttribute("countUsers", repo.countUsers());
	    	model.addAttribute("countUnits", Unitrepo.countUnits());
	    	model.addAttribute("countRooms", Roomrepo.countRooms());
	    	model.addAttribute("countResults", Rrepo.countResults());
	    	model.addAttribute("countDepartments", Drepo.countDepartments());
	    	model.addAttribute("userName", authentication.getName());
	    	 //stop of counting only
	        return "admin/index";
	    }
	    @GetMapping("/allUsers")
	    public String viewUserPage(Model model) {
	        List<User> listuser = service.listAll();
	        model.addAttribute("listuser", listuser);	
	        return "admin/user";
	    }

	    @GetMapping("/add")
	    public String add(Model model) {
	        model.addAttribute("student", new User());
	        List<Department> listDepartment = Deptservice.listAll();
	        model.addAttribute("listDepartment", listDepartment);
	        return "admin/addEdit";
	    }

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveStudent(@ModelAttribute("student") User std) {
	        service.save(std);
	        return "redirect:/allUsers";
	    }

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("admin/editUser");
	        User std = service.get(id);
	        mav.addObject("student", std);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deletestudent(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/allUsers";
	    }
}