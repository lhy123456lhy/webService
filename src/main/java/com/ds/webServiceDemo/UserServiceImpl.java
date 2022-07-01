package com.ds.webServiceDemo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
public class UserServiceImpl implements UserService {
	@WebMethod
	@Override
	public Result login(String userAccount, String password) {
		/**
		 * 进行业务处理
		 */
		return null;
	}
	@WebMethod
	@Override
	public Result getUserDetalis(String userId) {
		/**
		 * 进行业务处理
		 */
		return null;
	}

}
