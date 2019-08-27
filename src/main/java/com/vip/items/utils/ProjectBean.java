package com.vip.items.utils;

import com.vip.items.domain.entity.Category;
import com.vip.items.domain.entity.Project;
import com.vip.items.domain.entity.SubMenu2;
import com.vip.items.domain.entity.SubMenu3;
import lombok.Data;

@Data
public class ProjectBean {
    private Project project;
    private Category category;
    private SubMenu2 subMenu2;
    private SubMenu3 subMenu3;
}
