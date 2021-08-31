package com.example.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.emp.domain.AllocatedRoom;
import com.example.emp.domain.SitAllocation;
import com.example.emp.service.AllocatedRoomService;
import com.example.emp.service.SitAllocationService;

@Controller
public class hodController {

	@Autowired
    private AllocatedRoomService alloservice;
	@Autowired
    private SitAllocationService sitservice;

    @GetMapping("/hod/timetable")
    public String viewTimetablePage(Model model) {
        List<AllocatedRoom> timetable = alloservice.listAll();
        model.addAttribute("timetable", timetable);	
        return "HOD/index";
    }
    @GetMapping("/hod/sitAllocation")
    public String viewSitPage(Model model) {
        List<SitAllocation> allocation = sitservice.listAll();
        model.addAttribute("allocation", allocation);	
        return "HOD/allocatedRoom";
    }

 

   /* @RequestMapping("/hodChooseDate/{date}")
    public ModelAndView showTimetablePerDatePage(@PathVariable(name = "date") String date) {
        ModelAndView mav = new ModelAndView("admin/index");
        Unit unit = service.get(date);
        mav.addObject("unit", unit);
        return mav;
        
    }*/
  
}
