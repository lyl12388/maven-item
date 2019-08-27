package com.vip.items.service.impl;

import com.vip.items.domain.entity.Project;
import com.vip.items.mapper.CategoryMapper;
import com.vip.items.mapper.ProjectMapper;
import com.vip.items.mapper.SubMenu2Mapper;
import com.vip.items.mapper.SubMenu3Mapper;
import com.vip.items.service.ProjectService;
import com.vip.items.utils.ProjectBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    ProjectMapper projectMapper;
    @Resource
    CategoryMapper categoryMapper;
    @Resource
    SubMenu2Mapper subMenu2Mapper;
    @Resource
    SubMenu3Mapper subMenu3Mapper;
    @Override
    public ProjectBean getDetail(int proId) {
        ProjectBean projectBean = new ProjectBean();
        projectBean.setProject(projectMapper.findByproId(proId));
        projectBean.setCategory(categoryMapper.findByproId(proId));
        projectBean.setSubMenu2(subMenu2Mapper.findByproId(proId));
        projectBean.setSubMenu3(subMenu3Mapper.findByproId(proId));
        return projectBean;
    }
}
