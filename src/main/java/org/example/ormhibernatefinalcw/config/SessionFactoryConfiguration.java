package org.example.ormhibernatefinalcw.config;

import org.example.ormhibernatefinalcw.entity.Customer;
import org.example.ormhibernatefinalcw.entity.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfiguration {
    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory sessionFactory;

    private SessionFactoryConfiguration(){
        Configuration configuration = new Configuration().configure();

        configuration.addAnnotatedClass(Customer.class)
                     .addAnnotatedClass(Item.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactoryConfiguration getInstance(){
        return sessionFactoryConfiguration == null ? new SessionFactoryConfiguration() : sessionFactoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
