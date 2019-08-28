package com.vip.items.service.impl;

import com.vip.items.domain.vo.ProgrammerVo;
import com.vip.items.mapper.ProgrammerMapper;
import com.vip.items.service.ProgrammerService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {
    @Resource
    ProgrammerMapper programmerMapper;

    @Override
    public ProgrammerVo getDetail(int pid) {
        ProgrammerVo programmerVo = programmerMapper.findBypid(pid);
        return programmerVo;
    }
}
