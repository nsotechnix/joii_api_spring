package com.example.joii_api.repository;
import java.util.List;
import java.util.Optional;

import com.example.joii_api.models.Hotels;
import com.example.joii_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Optional<User> findById(long id);
    @Query(value = "SELECT * FROM users WHERE phone = ?1 AND status=1", nativeQuery = true)
    Optional<User> findUserByPhone(String phone);
}