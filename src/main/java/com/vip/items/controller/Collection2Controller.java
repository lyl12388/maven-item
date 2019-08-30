package com.vip.items.controller;

import com.vip.items.service.Collection2Service;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class Collection2Controller {
    @Resource
    Collection2Service collection2Service;

    /**
     * 收藏程序员
     * @param uid
     * @param pid
     * @return
     */
    @GetMapping("save/collection2")
    public Result saveCollection2(int uid,int pid){
        try {
            int row = collection2Service.saveCollection2(uid, pid);
            if(row>0){
                return Result.success(row);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * 取消收藏程序员
     * @param uid
     * @param pid
     * @return
     */
    @GetMapping("update/collection2")
    public Result updateCollection2(int uid,int pid){
        try {
            int row = collection2Service.updateCollection2(uid, pid);
            if(row>0){
                return Result.success(row);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
