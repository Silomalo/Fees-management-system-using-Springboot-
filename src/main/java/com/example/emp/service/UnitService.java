package com.example.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.domain.Unit;
import com.example.emp.repository.UnitRepository;

@Service
public class UnitService {
	@Autowired
    private UnitRepository repo;
	
	public List<Unit> listAll() {
        return repo.findAll();
    }
     
    public void save(Unit unit) {
        repo.save(unit);
    }
     
    public Unit get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}
