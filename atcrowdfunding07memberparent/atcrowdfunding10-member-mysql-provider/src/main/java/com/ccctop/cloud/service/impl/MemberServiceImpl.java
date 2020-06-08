package com.ccctop.cloud.service.impl;

import com.ccctop.cloud.mapper.MemberPOMapper;
import com.ccctop.cloud.service.api.MemberService;
import com.ccctop.crowd.entity.po.MemberPO;
import com.ccctop.crowd.entity.po.MemberPOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberPOMapper memberPOMapper;

    @Override
    public MemberPO getMemberPOByLoginAcct(String loginacct) {
        // 1.创建 Example 对象
        MemberPOExample example = new MemberPOExample();
        // 2.创建 Criteria 对象
        MemberPOExample.Criteria criteria = example.createCriteria();
        // 3.封装查询条件
        criteria.andLoginacctEqualTo(loginacct);
        // 4.执行查询
        List<MemberPO> list = memberPOMapper.selectByExample(example);
        // 5.获取结果
        if (list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class,readOnly = false)
    @Override
    public void saveMember(MemberPO memberPO) {
        memberPOMapper.insertSelective(memberPO);
    }
}
