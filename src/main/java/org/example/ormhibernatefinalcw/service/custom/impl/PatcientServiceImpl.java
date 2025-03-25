package org.example.ormhibernatefinalcw.service.custom.impl;

import org.example.ormhibernatefinalcw.dao.DaoFactory;
import org.example.ormhibernatefinalcw.dao.custom.PatcientDao;
import org.example.ormhibernatefinalcw.dto.PatcientDto;
import org.example.ormhibernatefinalcw.entity.Patcient;
import org.example.ormhibernatefinalcw.service.custom.PatcientService;

import java.util.ArrayList;
import java.util.List;

public class PatcientServiceImpl implements PatcientService {
    PatcientDao patcientDao = (PatcientDao) DaoFactory.getInstance().getDao(DaoFactory.Type.PATCIENT);

    @Override
    public boolean addPatcient(PatcientDto patcientDto) throws Exception{
        return patcientDao.save(new Patcient(
                patcientDto.getName(),
                patcientDto.getEmail(),
                patcientDto.getContact()
        ));
    }

    @Override
    public boolean updatePatcient(PatcientDto patcientDto) throws Exception{
        return patcientDao.update(new Patcient(
                patcientDto.getName(),
                patcientDto.getEmail(),
                patcientDto.getContact()
        ));
    }

    @Override
    public ArrayList<PatcientDto> getAll() {
        ArrayList<PatcientDto>patcientDtos = new ArrayList<>();
        List<Patcient> patcients = patcientDao.getAll();

        for (Patcient patcient : patcients){
            patcientDtos.add(new PatcientDto(
                    patcient.getId(),
                    patcient.getName(),
                    patcient.getEmail(),
                    patcient.getContact()
            ));
        }
        return patcientDtos;
    }
}
