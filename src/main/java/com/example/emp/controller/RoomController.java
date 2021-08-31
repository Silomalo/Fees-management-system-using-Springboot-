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

import com.example.emp.domain.Room;
import com.example.emp.service.RoomService;



@Controller
public class RoomController {
	 @Autowired
	    private RoomService service;

	    @GetMapping("/admin/room")
	    public String viewRoomPage(Model model) {
	        List<Room> listrooms = service.listAll();
	        model.addAttribute("listrooms", listrooms);	
	        return "admin/room";
	    }

	    @GetMapping("/admin/addEditRoom")
	    public String addRoom(Model model) {
	        model.addAttribute("room", new Room());
	        return "admin/addEditRoom";
	    }

	    @RequestMapping(value = "/saveRoom", method = RequestMethod.POST)
	    public String saveRoom(@ModelAttribute("room") Room rm) {
	        service.save(rm);
	        return "redirect:/admin/room";
	    }

	    @RequestMapping("/editRoom/{id}")
	    public ModelAndView showEditRoomPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("admin/addEditRoom");
	        Room rm = service.get(id);
	        mav.addObject("room", rm);
	        return mav;
	        
	    }
	    @RequestMapping("/deleteRoom/{id}")
	    public String deleteRoom(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/admin/room";
	    }
}
