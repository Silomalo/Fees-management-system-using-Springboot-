package com.example.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.emp.domain.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

	@Query("select count(*) from Room")
	   Long countRooms();
}
