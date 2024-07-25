package com.power.doc.model;

import com.alibaba.fastjson2.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.power.common.util.ValidateUtil;
import com.power.doc.enums.ComplexEnum;
import com.power.doc.enums.DeviceDataExpressionEnum;
import com.power.doc.enums.OrderEnum;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author yu 2018/7/10.
 */
@Data
@Accessors(chain=true)
public class FastJson {




    /**
     * 复杂枚举
     */
    @NotNull
    @Length(min = 5, max = 16, message = "账号最少5位 最多16位")
    @Pattern(regexp = ValidateUtil.PHONE_PATTERN)
    private String expressionEnum;

    /**
     * 枚举
     * @mock ["2015421521","2014545545"]
     */
    private DeviceDataExpressionEnum dataExpressionEnum;


    /**
     * 菜单/权限编码
     *
     */
    private List<OrderEnum> menuPermissionCodes;

    /**
     * 学好
     * @mock 2019-01-01
     */
    private Date date;
    /**
     * 用户名
     * @mock cccccqqqqq
     */
    @JSONField(name = "name")
    @Length(max = 100, min = 10)
    private String username;


    /**
     * 身份证号
     */
    @JSONField(serialize = false)
    private String idCard;

    private int age;

    @JSONField(deserialize = false)
    private Integer age2;


    public String getUsername() {
        return username;
    }

    public FastJson setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public FastJson setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
}
