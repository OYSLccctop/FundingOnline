package com.ccctop.crowd.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnVO implements Serializable {
    private static final long serialVersionUID = 1L;
    // 回报类型：0 - 实物回报， 1 虚拟物品回报
    private Integer type;
    // 支持金额
    private Integer supportmoney;
    // 回报内容介绍
    private String content;
    // 总回报数量，0 为不限制
    private Integer count;
    // 是否限制单笔购买数量，0 表示不限购，1 表示限购
    private Integer signalpurchase;
    // 如果单笔限购，那么具体的限购数量
    private Integer purchase;
    // 运费，“0”为包邮
    private Integer freight;
    // 是否开发票，0 - 不开发票， 1 - 开发票
    private Integer invoice;
    // 众筹结束后返还回报物品天数
    private Integer returndate;
    // 说明图片路径
    private String describPicPath;
}
