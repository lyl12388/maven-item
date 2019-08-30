package com.vip.items.mapper;
import com.vip.items.domain.vo.ProjectVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper {
    /**
     * 通过proId查询项目详情
     * @param proId
     * @return
     */
    ProjectVo findByproId(@Param("proId") int proId);
    int saveProject(String proName,String proCom,
                    String proRequest,String tel,
                    String time,int cateId,int menu2Id,int menu3Id);


    List<ProjectVo> findByKeyword(@Param("keyword") String keyword);
}