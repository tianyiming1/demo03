package com.ibeetl.admin.core.gen.model;


import com.ibeetl.admin.core.annotation.MyConstraint;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


//用於自定義注解測試
@Data
public class User {

  //  @MyConstraint(max = 1,min = 1)
  //@NotBlank(message = "请输入名称")
  @Length(message = "名称不能超过个 {max} 字符", max = 10)
  private String name;
  
  //@NotNull(message = "请输入地址")
  //@Range(message = "地址范围为 {min} 到 {max} 之间", min = 1, max = 100)
  @Length(message = "名称不能超过个 {max} 字符", max = 10)
  private String address;

  
}
