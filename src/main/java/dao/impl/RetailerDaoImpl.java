package dao.impl;

import dao.BaseDao;
import dao.RetailerDao;
import entity.Retailer;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class RetailerDaoImpl extends BaseDaoImpl<Retailer> implements RetailerDao
{
    public RetailerDaoImpl()
    {
        super.setNs("RetailerMapper");
    }
    public int count(Map map)
    {
        return this.getSqlSession().selectOne(this.getNs()+".count",map);
    }
}
