package com.example.emp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.emp.domain.Department;
import com.example.emp.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
    private DepartmentRepository repo;
	
	public List<Department> listAll() {
        return repo.findAll();
    }
     
    public void save(Department dpt) {
        repo.save(dpt);
    }
     
    public Department get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
