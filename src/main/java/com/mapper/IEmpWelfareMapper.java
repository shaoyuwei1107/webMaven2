package com.mapper;

import com.po.EmpWelfare;
import com.po.Welfare;
import org.springframework.stereotype.Service;

import java.util.List;

//员工福利
@Service("EmpWelfareDAO")
public interface IEmpWelfareMapper {
   //保存员工福利数据
 public int save(EmpWelfare ewf);
   //根据员工编号删除对应福利数据
 public int delByEid(Integer eid);
  //根据员工编号查找对应福利集合
 public List<Welfare> findByEid(Integer eid);
}
