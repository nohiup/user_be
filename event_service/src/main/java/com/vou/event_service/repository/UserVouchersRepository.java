package com.vou.event_service.repository;

import com.vou.event_service.domain.model.EventParticipants;
import com.vou.event_service.domain.model.UserVouchers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserVouchersRepository extends JpaRepository<UserVouchers, UUID> {

    Optional<UserVouchers> findByUserIdAndVoucherId(String userId, UUID voucherId);

    List<UserVouchers> findByUserId(String userId);
}
