package com.ds.webServiceDemo;

import java.io.FileNotFoundException;

import javax.activation.DataHandler;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;


@WebService(endpointInterface = "com.ds.webServiceDemo.FileService",targetNamespace="http://cems.ds/fileService")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface FileService {

	/**
	 * 上传文件
	 * @param fileName	文件名
	 * @param file	文件信息，二进制文件
	 * @return
	 */
    public Result uploadFile(@WebParam(name = "fileName")String fileName, @WebParam(name = "file")DataHandler file);

    /**
     * 下载文件
     * @param filePath	需要下载的文件路径，也可以是文件标识
     * @return
     */
    public DataHandler downloadFile(@WebParam(name = "filePath")String filePath)throws FileNotFoundException ;
}
