package com.ds.webServiceDemo;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class ServiceMain {
    public static void main( String[] args ){
        System.out.println("webService服务正在启动");
        String serverIp = "127.0.0.1";
        String serverPort = "8080";
        String userServiceUrl = "http://"+serverIp+":"+serverPort+"/userService";
        String fileServiceUrl = "http://"+serverIp+":"+serverPort+"/fileService";
        Endpoint.publish(userServiceUrl, new UserServiceImpl());
        System.out.println("userService发布地址：" + userServiceUrl);
        Endpoint.publish(fileServiceUrl, new FileServiceImpl());
        System.out.println("fileService发布地址：" + fileServiceUrl);
        System.out.println("webService服务启动成功");
    }
}
