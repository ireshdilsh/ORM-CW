package org.example.ormhibernatefinalcw.service.custom.impl;

import java.util.ArrayList;
import java.util.List;

import org.example.ormhibernatefinalcw.dao.DaoFactory;
import org.example.ormhibernatefinalcw.dao.DaoFactory.Type;
import org.example.ormhibernatefinalcw.dao.custom.ProgrammeDao;
import org.example.ormhibernatefinalcw.dao.custom.TherepistDao;
import org.example.ormhibernatefinalcw.dto.ProgrammeDto;
import org.example.ormhibernatefinalcw.dto.ThereoistDto;
import org.example.ormhibernatefinalcw.entity.Programme;
import org.example.ormhibernatefinalcw.entity.Therepist;
import org.example.ormhibernatefinalcw.service.custom.TherepistService;

public class TherepistServiceImpl implements TherepistService{

    TherepistDao therepistDao = (TherepistDao) DaoFactory.getInstance().getDao(Type.THEREPIST);
    ProgrammeDao programmeDao = (ProgrammeDao) DaoFactory.getInstance().getDao(Type.PROGRAMME);

    @Override
    public boolean addTherepist(ThereoistDto thereoistDto) throws Exception{
        Programme programme = programmeDao.findById(thereoistDto.getProID().getId());
        Therepist therepist = new Therepist();

        therepist.setId(thereoistDto.getId());
        therepist.setName(thereoistDto.getName());
        therepist.setProgramme(programme);
        therepist.setContact(thereoistDto.getContact());

        boolean isSaved = therepistDao.save(therepist);
        if (isSaved){
            return true;
        }else {
            return false;
        }
    }
}
