package org.example.ormhibernatefinalcw.service.custom;

import org.example.ormhibernatefinalcw.dto.SessionDto;
import org.example.ormhibernatefinalcw.service.SuperService;

import java.util.ArrayList;

public interface SessionService extends SuperService {
    boolean addSession(SessionDto dto) throws Exception;

    boolean deleteSession(int sessionTMId) throws Exception;

    ArrayList<SessionDto> getAll();

    boolean updateSession(SessionDto dto);
}
