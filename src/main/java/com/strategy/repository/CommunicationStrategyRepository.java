package com.strategy.repository;

import com.strategy.entity.CommunicationStrategy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationStrategyRepository extends JpaRepository<CommunicationStrategy,Long> {
}
