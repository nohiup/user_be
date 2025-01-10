package com.vou.user_service.adapter.out.persistence;

import com.vou.user_service.domain.model.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, String> {

    // Tìm kiếm User theo ID
    @NotNull Optional<User> findById(@NotNull String id);

    // Tìm kiếm User theo email
    Optional<User> findByEmail(String email);

    // Kiểm tra xem User có tồn tại theo email
    boolean existsByEmail(String email);

    // Tìm kiếm User theo số điện thoại
    Optional<User> findByPhone(String phone);

    // Kiểm tra xem User có tồn tại theo số điện thoại
    boolean existsByPhone(String phone);

    // Lấy tất cả User theo giới tính
    List<User> findAllByGender(String gender);

    // Xóa User theo ID
    void deleteById(@NotNull String id);
}
