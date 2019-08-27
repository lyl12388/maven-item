package com.vip.items.mapper;

import com.vip.items.domain.entity.Category;

public interface CategoryMapper {
    Category findByproId(int proId);
    Category findByPid(int pid);
}