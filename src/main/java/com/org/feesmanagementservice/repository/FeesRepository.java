package com.org.feesmanagementservice.repository;

import com.org.feesmanagementservice.entity.FeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeesRepository extends JpaRepository<FeesEntity, Long> {
}
