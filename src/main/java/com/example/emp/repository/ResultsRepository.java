package com.example.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.emp.domain.Results;

@Repository
public interface ResultsRepository extends JpaRepository<Results, Long> {

	@Query("select count(*) from Results")
	   Long countResults();
}
