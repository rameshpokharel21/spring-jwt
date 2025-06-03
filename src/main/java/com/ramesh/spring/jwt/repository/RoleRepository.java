package com.ramesh.spring.jwt.repository;

import com.ramesh.spring.jwt.model.AppRole;
import com.ramesh.spring.jwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(AppRole appRole);
}
