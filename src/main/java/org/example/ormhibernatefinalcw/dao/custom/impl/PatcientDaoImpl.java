package org.example.ormhibernatefinalcw.dao.custom.impl;

import org.example.ormhibernatefinalcw.config.SessionFactoryConfiguration;
import org.example.ormhibernatefinalcw.dao.custom.PatcientDao;
import org.example.ormhibernatefinalcw.entity.Patcient;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class PatcientDaoImpl implements PatcientDao {

    private final SessionFactoryConfiguration sessionFactoryConfiguration = SessionFactoryConfiguration.getInstance();

    @Override
    public boolean save(Patcient patcient) throws Exception {
        Session session = sessionFactoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try{
            session.persist(patcient);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public boolean update(Patcient patcient) {
        Session session = sessionFactoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try{
            session.merge(patcient);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public boolean deleteByPK(String pk) throws Exception {
        Session session = sessionFactoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try {

            Patcient patcient = session.get(Patcient.class,pk);

            if (patcient != null){
                session.remove(patcient);
                transaction.commit();
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public List<Patcient> getAll() {
        Session session = sessionFactoryConfiguration.getSession();
        Query<Patcient> query = session.createQuery("from patcient", Patcient.class);
        return query.list();
    }

    @Override
    public Patcient search(int id) {
        return null;
    }

    @Override
    public Patcient findById(int id) {
        return null;
    }

}
