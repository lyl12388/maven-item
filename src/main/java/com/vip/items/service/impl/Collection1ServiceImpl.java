package com.vip.items.service.impl;

import com.vip.items.domain.entity.Collection1;
import com.vip.items.mapper.Collection1Mapper;
import com.vip.items.service.Collection1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Collection1ServiceImpl implements Collection1Service {
    @Resource
    Collection1Mapper collection1Mapper;

    /**
     *  收藏项目
     * @param uid
     * @param proid
     * @return
     */
    @Override
    public int saveCollection1(int uid, int proid) {
        int row = 0;
        Collection1 collection = collection1Mapper.findBycid(uid, proid);
        if(collection==null){
            row = collection1Mapper.saveCollection1(uid, proid);
        }
        return row;
    }

    /**
     * 取消收藏项目
     * @param uid
     * @param proid
     * @return
     */
    @Override
    public int updateCollection1(int uid, int proid) {
        int row = 0;
        Collection1 collection1 = collection1Mapper.findBycid(uid, proid);
        if(collection1!=null){
            row = collection1Mapper.updateCollection1(uid, proid);
        }
        return row;
    }
}
