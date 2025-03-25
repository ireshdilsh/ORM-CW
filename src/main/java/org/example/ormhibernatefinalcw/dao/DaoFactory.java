package org.example.ormhibernatefinalcw.dao;

import org.example.ormhibernatefinalcw.dao.custom.impl.AdminDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return daoFactory != null ? daoFactory : new DaoFactory();
    }

    public SuperDao getDao(Type type){
        switch (type){
            case ADMIN :
                return new AdminDaoImpl();
            default:
                return null;
        }
    }

    public enum Type{
        ADMIN,RICIEPTION
    }
}
