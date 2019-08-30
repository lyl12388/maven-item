package com.vip.items.controller;

import com.vip.items.service.Collection1Service;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class Collection1Controller {
    @Resource
    Collection1Service collection1Service;

    /**
     * 收藏项目
     * @param uid
     * @param proid
     * @return
     */
    @GetMapping("save/collection1")
    public Result saveCollection1(int uid,int proid){
        try {
            int row = collection1Service.saveCollection1(uid, proid);
            if(row > 0){
                return Result.success(row);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
    @GetMapping("update/collection1")
    public Result updateCollection1(int uid,int proid){
        try {
            int row = collection1Service.updateCollection1(uid, proid);
            if(row > 0){
                return Result.success(row);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
