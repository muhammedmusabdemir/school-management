package com.schoolmanagement.repository;

import com.schoolmanagement.domain.Dean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeanRepository extends JpaRepository<Dean,Long> {
}
