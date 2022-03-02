package com.example.joii_api.repository;
import java.util.Optional;
import com.example.joii_api.models.ERole;
import com.example.joii_api.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}