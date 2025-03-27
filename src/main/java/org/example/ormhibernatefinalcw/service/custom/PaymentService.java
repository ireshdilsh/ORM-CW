package org.example.ormhibernatefinalcw.service.custom;

import org.example.ormhibernatefinalcw.dto.PaymentDto;
import org.example.ormhibernatefinalcw.service.SuperService;

public interface PaymentService extends SuperService {
    boolean savePayment(PaymentDto paymentDto) throws Exception;
}
