package org.example.ormhibernatefinalcw.service.custom.impl;

import org.example.ormhibernatefinalcw.dao.DaoFactory;
import org.example.ormhibernatefinalcw.dao.custom.PatcientDao;
import org.example.ormhibernatefinalcw.dao.custom.PaymentDao;
import org.example.ormhibernatefinalcw.dao.custom.ProgrammeDao;
import org.example.ormhibernatefinalcw.dto.PaymentDto;
import org.example.ormhibernatefinalcw.entity.Patcient;
import org.example.ormhibernatefinalcw.entity.Payment;
import org.example.ormhibernatefinalcw.entity.Programme;
import org.example.ormhibernatefinalcw.service.custom.PaymentService;

public class PaymentServiceImpl implements PaymentService {

    PaymentDao paymentDao = (PaymentDao) DaoFactory.getInstance().getDao(DaoFactory.Type.PAYMENT);
    ProgrammeDao programmeDao = (ProgrammeDao) DaoFactory.getInstance().getDao(DaoFactory.Type.PROGRAMME);
    PatcientDao patcientDao = (PatcientDao) DaoFactory.getInstance().getDao(DaoFactory.Type.PATCIENT);


    @Override
    public boolean savePayment(PaymentDto paymentDto) throws Exception{

        Programme programme = programmeDao.findById(paymentDto.getProgramme());

        return paymentDao.save(new Payment(
            paymentDto.getId(),
            paymentDto.getDate(),
            paymentDto.getAmount(),
            paymentDto.getPatcient(),
            programme
        ));
    }
}
