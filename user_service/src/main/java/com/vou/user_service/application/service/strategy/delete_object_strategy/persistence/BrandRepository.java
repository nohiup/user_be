package com.vou.user_service.application.service.strategy.delete_object_strategy.persistence;

import com.vou.user_service.domain.model.Brand;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BrandRepository extends JpaRepository<Brand, String> {

    // Tìm kiếm Brand theo ID
    @NotNull Optional<Brand> findById(@NotNull String id);

    // Tìm kiếm Brand theo tên
    Optional<Brand> findByName(String name);

    // Kiểm tra xem Brand có tồn tại theo tên
    boolean existsByName(String name);

    // Lấy danh sách các Brand có trạng thái active
    List<Brand> findAllByStatus(String status);

    // Xóa Brand theo ID
    void deleteById(@NotNull String id);
}
