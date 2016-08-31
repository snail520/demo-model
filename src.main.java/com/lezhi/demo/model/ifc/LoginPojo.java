package com.lezhi.demo.model.ifc;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginPojo {
	
  @NotEmpty(message="应用id不能为空")
  @Size(max=36, message="应用id[appId]不能超过10位")
  private String appId;
  
  @Pattern(regexp = "pc|android|ios", message="来源[source]值非法,值只能从pc、android、ios中选择")  
  private String source;
  
  @NotEmpty(message="登录名[loginName]不能为空")
  @Size(max=36, message="登录名[loginName]不能超过11位")
  private String loginName;
  
  @NotEmpty(message="密码[password]不能为空")
  @Size(max=36, message="密码[password]不能超过6位")
  private String password;
  
public String getAppId() {
	return appId;
}
public void setAppId(String appId) {
	this.appId = appId;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getLoginName() {
	return loginName;
}
public void setLoginName(String loginName) {
	this.loginName = loginName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  
  
}
