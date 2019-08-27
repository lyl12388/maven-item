package com.vip.items.service.impl;

import com.vip.items.domain.entity.Programmer;
import com.vip.items.mapper.CategoryMapper;
import com.vip.items.mapper.ProgrammerMapper;
import com.vip.items.mapper.SubMenu3Mapper;
import com.vip.items.service.ProgrammerService;
import com.vip.items.utils.ProgrammerBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {
    @Resource
    ProgrammerMapper programmerMapper;
    @Resource
    CategoryMapper categoryMapper;
    @Resource
    SubMenu3Mapper subMenu3Mapper;
    @Override
    public ProgrammerBean getDetail(int pid) {
        ProgrammerBean programmerBean = new ProgrammerBean();
        programmerBean.setProgrammer(programmerMapper.findBypid(pid));
        programmerBean.setCategory(categoryMapper.findByPid(pid));
        programmerBean.setSubMenu3(subMenu3Mapper.findBypid(pid));
        return programmerBean;
    }
}
