package com.example.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.domain.Room;
import com.example.emp.repository.RoomRepository;

@Service
public class RoomService {
	@Autowired
    private RoomRepository repo;
	
	public List<Room> listAll() {
        return repo.findAll();
    }
     
    public void save(Room rm) {
        repo.save(rm);
    }
     
    public Room get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    
    }
}
