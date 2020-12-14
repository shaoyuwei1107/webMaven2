package com.servicepl;


import com.po.Dep;
import com.service.IDepService;
import com.util.DaoMapperUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("DepService")
@Transactional
public class DepServiceImpl implements IDepService {
   @Resource(name="DaoMapper")
	private DaoMapperUtil daoMapper;
   
	public DaoMapperUtil getDaoMapper() {
	return daoMapper;
}

public void setDaoMapper(DaoMapperUtil daoMapper) {
	this.daoMapper = daoMapper;
}

	@Override
	public List<Dep> findAll() {
		// TODO Auto-generated method stub
		return daoMapper.getDepMapper().findAll();
	}

}
