package com.ds.webServiceDemo;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(endpointInterface = "com.ds.webServiceDemo.UserService",targetNamespace="http://cems.ds/userService")
public interface UserService {
	
	/**
	 * 用户登录
	 * @param userAccount	账号
	 * @param password	密码
	 * @return
	 */
	public Result login(@WebParam(name = "userAccount")String userAccount, @WebParam(name = "password")String password);
    
	/**
	 * 获取用户详细信息
	 * @param userId	用户ID
	 * @return
	 */
    public Result getUserDetalis(@WebParam(name = "userId")String userId);

}
