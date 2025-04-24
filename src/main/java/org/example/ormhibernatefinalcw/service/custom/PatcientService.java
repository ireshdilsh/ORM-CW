package org.example.ormhibernatefinalcw.service.custom;

import org.example.ormhibernatefinalcw.dto.PatcientDto;
import org.example.ormhibernatefinalcw.service.SuperService;

import java.util.ArrayList;

public interface PatcientService extends SuperService {

    PatcientDto search(int id);

    boolean addPatcient(PatcientDto patcientDto) throws Exception;

    ArrayList<PatcientDto> getAll();

    boolean deletePatcient(int id) throws Exception;

    int saves(PatcientDto patcientDto) throws Exception;
}
