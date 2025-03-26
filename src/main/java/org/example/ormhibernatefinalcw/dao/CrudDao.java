package org.example.ormhibernatefinalcw.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> extends SuperDao{
    boolean save(T t) throws Exception;
    boolean update(T t);
    boolean deleteByPK(String pk) throws Exception;
    List<T> getAll();
    T search(int id);
    T findById(int id);
}
