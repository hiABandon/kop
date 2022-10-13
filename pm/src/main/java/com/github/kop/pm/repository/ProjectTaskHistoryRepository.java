package com.github.kop.pm.repository;

import com.github.kop.pm.module.ProjectTaskHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProjectTaskHistoryRepository extends JpaRepository<ProjectTaskHistory, Integer>,
    JpaSpecificationExecutor<ProjectTaskHistory> {

}