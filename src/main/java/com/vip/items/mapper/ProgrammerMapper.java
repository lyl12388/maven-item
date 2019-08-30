package com.vip.items.mapper;

import com.vip.items.domain.vo.ProgrammerVo;
import org.apache.ibatis.annotations.Param;

public interface ProgrammerMapper {
    /**
     * 通过pid查询程序员详情
     * @param pid
     * @return
     */
    ProgrammerVo findBypid(@Param("pid") int pid);
}