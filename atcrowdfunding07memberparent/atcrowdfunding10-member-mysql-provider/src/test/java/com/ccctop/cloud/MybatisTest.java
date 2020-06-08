package com.ccctop.cloud;


import com.ccctop.cloud.mapper.MemberPOMapper;
import com.ccctop.cloud.mapper.ProjectPOMapper;
import com.ccctop.crowd.entity.po.MemberPO;
import com.ccctop.crowd.entity.vo.DetailProjectVO;
import com.ccctop.crowd.entity.vo.PortalProjectVO;
import com.ccctop.crowd.entity.vo.PortalTypeVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private MemberPOMapper memberPOMapper;
    @Autowired
    private ProjectPOMapper projectPOMapper;

    private Logger logger = LoggerFactory.getLogger(MybatisTest.class);

    @Test
    public void testLoadDetailProjectVO(){
        Integer projectId = 4;
        DetailProjectVO detailProjectVO = projectPOMapper.selectDetailProjectVO(projectId);
        logger.debug(detailProjectVO.getProjectName());
        List<String> detailPicturePathList = detailProjectVO.getDetailPicturePathList();
        for (String s : detailPicturePathList) {
            logger.debug(s);
        }
    }

    @Test
    public void testLoadTypeData() {
        List<PortalTypeVO> typeVOList = projectPOMapper.selectPortalTypeVOList();
        for (PortalTypeVO portalTypeVO : typeVOList) {
            Integer id = portalTypeVO.getId();
            String name = portalTypeVO.getName();
            String remark = portalTypeVO.getRemark();
            logger.info("name = "+name + "remark="+remark);
            List<PortalProjectVO> portalProjectVOList = portalTypeVO.getPortalProjectVOList();
            for (PortalProjectVO portalProjectVO : portalProjectVOList) {
                if (portalProjectVO == null){
                    continue;
                }
                logger.info(portalProjectVO.toString());
            }
        }
    }

    @Test
    public void testMapper() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String source = "123123";
        String encode = passwordEncoder.encode(source);
        MemberPO memberPO = new MemberPO(null, "jack", encode, " 杰 克 ",
                "jack@qq.com", 1, 1, "杰克", "123123", 2);
        memberPOMapper.insert(memberPO);
    }

    @Test
    public void test() {
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
