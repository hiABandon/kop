package com.github.kop.bbs.module.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 论坛的板块 */
@ApiModel(value = "论坛的板块")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "bbs_category")
public class Category implements Serializable {
  /** 论坛主键 */
  @TableId(value = "category_id", type = IdType.AUTO)
  @ApiModelProperty(value = "版块主键")
  private Long categoryId;

  /** 分类名称 */
  @TableField(value = "category_name")
  @ApiModelProperty(value = "分类名称")
  private String categoryName;

  /** 分类图标 */
  @TableField(value = "category_icon")
  @ApiModelProperty(value = "分类图标")
  private String categoryIcon;

  /** 上级id */
  @TableField(value = "parent_id")
  @ApiModelProperty(value = "上级id")
  private Long parentId;

  /** 分类查看权限 0 全部 1 登录用户 2 支付积分(会员免费积分查看可以视为直接支付过积分) 4 会员 */
  @TableField(value = "view_permissions")
  @ApiModelProperty(value = "分类查看权限 0 全部 1 登录用户 2 支付积分(会员免费积分查看可以视为直接支付过积分) 4 会员")
  private Integer viewPermissions;

  /** 创建时间 */
  @TableField(value = "create_time", fill = FieldFill.INSERT)
  @ApiModelProperty(value = "创建时间")
  private LocalDateTime createTime;

  /** 创建用户 */
  @TableField(value = "create_user_id", fill = FieldFill.INSERT)
  @ApiModelProperty(value = "创建用户")
  private Long createUserId;

  /** 更新时间 */
  @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
  @ApiModelProperty(value = "更新时间")
  private LocalDateTime updateTime;

  /** 更新用户 */
  @TableField(value = "update_user_id", fill = FieldFill.INSERT_UPDATE)
  @ApiModelProperty(value = "更新用户")
  private Long updateUserId;

  /** 逻辑删除标记位 */
  @TableField(value = "deleted")
  @TableLogic
  @ApiModelProperty(value = "逻辑删除标记位")
  private Integer deleted;

  /** 乐观锁 */
  @TableField(value = "version")
  @Version
  @ApiModelProperty(value = "乐观锁")
  private Long version;

  private static final long serialVersionUID = 1L;
}
