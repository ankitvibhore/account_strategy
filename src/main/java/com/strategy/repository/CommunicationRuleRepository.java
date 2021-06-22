package com.strategy.repository;

import com.strategy.entity.CommunicationRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunicationRuleRepository extends JpaRepository<CommunicationRule,Long> {

    @Override
    List<CommunicationRule> findAll();

    @Override
    List<CommunicationRule> findAllById(Iterable<Long> iterable);

    @Override
    <S extends CommunicationRule> List<S> saveAll(Iterable<S> iterable);

    @Override
    CommunicationRule getById(Long aLong);
}
