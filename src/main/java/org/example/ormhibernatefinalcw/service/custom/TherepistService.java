package org.example.ormhibernatefinalcw.service.custom;

import java.util.ArrayList;

import org.example.ormhibernatefinalcw.dto.ProgrammeDto;
import org.example.ormhibernatefinalcw.dto.ThereoistDto;
import org.example.ormhibernatefinalcw.service.SuperService;

public interface TherepistService extends SuperService{
    boolean addTherepist(ThereoistDto thereoistDto) throws Exception;
}
