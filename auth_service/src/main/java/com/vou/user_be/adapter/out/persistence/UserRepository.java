package com.vou.user_be.adapter.out.persistence;

import com.vou.user_be.domain.model.Users;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);

    Optional<Users> findByEmail(String email);
    @Modifying
    @Transactional
    @Query("UPDATE Users u SET u.is_verified = :verified WHERE u.email = :email")
    void updateVerifiedStatus(@Param("email") String email, @Param("verified") Boolean verified);
}
