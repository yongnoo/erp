package com.yj.erp.repository;

import java.util.Optional;

import com.yj.erp.models.Role;
import com.yj.erp.models.ERole;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
    
}