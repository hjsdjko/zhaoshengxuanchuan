package com.dao;

import com.entity.JihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JihuaView;

/**
 * 招生计划 Dao 接口
 *
 * @author 
 */
public interface JihuaDao extends BaseMapper<JihuaEntity> {

   List<JihuaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
