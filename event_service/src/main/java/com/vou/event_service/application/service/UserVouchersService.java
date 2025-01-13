package com.vou.event_service.application.service;

import com.vou.event_service.domain.model.EventParticipants;
import com.vou.event_service.domain.model.UserVouchers;
import com.vou.event_service.repository.EventParticipantsRepository;
import com.vou.event_service.repository.UserVouchersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserVouchersService {

    @Autowired
    private UserVouchersRepository userVouchersRepository;

    public UserVouchers createUserVoucher(UserVouchers userVoucher) {
        return userVouchersRepository.save(userVoucher);
    }

    public Optional<UserVouchers> findByUserIdAndVoucherId(String userId, UUID voucherId) {
        return userVouchersRepository.findByUserIdAndVoucherId(userId, voucherId);
    }

    public List<UserVouchers> findByUserId(String userId) {
        return userVouchersRepository.findByUserId(userId);
    }

    public UserVouchers updateUserVoucher(UserVouchers userVoucher) {
        return userVouchersRepository.save(userVoucher);
    }
}