package com.example.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp.domain.AllocatedRoom;

@Repository
public interface AllocatedRoomRepository extends JpaRepository<AllocatedRoom, Long> {

}
