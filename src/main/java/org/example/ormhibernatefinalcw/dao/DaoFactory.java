package org.example.ormhibernatefinalcw.dao;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return daoFactory != null ? daoFactory : new DaoFactory();
    }

    public SuperDao getDao(Type type){
        switch (type){
            case USER :
                return null;
            default:
                return null;
        }
    }

    public enum Type{
        USER
    }
}
