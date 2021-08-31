package com.example.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.emp.domain.AllocatedRoom;
import com.example.emp.domain.Results;
import com.example.emp.service.AllocatedRoomService;
import com.example.emp.service.ResultsService;


@Controller
public class LecturerController {

	@Autowired
    private AllocatedRoomService alloservice;
	@Autowired
    private ResultsService service;

    @GetMapping("/staff/result")
    public String viewResultsPage(Model model) {
        List<Results> result = service.listAll();
        model.addAttribute("result", result);	
        return "lec/index";
    }
    @GetMapping("/staff/timetable")
    public String viewTimetablePage(Model model) {
        List<AllocatedRoom> timetable = alloservice.listAll();
        model.addAttribute("timetable", timetable);	
        return "lec/allocatedRoom";
    }
   

 

   /* @RequestMapping("/hodChooseDate/{date}")
    public ModelAndView showTimetablePerDatePage(@PathVariable(name = "date") String date) {
        ModelAndView mav = new ModelAndView("admin/index");
        Unit unit = service.get(date);
        mav.addObject("unit", unit);
        return mav;
        
    }*/
}
