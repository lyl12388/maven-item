package com.vip.items.controller;

import com.vip.items.service.ProgrammerService;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@Slf4j
@RestController
public class ProgrammerController {
    @Resource
    ProgrammerService programmerService;

    /**
     * 程序员详情
     * @param pid 程序员id
     * @return
     */
    @GetMapping("/programmer")
    public Result showProgrammerDetail(int pid){
        try {
            return Result.success(programmerService.getDetail(pid));
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
