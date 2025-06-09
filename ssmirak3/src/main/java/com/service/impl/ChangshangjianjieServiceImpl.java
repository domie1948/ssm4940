package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChangshangjianjieDao;
import com.entity.ChangshangjianjieEntity;
import com.service.ChangshangjianjieService;
import com.entity.vo.ChangshangjianjieVO;
import com.entity.view.ChangshangjianjieView;

@Service("changshangjianjieService")
public class ChangshangjianjieServiceImpl extends ServiceImpl<ChangshangjianjieDao, ChangshangjianjieEntity> implements ChangshangjianjieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangshangjianjieEntity> page = this.selectPage(
                new Query<ChangshangjianjieEntity>(params).getPage(),
                new EntityWrapper<ChangshangjianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangshangjianjieEntity> wrapper) {
		  Page<ChangshangjianjieView> page =new Query<ChangshangjianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangshangjianjieVO> selectListVO(Wrapper<ChangshangjianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangshangjianjieVO selectVO(Wrapper<ChangshangjianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangshangjianjieView> selectListView(Wrapper<ChangshangjianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangshangjianjieView selectView(Wrapper<ChangshangjianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
