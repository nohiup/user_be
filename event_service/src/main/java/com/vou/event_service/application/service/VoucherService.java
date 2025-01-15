package com.vou.event_service.application.service;

import com.vou.event_service.domain.model.Voucher;
import com.vou.event_service.repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VoucherService {

    @Autowired
    private VoucherRepository voucherRepository;

    public Voucher saveVoucher(Voucher voucher) {
        return voucherRepository.save(voucher);
    }

    public Voucher findById(UUID voucherId) {
        return voucherRepository.findById(voucherId).orElse(null);
    }
}

