package dao.impl;

import dao.CommoditiesDao;
import entity.Commodities;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CommoditiesDaoImpl extends BaseDaoImpl<Commodities> implements CommoditiesDao
{
    public CommoditiesDaoImpl()
    {
        super.setNs("CommoditiesMapper");
    }
    public int count(Map map)
    {
        return this.getSqlSession().selectOne(this.getNs()+".count",map);
    }
}
