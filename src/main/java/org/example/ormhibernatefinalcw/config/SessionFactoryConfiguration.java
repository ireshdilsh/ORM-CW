package org.example.ormhibernatefinalcw.config;

import org.example.ormhibernatefinalcw.entity.Admin;
import org.example.ormhibernatefinalcw.entity.Customer;
import org.example.ormhibernatefinalcw.entity.Item;
import org.example.ormhibernatefinalcw.entity.Riciepion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfiguration {
    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfiguration() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Admin.class)
                .addAnnotatedClass(Riciepion.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactoryConfiguration getInstance() {
        if (sessionFactoryConfiguration == null) {
            sessionFactoryConfiguration = new SessionFactoryConfiguration();
        }
        return sessionFactoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
