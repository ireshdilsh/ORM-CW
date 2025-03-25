package org.example.ormhibernatefinalcw.service.custom;

import org.example.ormhibernatefinalcw.dto.PatcientDto;
import org.example.ormhibernatefinalcw.service.SuperService;

import java.util.ArrayList;

public interface PatcientService extends SuperService {
    boolean addPatcient(PatcientDto patcientDto) throws Exception;

    boolean updatePatcient(PatcientDto patcientDto) throws Exception;

    ArrayList<PatcientDto> getAll();
}
