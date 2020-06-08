package com.ccctop.crowd.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberLoginVO implements Serializable {
    private Integer id;
    private String username;
    private String email;
}
