package org.example.ormhibernatefinalcw.service;

import org.example.ormhibernatefinalcw.service.custom.impl.AdminServiceImpl;
import org.example.ormhibernatefinalcw.service.custom.impl.PatcientServiceImpl;
import org.example.ormhibernatefinalcw.service.custom.impl.ProgrammeServiceImpl;
import org.example.ormhibernatefinalcw.service.custom.impl.RicieptionServiceImpl;

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
            
                case RICIEPTION:
                return new RicieptionServiceImpl();

                case PATCIENT:
                return new PatcientServiceImpl();

                case PROGRAMME:
                return new ProgrammeServiceImpl();

            default:
                return null;
        }
    }

    public enum Type{
        ADMIN,RICIEPTION,PATCIENT,PROGRAMME
    }
}
