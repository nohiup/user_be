package com.vou.user_service.adapter.out.persistence;

import com.vou.user_service.domain.model.Admin;
import com.vou.user_service.domain.model.Brand;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, String> {

    // Tìm kiếm Brand theo ID
    @NotNull Optional<Admin> findById(@NotNull String id);

    // Tìm kiếm Brand theo tên
    Optional<Brand> findByName(String name);

    // Kiểm tra xem Brand có tồn tại theo tên
    boolean existsByName(String name);
}
