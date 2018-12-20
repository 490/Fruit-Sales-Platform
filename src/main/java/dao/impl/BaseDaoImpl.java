package dao.impl;

import dao.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
@Repository
public abstract class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>
{
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
    {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    private String ns;

    public String getNs()
    {
        return ns;
    }

    public void setNs(String ns)
    {
        this.ns = ns;
    }

    public T get(Serializable id)
    {
        return this.getSqlSession().selectOne(ns+".get",id);
    }

    public List<T> find(Map map)
    {
        List<T> oList = this.getSqlSession().selectList(ns+".find",map);
        return oList;
    }

    public void insert(T entity)
    {
        this.getSqlSession().insert(ns+".insert",entity);
    }

    public void update(T entity)
    {
        this.getSqlSession().update(ns+".update",entity);
    }

    public void deleteById(Serializable id)
    {
        this.getSqlSession().delete(ns+".deleteById",id);
    }

    public void delete(Serializable[] ids)
    {
        this.getSqlSession().delete(ns+".delete",ids);
    }
}
