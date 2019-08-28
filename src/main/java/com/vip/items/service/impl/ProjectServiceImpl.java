package com.vip.items.service.impl;

import com.vip.items.domain.entity.Project;
import com.vip.items.domain.vo.ProjectVo;
import com.vip.items.mapper.CategoryMapper;
import com.vip.items.mapper.ProjectMapper;
import com.vip.items.mapper.SubMenu2Mapper;
import com.vip.items.mapper.SubMenu3Mapper;
import com.vip.items.service.ProjectService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    ProjectMapper projectMapper;
    @Override
    public ProjectVo getDetail(int proId) {
        ProjectVo projectVo = projectMapper.findByproId(proId);
        return projectVo;
    }
}
