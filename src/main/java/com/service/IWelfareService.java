package com.service;

import com.po.Welfare;

import java.util.List;

//福利表集合展示
public interface IWelfareService {
  public List<Welfare> findAll();
}
