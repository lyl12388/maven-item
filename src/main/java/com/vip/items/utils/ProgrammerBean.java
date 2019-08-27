package com.vip.items.utils;

import com.vip.items.domain.entity.Category;

import com.vip.items.domain.entity.Programmer;
import com.vip.items.domain.entity.SubMenu3;
import lombok.Data;

@Data
public class ProgrammerBean {
    private Programmer programmer;
    private Category category;
    private SubMenu3 subMenu3;
}
