package com.vip.items.service.impl;

import com.vip.items.domain.entity.Collection2;
import com.vip.items.mapper.Collection2Mapper;
import com.vip.items.service.Collection2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Collection2ServiceImpl implements Collection2Service {
    @Resource
    Collection2Mapper collection2Mapper;
    @Override
    public int saveCollection2(int uid, int pid) {
        int row = 0;
        Collection2 collection2 = collection2Mapper.findByc2id(uid, pid);
        if(collection2==null){
           row = collection2Mapper.saveCollection2(uid, pid);
        }
        return row;
    }

    @Override
    public int updateCollection2(int uid, int pid) {
        int row = 0;
        Collection2 collection2 = collection2Mapper.findByc2id(uid, pid);
        if(collection2!=null){
            row = collection2Mapper.updateCollection2(uid, pid);
        }
        return row;
    }
}
