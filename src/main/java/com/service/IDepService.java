package com.service;

import com.po.Dep;

import java.util.List;

//部门集合展示
public interface IDepService {
  public List<Dep> findAll();
}
