package com.wf.ibs.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wf.ibs.crud.entity.CardUpgradation;

//@Component
@Repository
public interface CardUpgradationRepository 
		extends JpaRepository<CardUpgradation, Long>{
}
