package org.example.ormhibernatefinalcw.dao;

public interface CrudDao<T> extends SuperDao{
    boolean save(T t) throws Exception;
}
