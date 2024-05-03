package com.dao;

import com.entity.WuziXiaohaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WuziXiaohaoView;

/**
 * 物资消耗 Dao 接口
 *
 * @author 
 */
public interface WuziXiaohaoDao extends BaseMapper<WuziXiaohaoEntity> {

   List<WuziXiaohaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
