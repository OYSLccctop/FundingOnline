package com.ccctop.cloud.service.impl;

import com.ccctop.cloud.mapper.AddressMapper;
import com.ccctop.cloud.mapper.OrderPOMapper;
import com.ccctop.cloud.mapper.OrderProjectMapper;
import com.ccctop.cloud.service.api.OrderService;
import com.ccctop.crowd.entity.po.Address;
import com.ccctop.crowd.entity.po.AddressExample;
import com.ccctop.crowd.entity.po.OrderPO;
import com.ccctop.crowd.entity.po.OrderProject;
import com.ccctop.crowd.entity.vo.AddressVO;
import com.ccctop.crowd.entity.vo.OrderProjectVO;
import com.ccctop.crowd.entity.vo.OrderVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class OderServiceImpl implements OrderService {
    @Autowired
    private OrderProjectMapper orderProjectMapper;
    @Autowired
    private OrderPOMapper orderPOMapper;
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public OrderProjectVO getOrderProjectVO(Integer projectId, Integer returnId) {
        return orderProjectMapper.selectOrderProjectVO(returnId);
    }

    @Override
    public List<AddressVO> getAddressVOList(Integer memberId) {
        AddressExample example = new AddressExample();
        example.createCriteria().andMemberIdEqualTo(memberId);
        List<Address> addressList = addressMapper.selectByExample(example);
        List<AddressVO> addressVOList = new ArrayList<>();
        for (Address addressPO : addressList) {
            AddressVO addressVO = new AddressVO();
            BeanUtils.copyProperties(addressPO, addressVO);
            addressVOList.add(addressVO);
        }
        return addressVOList;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    @Override
    public void saveAddress(AddressVO addressVO) {
        Address address = new Address();
        BeanUtils.copyProperties(addressVO, address);
        addressMapper.insert(address);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    @Override
    public void saveOrder(OrderVO orderVO) {
        OrderPO orderPO = new OrderPO();
        BeanUtils.copyProperties(orderVO, orderPO);
        OrderProject orderProject = new OrderProject();
        BeanUtils.copyProperties(orderVO.getOrderProjectVO(), orderProject);
        orderPOMapper.insert(orderPO);
        Integer id = orderPO.getId();
        orderProject.setOrderId(id);
        orderProjectMapper.insert(orderProject);
    }
}
