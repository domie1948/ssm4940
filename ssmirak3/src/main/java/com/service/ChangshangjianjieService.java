package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangshangjianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangshangjianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangshangjianjieView;


/**
 * 厂商简介
 *
 * @author 
 * @email 
 * @date 2020-11-07 11:11:45
 */
public interface ChangshangjianjieService extends IService<ChangshangjianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangshangjianjieVO> selectListVO(Wrapper<ChangshangjianjieEntity> wrapper);
   	
   	ChangshangjianjieVO selectVO(@Param("ew") Wrapper<ChangshangjianjieEntity> wrapper);
   	
   	List<ChangshangjianjieView> selectListView(Wrapper<ChangshangjianjieEntity> wrapper);
   	
   	ChangshangjianjieView selectView(@Param("ew") Wrapper<ChangshangjianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangshangjianjieEntity> wrapper);
   	
}

