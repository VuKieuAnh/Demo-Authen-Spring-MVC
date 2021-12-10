package com.codegym.repo;

import com.codegym.model.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}
