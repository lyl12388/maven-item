package com.vip.items.service.impl;

import com.vip.items.domain.entity.Project;
import com.vip.items.mapper.ProjectMapper;
import com.vip.items.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    ProjectMapper projectMapper;
    @Override
    public Project getDetail(int proId) {
        return projectMapper.findByproId(proId);
    }
}
