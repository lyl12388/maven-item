package com.vip.items.mapper;

import com.vip.items.domain.entity.Collection2;

public interface Collection2Mapper {
    /**
     * 收藏程序员
     * @param uid
     * @param pid
     * @return
     */
    Collection2 findByc2id(int uid,int pid);
    int saveCollection2(int uid,int pid);
    int updateCollection2(int uid,int pid);
}