package dao;

import entity.Retailer;

import java.util.Map;

public interface RetailerDao extends BaseDao<Retailer>
{
    public int count(Map map);
}
