package dao;

import java.util.Map;
import entity.Commodities;
public interface CommoditiesDao extends BaseDao<Commodities>
{
    public int count(Map map);
}
