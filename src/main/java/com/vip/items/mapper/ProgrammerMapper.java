package com.vip.items.mapper;

import com.vip.items.domain.vo.ProgrammerVo;

public interface ProgrammerMapper {

    ProgrammerVo findBypid(int pid);
}