package com.dao;

import com.entity.ZhaoshengrenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaoshengrenyuanView;

/**
 * 招生人员 Dao 接口
 *
 * @author 
 */
public interface ZhaoshengrenyuanDao extends BaseMapper<ZhaoshengrenyuanEntity> {

   List<ZhaoshengrenyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
