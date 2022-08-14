package com.github.kop.bbs.module.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户黑名单
 */
@ApiModel(value = "用户黑名单")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "bbs_user_black_list")
public class UserBlackList implements Serializable {
    /**
     * 黑名单主键
     */
    @TableId(value = "black_list_id", type = IdType.AUTO)
    @ApiModelProperty(value = "黑名单主键")
    private Long blackListId;

    /**
     * 拉黑的人
     */
    @TableField(value = "black_user_id")
    @ApiModelProperty(value = "拉黑的人")
    private Long blackUserId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 创建用户
     */
    @TableField(value = "create_user_id")
    @ApiModelProperty(value = "创建用户")
    private Long createUserId;

    private static final long serialVersionUID = 1L;
}