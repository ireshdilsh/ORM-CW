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

    @Override
    public ArrayList<ThereoistDto> getAll() {
        ArrayList<ThereoistDto> thereoistDtos = new ArrayList<>();
        List<Therepist> therepists = therepistDao.getAll();

        for (Therepist therepist : therepists) {
            Programme programme = therepist.getProgramme(); // Get Programme entity directly

            if (programme != null) {
                ProgrammeDto programmeDto = new ProgrammeDto(programme.getName()); // Convert Programme to ProgrammeDto

                thereoistDtos.add(new ThereoistDto(
                        therepist.getId(),
                        therepist.getName(),
                        programmeDto,  // Pass ProgrammeDto instead of programme.getId()
                        therepist.getContact()
                ));
            }
        }
        return thereoistDtos;

    }

    @Override
    public boolean deleteTherepy(int id) throws Exception{
        return therepistDao.deleteByPK(String.valueOf(id));
    }

    @Override
    public boolean updateTherepist(ThereoistDto thereoistDto) throws Exception{
        Programme programme = programmeDao.findById(thereoistDto.getProID().getId());
        Therepist therepist = new Therepist();

        therepist.setId(thereoistDto.getId());
        therepist.setName(thereoistDto.getName());
        therepist.setProgramme(programme);
        therepist.setContact(thereoistDto.getContact());

        boolean isSaved = therepistDao.update(therepist);
        if (isSaved){
            return true;
        }else {
            return false;
        }
    }


}
