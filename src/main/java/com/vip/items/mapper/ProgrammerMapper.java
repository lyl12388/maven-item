package com.vip.items.mapper;

import com.vip.items.domain.entity.Programmer;

public interface ProgrammerMapper {

    Programmer findBypid(int pid);
}