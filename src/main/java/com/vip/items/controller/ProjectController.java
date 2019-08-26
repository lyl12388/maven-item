package com.vip.items.controller;

import com.vip.items.service.ProjectService;
import com.vip.items.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProjectController {
    @Resource
    ProjectService projectService;
    @GetMapping("/project")
    public Result showProjectDetail(int proId){
        try {
            return Result.success(projectService.getDetail(proId));
        } catch (Exception e) {
            return Result.error();
        }
    }
}
