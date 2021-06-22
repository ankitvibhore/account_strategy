package com.strategy.repository;

import com.strategy.entity.CommunicationSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationScheduleRepository extends JpaRepository<CommunicationSchedule,Long> {
}
