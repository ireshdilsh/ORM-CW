package org.example.ormhibernatefinalcw.service;

import org.example.ormhibernatefinalcw.service.custom.impl.AdminServiceImpl;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return serviceFactory != null ? serviceFactory : new ServiceFactory();
    }

    public SuperService getService(Type type){
        switch (type){
            case ADMIN :
                return new AdminServiceImpl();
            default:
                return null;
        }
    }

    public enum Type{
        ADMIN,RICIEPTION
    }
}
