package com.dao;

import com.entity.ZixunjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunjiluView;

/**
 * 咨询记录 Dao 接口
 *
 * @author 
 */
public interface ZixunjiluDao extends BaseMapper<ZixunjiluEntity> {

   List<ZixunjiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
