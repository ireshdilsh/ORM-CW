package org.example.ormhibernatefinalcw.service;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return serviceFactory != null ? serviceFactory : new ServiceFactory();
    }

    public SuperService getService(Type type){
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
