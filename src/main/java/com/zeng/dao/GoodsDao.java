package com.zeng.dao;

import com.zeng.domain.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2017/2/23.
 */
@Component
public class GoodsDao {
    private SqlSession sqlSession;
    public GoodsDao(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }
    public List<Goods> listGoods(int pageNum,int pageSize,String platform,String fundType){
        Map<String, Object> parms = new HashMap<String,Object>();
        int offset = pageNum-1;
        int limit = pageSize;
        parms.put("platform", platform);
        parms.put("fundType",fundType);
        RowBounds rowBounds = new RowBounds(offset, limit);
        return this.sqlSession.selectList("selectGoods",parms,rowBounds);
    }
}
