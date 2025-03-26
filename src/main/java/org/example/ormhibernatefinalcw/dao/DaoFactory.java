package org.example.ormhibernatefinalcw.dao;

import org.example.ormhibernatefinalcw.dao.custom.impl.AdminDaoImpl;
import org.example.ormhibernatefinalcw.dao.custom.impl.PatcientDaoImpl;
import org.example.ormhibernatefinalcw.dao.custom.impl.ProgrammeDaoImpl;
import org.example.ormhibernatefinalcw.dao.custom.impl.RicieptionDaoImpl;
import org.example.ormhibernatefinalcw.dao.custom.impl.TherepistDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return daoFactory != null ? daoFactory : new DaoFactory();
    }

    public SuperDao getDao(Type type) {
        switch (type) {
            case ADMIN:
                return new AdminDaoImpl();
            case PATCIENT:
                return new PatcientDaoImpl();
            case RICIEPTION:
                return new RicieptionDaoImpl();
            case PROGRAMME:
                return new ProgrammeDaoImpl();
            case THEREPIST:
                return new TherepistDaoImpl();
            default:
                return null;
        }
    }

    public enum Type {
        ADMIN, RICIEPTION, PATCIENT, PROGRAMME, THEREPIST
    }
}
