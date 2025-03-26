package org.example.ormhibernatefinalcw.service.custom;

import java.util.ArrayList;

import org.example.ormhibernatefinalcw.dto.ProgrammeDto;
import org.example.ormhibernatefinalcw.dto.ThereoistDto;
import org.example.ormhibernatefinalcw.service.SuperService;

public interface TherepistService extends SuperService{
    boolean addTherepist(ThereoistDto thereoistDto) throws Exception;

    ArrayList<ThereoistDto> getAll();

    boolean deleteTherepy(int id) throws Exception;

    boolean updateTherepist(ThereoistDto thereoistDto) throws Exception;
}
