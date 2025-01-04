package com.vou.user_be.adapter.out.persistence;

import com.vou.user_be.domain.model.Auth;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Auth, Long> {
    Auth findByUsername(String username);

    Optional<Auth> findByEmail(String email);
    @Modifying
    @Transactional
    @Query("UPDATE Auth u SET u.status = :status WHERE u.email = :email")
    void updateStatus(@Param("email") String email, @Param("status") String status);
}
