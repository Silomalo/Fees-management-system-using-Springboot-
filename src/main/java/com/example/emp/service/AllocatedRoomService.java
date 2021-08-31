package com.example.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.domain.AllocatedRoom;
import com.example.emp.repository.AllocatedRoomRepository;


@Service
public class AllocatedRoomService {

	@Autowired
    private AllocatedRoomRepository repo;
	
	public List<AllocatedRoom> listAll() {
        return repo.findAll();
    }
     
    public void save(AllocatedRoom std) {
        repo.save(std);
    }
     
    public AllocatedRoom get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
