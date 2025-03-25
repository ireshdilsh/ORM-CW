package org.example.ormhibernatefinalcw.service.custom;

import org.example.ormhibernatefinalcw.dto.ProgrammeDto;
import org.example.ormhibernatefinalcw.service.SuperService;

import java.util.ArrayList;

public interface ProgrammeService extends SuperService {
    boolean addProgramme(ProgrammeDto programmeDto) throws Exception;

    boolean deleteProgramme(int id) throws Exception;

    boolean updateProgramme(ProgrammeDto programmeDto);

    ArrayList<ProgrammeDto> getAll();
}
