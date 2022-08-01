package com.github.kop.rbac.module.req.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UpdateUserReq {
  private Long id;
  /** 姓名 */
  @ApiModelProperty(value = "姓名")
  private String name;

  /** 联系方式 */
  @ApiModelProperty(value = "联系方式")
  private String phone;

  /** 性别 */
  @ApiModelProperty(value = "性别")
  private Integer grade;
}
