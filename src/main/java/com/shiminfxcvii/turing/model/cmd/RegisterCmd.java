package com.shiminfxcvii.turing.model.cmd;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

/**
 * 业务注册类
 *
 * @author ShiminFXCVII
 * @since 12/29/2022 11:45 AM
 */
@Schema(name = "业务注册类")
@Getter
@Setter
public class RegisterCmd {

    /**
     * 单位信息
     * 单位名称
     */
    @Schema(description = "单位名称")
    @NotBlank(message = "单位名称不能为空")
    private String name;

    /**
     * 信用代码
     */
    @Schema(description = "信用代码")
    @NotBlank(message = "信用代码不能为空")
    @Length(min = 18, max = 18, message = "请填写正确的信用代码")
    private String code;

    /**
     * 单位所在省
     */
    @Schema(description = "单位所在省")
    @NotNull(message = "单位所在省不能为空")
    private Integer provinceCode;

    /**
     * 单位所在市
     */
    @Schema(description = "单位所在市")
    @NotNull(message = "单位所在市不能为空")
    private Integer cityCode;

    /**
     * 单位所在县
     */
    @Schema(description = "单位所在县")
    @NotNull(message = "单位所在县不能为空")
    private Integer districtCode;

    /**
     * 单位地址详情
     */
    @Schema(description = "单位地址详情")
    private String address;

    /**
     * 单位法人
     */
    @Schema(description = "单位法人")
    private String legalPerson;

    /**
     * 联系电话
     */
    @Schema(description = "联系电话")
    private String phone;

    /**
     * 组织机构成立日期
     */
    @Schema(description = "组织机构成立日期")
    @Past(message = "请选择正确的日期")
    private LocalDateTime establishmentDate;

    /**
     * 用户信息
     * 用户姓名
     */
    @Schema(description = "用户姓名")
    @NotBlank(message = "用户姓名不能为空")
    private String nickName;

    /**
     * 用户手机号
     */
    @Schema(description = "用户手机号")
    @NotBlank(message = "用户手机号不能为空")
    private String mobile;

    /**
     * 登录账号
     */
    @Schema(description = "登录账号")
    @NotBlank(message = "登录账号不能为空")
    private String username;

    /**
     * 身份证
     */
    @Schema(description = "身份证")
    private String idCard;

}