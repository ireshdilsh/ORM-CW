package org.example.ormhibernatefinalcw.dao.custom.impl;

import java.util.List;
import java.util.Optional;

import org.example.ormhibernatefinalcw.config.SessionFactoryConfiguration;
import org.example.ormhibernatefinalcw.dao.custom.TherepistDao;
import org.example.ormhibernatefinalcw.entity.Programme;
import org.example.ormhibernatefinalcw.entity.Therepist;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TherepistDaoImpl implements TherepistDao{

    SessionFactoryConfiguration configuration = SessionFactoryConfiguration.getInstance();

    @Override
    public boolean save(Therepist t) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public boolean update(Therepist t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean deleteByPK(String pk) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByPK'");
    }

    @Override
    public List<Therepist> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Optional<Therepist> findByPK(String pk) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPK'");
    }

    @Override
    public Optional<String> getLastPK() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLastPK'");
    }


}
