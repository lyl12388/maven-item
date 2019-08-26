package com.vip.items.service.impl;

import com.vip.items.domain.entity.Programmer;
import com.vip.items.mapper.ProgrammerMapper;
import com.vip.items.service.ProgrammerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {
    @Resource
    ProgrammerMapper programmerMapper;
    @Override
    public Programmer getDetail(int pid) {
        return programmerMapper.findBypid(pid);
    }
}
