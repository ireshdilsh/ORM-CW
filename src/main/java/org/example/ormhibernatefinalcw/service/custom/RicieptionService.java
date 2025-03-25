package org.example.ormhibernatefinalcw.service.custom;

import org.example.ormhibernatefinalcw.dto.RicieptionDto;
import org.example.ormhibernatefinalcw.service.SuperService;

public interface RicieptionService extends SuperService{

    Boolean addNewRicieption(RicieptionDto ricieptionDto) throws Exception;

}
