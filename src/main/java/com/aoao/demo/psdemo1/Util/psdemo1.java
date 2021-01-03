package com.aoao.demo.psdemo1.Util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class psdemo1 implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Integer stauts;
    private Date CREATETIME;
}
