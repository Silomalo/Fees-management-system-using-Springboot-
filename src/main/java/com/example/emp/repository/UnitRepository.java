package com.example.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.emp.domain.Unit;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {

	@Query("select count(*) from Unit")
	   Long countUnits();
}
