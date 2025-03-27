package org.example.ormhibernatefinalcw.service.custom.impl;

import org.example.ormhibernatefinalcw.dao.DaoFactory;
import org.example.ormhibernatefinalcw.dao.custom.SessionDao;
import org.example.ormhibernatefinalcw.dao.custom.TherepistDao;
import org.example.ormhibernatefinalcw.dto.ProgrammeDto;
import org.example.ormhibernatefinalcw.dto.SessionDto;
import org.example.ormhibernatefinalcw.dto.ThereoistDto;
import org.example.ormhibernatefinalcw.entity.Programme;
import org.example.ormhibernatefinalcw.entity.ThereSession;
import org.example.ormhibernatefinalcw.entity.Therepist;
import org.example.ormhibernatefinalcw.service.custom.SessionService;

import java.util.ArrayList;
import java.util.List;

public class SessionServiceImpl implements SessionService {

    SessionDao sessionDao = (SessionDao) DaoFactory.getInstance().getDao(DaoFactory.Type.THE_SESSION);
    TherepistDao therepistDao = (TherepistDao) DaoFactory.getInstance().getDao(DaoFactory.Type.THEREPIST);
    @Override
    public boolean addSession(SessionDto dto) throws Exception{
        Therepist therepist = therepistDao.findById(dto.getThereoistDto().getId());
        ThereSession session = new ThereSession();

        session.setId(dto.getId());
        session.setName(dto.getName());
        session.setDate(dto.getDate());
        session.setTherepist(therepist);

        boolean isSaved = sessionDao.save(session);
        if (isSaved){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteSession(int sessionTMId) throws Exception{
        return sessionDao.deleteByPK(String.valueOf(sessionTMId));
    }

    @Override
    public ArrayList<SessionDto> getAll() {

        ArrayList<SessionDto>sessionDtos = new ArrayList<>();
        List<ThereSession>thereSessions = sessionDao.getAll();

        for (ThereSession thereSession : thereSessions){
            Therepist therepist = thereSession.getTherepist();

            if (therepist != null){
                ThereoistDto thereoistDto = new ThereoistDto(therepist.getName());

                sessionDtos.add(new SessionDto(
                        thereSession.getId(), thereSession.getName(), thereSession.getDate(),thereoistDto
                ));
            }
        }
        return sessionDtos;
    }

    @Override
    public boolean updateSession(SessionDto dto) {
        Therepist therepist = therepistDao.findById(dto.getThereoistDto().getId());
        ThereSession session = new ThereSession();

        session.setId(dto.getId());
        session.setName(dto.getName());
        session.setDate(dto.getDate());
        session.setTherepist(therepist);

        boolean isSaved = sessionDao.update(session);
        if (isSaved){
            return true;
        }else {
            return false;
        }
    }
}
