package com.vip.items.mapper;

import com.vip.items.domain.entity.Collection1;

public interface Collection1Mapper {
    /**
     * 收藏项目
     * @param uid
     * @param proid
     * @return
     */
    Collection1 findBycid(int uid, int proid);
    int saveCollection1(int uid,int proid);
    int updateCollection1(int uid,int proid);
}