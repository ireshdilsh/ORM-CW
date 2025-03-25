package org.example.ormhibernatefinalcw.service.custom.impl;

import org.example.ormhibernatefinalcw.dao.DaoFactory;
import org.example.ormhibernatefinalcw.dao.DaoFactory.Type;
import org.example.ormhibernatefinalcw.dao.custom.AdminDao;
import org.example.ormhibernatefinalcw.dto.AdminDto;
import org.example.ormhibernatefinalcw.entity.Admin;
import org.example.ormhibernatefinalcw.service.custom.AdminService;

public class AdminServiceImpl implements AdminService{

    AdminDao adminDao = (AdminDao) DaoFactory.getInstance().getDao(Type.ADMIN);

    @Override
    public Boolean addNewAdmin(AdminDto adminDto) throws Exception{
        return adminDao.save(new Admin(adminDto.getEmail(),adminDto.getPassword()));
    }

}
