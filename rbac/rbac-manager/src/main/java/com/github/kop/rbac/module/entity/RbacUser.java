package com.github.kop.rbac.module.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户表
 *
 * @author root
 * @since 2022-07-25
 */
@Getter
@Setter
@TableName("rbac_user")
public class RbacUser implements Serializable {

  private static final long serialVersionUID = 1L;

  /** 主键 */
  @TableId("id")
  private Long id;

  /** 创建时间 */
  @TableField(value = "create_time", fill = FieldFill.INSERT)
  private LocalDateTime createTime;

  /** 创建用户 */
  @TableField(value = "create_user_id", fill = FieldFill.INSERT)
  private Long createUserId;

  /** 更新时间 */
  @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
  private LocalDateTime updateTime;

  /** 更新用户 */
  @TableField(value = "update_user_id", fill = FieldFill.INSERT_UPDATE)
  private Long updateUserId;

  /** 逻辑删除标记位 */
  @TableField("deleted")
  private Integer deleted;

  /** 乐观锁 */
  @TableField("version")
  @Version
  private Long version;
  /** 姓名 */
  @TableField("name")
  private String name;

  /** 联系方式 */
  @TableField("phone")
  private String phone;

  /** 性别 */
  @TableField("grade")
  private Integer grade;
  /** 企业id */
  @TableField("company_id")
  private Long companyId;
}
