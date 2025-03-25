package org.example.ormhibernatefinalcw.dao.custom.impl;

import org.example.ormhibernatefinalcw.config.SessionFactoryConfiguration;
import org.example.ormhibernatefinalcw.dao.custom.ProgrammeDao;
import org.example.ormhibernatefinalcw.entity.Patcient;
import org.example.ormhibernatefinalcw.entity.Programme;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class ProgrammeDaoImpl implements ProgrammeDao {

    SessionFactoryConfiguration sessionFactoryConfiguration = SessionFactoryConfiguration.getInstance();

    @Override
    public boolean save(Programme programme) throws Exception {
        Session session = sessionFactoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.persist(programme);
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
    public boolean update(Programme programme) {
        Session session = sessionFactoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.merge(programme);
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
            Programme programme = session.get(Programme.class,pk);

            if (programme != null){
                session.remove(programme);
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
    public List<Programme> getAll() {
        Session session = sessionFactoryConfiguration.getSession();
        Query<Programme> query = session.createQuery("from programme", Programme.class);
        return query.list();
    }

    @Override
    public Optional<Programme> findByPK(String pk) {
        return Optional.empty();
    }

    @Override
    public Optional<String> getLastPK() {
        return Optional.empty();
    }
}
