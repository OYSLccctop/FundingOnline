package com.ccctop.cloud.service.api;

import com.ccctop.crowd.entity.vo.DetailProjectVO;
import com.ccctop.crowd.entity.vo.PortalTypeVO;
import com.ccctop.crowd.entity.vo.ProjectVO;

import java.util.List;

public interface ProjectService {
    void saveProject(ProjectVO projectVO, Integer memberId);

    List<PortalTypeVO> getPortalTypeVO();

    DetailProjectVO getDetailProjectVO(Integer projectId);
}
