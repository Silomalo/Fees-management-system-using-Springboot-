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

import com.example.emp.domain.AllocatedRoom;
import com.example.emp.domain.Room;
import com.example.emp.domain.Unit;
import com.example.emp.service.AllocatedRoomService;
import com.example.emp.service.RoomService;
import com.example.emp.service.UnitService;


@Controller
public class AllocatedRoomController {

	 @Autowired
	    private AllocatedRoomService service;
	 @Autowired
	    private RoomService Roomservice;
	 @Autowired
	    private UnitService Unitservice;

	    @GetMapping("/admin/allocatedRooms")
	    public String viewHomePage(Model model) {
	        List<AllocatedRoom> listallocatedroom = service.listAll();
	        model.addAttribute("listallocatedroom", listallocatedroom);	
	        return "admin/allocatedRoom";
	    }

	    @GetMapping("/admin/addEditAllocatedRooms")
	    public String addallocatedRoom(Model model) {
	        model.addAttribute("allocatedRoom", new AllocatedRoom());
	        List<Room> listroom = Roomservice.listAll();
	        model.addAttribute("listroom", listroom);
	        List<Unit> listUnit = Unitservice.listAll();
	        model.addAttribute("listUnit", listUnit);
	        return "admin/addEditAllocatedRoom";
	    }

	    @RequestMapping(value = "/saveAllocatedRooms", method = RequestMethod.POST)
	    public String saveallocatedRoom(@ModelAttribute("allocatedRoom") AllocatedRoom std) {
	        service.save(std);
	        return "redirect:/admin/allocatedRooms";
	    }

	    @RequestMapping("/editAllocatedRoom/{id}")
	    public ModelAndView showEditAllocatedRoomPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("admin/editAllocatedRoom");
	        AllocatedRoom std = service.get(id);
	        mav.addObject("allocatedRoom", std);
	        return mav;
	        
	    }
	    @RequestMapping("/deleteAllocatedRoom/{id}")
	    public String deleteAlloRoom(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/admin/allocatedRooms";
	    }
}
