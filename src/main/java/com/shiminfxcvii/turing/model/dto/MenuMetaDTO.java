package com.shiminfxcvii.turing.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema
@Getter
@Setter
public class MenuMetaDTO {

    /**
     * 菜单名称
     */
    @Schema(description = "菜单名称")
    private String title;

    /**
     * 菜单图标
     */
    @Schema(description = "菜单图标")
    private String icon;

    /**
     * 是否隐藏菜单
     */
    @Schema(description = "是否隐藏菜单")
    private Boolean hideMenu;

}