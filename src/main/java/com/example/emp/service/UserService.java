package com.example.emp.service;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.emp.domain.User;
import com.example.emp.repository.UserRepository;
 
@Service
public class UserService {

	@Autowired
    private UserRepository repo;
	
	public List<User> listAll() {
        return repo.findAll();
    }
     
    public void save(User std) {
        repo.save(std);
    }
     
    public User get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
 
}