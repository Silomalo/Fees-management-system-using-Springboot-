package com.example.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp.domain.SitAllocation;

@Repository
public interface SitAllocationRepository extends JpaRepository<SitAllocation, Long>{

}
