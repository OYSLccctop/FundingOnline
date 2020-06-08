package com.ccctop.cloud.service.api;

import com.ccctop.crowd.entity.vo.AddressVO;
import com.ccctop.crowd.entity.vo.OrderProjectVO;
import com.ccctop.crowd.entity.vo.OrderVO;

import java.util.List;

public interface OrderService {
    OrderProjectVO getOrderProjectVO(Integer projectId, Integer returnId);

    List<AddressVO> getAddressVOList(Integer memberId);

    void saveAddress(AddressVO addressVO);

    void saveOrder(OrderVO orderVO);
}
