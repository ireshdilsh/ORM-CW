package org.example.ormhibernatefinalcw.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> extends SuperDao{
    boolean save(T t) throws Exception;
    boolean update(T t);
    boolean deleteByPK(String pk) throws Exception;
    List<T> getAll();
    Optional<T> findByPK(String pk);
    Optional<String> getLastPK();
}
