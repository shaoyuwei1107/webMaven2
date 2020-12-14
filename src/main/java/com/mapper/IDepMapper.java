package com.mapper;

import com.po.Dep;
import org.springframework.stereotype.Service;

import java.util.List;

//部门查询接口
@Service("DepDAO")
public interface IDepMapper {
 public List<Dep> findAll();
}
