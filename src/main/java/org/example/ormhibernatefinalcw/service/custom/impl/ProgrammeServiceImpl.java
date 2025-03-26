package org.example.ormhibernatefinalcw.service.custom.impl;

import org.example.ormhibernatefinalcw.dao.DaoFactory;
import org.example.ormhibernatefinalcw.dao.custom.ProgrammeDao;
import org.example.ormhibernatefinalcw.dto.ProgrammeDto;
import org.example.ormhibernatefinalcw.entity.Programme;
import org.example.ormhibernatefinalcw.service.custom.ProgrammeService;

import java.util.ArrayList;
import java.util.List;

public class ProgrammeServiceImpl implements ProgrammeService {

    ProgrammeDao programmeDao = (ProgrammeDao) DaoFactory.getInstance().getDao(DaoFactory.Type.PROGRAMME);

    @Override
    public boolean addProgramme(ProgrammeDto programmeDto) throws Exception {
        return programmeDao.save(new Programme(
                programmeDto.getName(),
                programmeDto.getDuration(),
                programmeDto.getFees()
        ));
    }

    @Override
    public boolean deleteProgramme(int id) throws Exception {
        return programmeDao.deleteByPK(String.valueOf(id));
    }

    @Override
    public boolean updateProgramme(ProgrammeDto programmeDto) {
        return programmeDao.update(new Programme(
                programmeDto.getName(),
                programmeDto.getDuration(),
                programmeDto.getFees()
        ));
    }

    @Override
    public ArrayList<ProgrammeDto> getAll() {
        ArrayList<ProgrammeDto>programmeDtos = new ArrayList<>();
        List<Programme>programmes = programmeDao.getAll();

        for (Programme programme  :programmes){
            programmeDtos.add(new ProgrammeDto(
                    programme.getId(),
                    programme.getName(),
                    programme.getDuration(),
                    programme.getFees()
            ));
        }
        return programmeDtos;
    }

    @Override
    public ProgrammeDto search(int id) {
        Programme programme = programmeDao.search(id);
        ProgrammeDto programmeDto = new ProgrammeDto();

        programmeDto.setId(programme.getId());
        programmeDto.setName(programme.getName());
        programmeDto.setDuration(programme.getDuration());
        programmeDto.setFees(programme.getFees());

        return programmeDto;
    }
}
