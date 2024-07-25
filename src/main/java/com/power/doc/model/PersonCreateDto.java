package com.power.doc.model;

import com.power.doc.enums.Sex;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author yu 2021/7/11.
 */
public class PersonCreateDto {
    /**
     * 谈钱不伤感情
     */
    private BigDecimal money;

    /**
     * 名字
     *
     * @mock 张三
     */
    private String name;
    /**
     * 性别
     *
     * @mock male
     */
    private Sex sex;
    /**
     * 子女ID
     */
    private List<Integer> childrenIds;


}
