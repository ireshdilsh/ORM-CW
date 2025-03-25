package org.example.ormhibernatefinalcw.service.custom.impl;

import org.example.ormhibernatefinalcw.dao.DaoFactory;
import org.example.ormhibernatefinalcw.dao.DaoFactory.Type;
import org.example.ormhibernatefinalcw.dao.custom.RicieptionDao;
import org.example.ormhibernatefinalcw.dto.RicieptionDto;
import org.example.ormhibernatefinalcw.entity.Riciepion;
import org.example.ormhibernatefinalcw.service.custom.RicieptionService;

public class RicieptionServiceImpl implements RicieptionService{

    RicieptionDao ricieptionDao = (RicieptionDao) DaoFactory.getInstance().getDao(Type.RICIEPTION);

    @Override
    public Boolean addNewRicieption(RicieptionDto ricieptionDto) throws Exception{
        return ricieptionDao.save(new Riciepion(ricieptionDto.getEmail(), ricieptionDto.getPassword()));
    }

}
