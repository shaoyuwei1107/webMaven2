package com.mapper;

import com.po.Welfare;
import org.springframework.stereotype.Service;

import java.util.List;

//福利表，通过集合复选框展示
@Service("WelfareDAO")
public interface IWelfareMapper {
public List<Welfare> findAll();
}
