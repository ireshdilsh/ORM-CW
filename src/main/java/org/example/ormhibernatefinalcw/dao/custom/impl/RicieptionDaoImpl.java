package org.example.ormhibernatefinalcw.dao.custom.impl;

import java.util.List;
import java.util.Optional;

import org.example.ormhibernatefinalcw.config.SessionFactoryConfiguration;
import org.example.ormhibernatefinalcw.dao.custom.RicieptionDao;
import org.example.ormhibernatefinalcw.entity.Riciepion;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RicieptionDaoImpl implements RicieptionDao{

    
    private final SessionFactoryConfiguration sessionFactoryConfiguration = SessionFactoryConfiguration.getInstance();

    @Override
    public boolean save(Riciepion t) throws Exception {
        Session session = sessionFactoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.persist(t);
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
    public boolean update(Riciepion t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean deleteByPK(String pk) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByPK'");
    }

    @Override
    public List<Riciepion> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Optional<Riciepion> findByPK(String pk) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPK'");
    }

    @Override
    public Optional<String> getLastPK() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLastPK'");
    }

}
