package com.dao;

import com.entity.ChangshangjianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangshangjianjieVO;
import com.entity.view.ChangshangjianjieView;


/**
 * 厂商简介
 * 
 * @author 
 * @email 
 * @date 2020-11-07 11:11:45
 */
public interface ChangshangjianjieDao extends BaseMapper<ChangshangjianjieEntity> {
	
	List<ChangshangjianjieVO> selectListVO(@Param("ew") Wrapper<ChangshangjianjieEntity> wrapper);
	
	ChangshangjianjieVO selectVO(@Param("ew") Wrapper<ChangshangjianjieEntity> wrapper);
	
	List<ChangshangjianjieView> selectListView(@Param("ew") Wrapper<ChangshangjianjieEntity> wrapper);

	List<ChangshangjianjieView> selectListView(Pagination page,@Param("ew") Wrapper<ChangshangjianjieEntity> wrapper);
	
	ChangshangjianjieView selectView(@Param("ew") Wrapper<ChangshangjianjieEntity> wrapper);
	
}
