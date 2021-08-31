package com.example.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.domain.Results;
import com.example.emp.repository.ResultsRepository;


@Service
public class ResultsService {

	@Autowired
    private ResultsRepository repo;
	
	public List<Results> listAll() {
        return repo.findAll();
    }
     
    public void save(Results results) {
        repo.save(results);
    }
     
    public Results get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
