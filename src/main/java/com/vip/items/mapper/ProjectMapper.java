package com.vip.items.mapper;

import com.vip.items.domain.vo.ProjectVo;

public interface ProjectMapper {
    ProjectVo findByproId(int proId);
}