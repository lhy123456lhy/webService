package com.ds.webServiceDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.commons.io.FileUtils;

@WebService
public class FileServiceImpl implements FileService {

	@WebMethod
	@Override
	public Result uploadFile(String fileName, DataHandler handler) {
		Result result = new Result();
		//就可以将文件存放到本地了
		File file = new File("文件存放路径" + fileName);
		try {
			FileUtils.copyInputStreamToFile(handler.getDataSource().getInputStream(), file);
			result.setFlag(0);
			result.setData("文件上传成功");
		} catch (IOException e) {
			e.printStackTrace();
			result.setFlag(-1);
			result.setData("文件上传出现异常");
		}
		return result;
	}
	@WebMethod
	@Override
	public DataHandler downloadFile(String filePath) throws FileNotFoundException {
		File downloadFile = new File(filePath);
		if (!downloadFile.exists()) {
			System.out.println("需要下载的文件不存在");
			throw new FileNotFoundException(filePath + " does not exist");
		}
		DataHandler dataHandler = new DataHandler(new FileDataSource(filePath));
		return dataHandler;
	}

}
