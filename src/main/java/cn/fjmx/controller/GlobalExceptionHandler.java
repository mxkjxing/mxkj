package cn.fjmx.controller;



import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import cn.fjmx.controller.ex.FileEmptyException;
import cn.fjmx.controller.ex.FileIoException;
import cn.fjmx.controller.ex.FileSizeException;
import cn.fjmx.controller.ex.FileStateException;
import cn.fjmx.controller.ex.FileTypeException;
import cn.fjmx.controller.ex.FileUploadException;
import cn.fjmx.service.ex.ServiceException;
import cn.fjmx.util.JsonResult;



@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler({ServiceException.class, FileUploadException.class})
	public JsonResult<Void> handleException(Throwable ex) {
		JsonResult<Void> jsonResult = new JsonResult<>(ex);
		if (ex instanceof FileEmptyException) {
			jsonResult.setState(6000);
		} else if (ex instanceof FileIoException) {
			jsonResult.setState(6001);
		} else if (ex instanceof FileSizeException) {
			jsonResult.setState(6002);
		} else if (ex instanceof FileStateException) {
			jsonResult.setState(6003);
		} else if (ex instanceof FileTypeException) {
			jsonResult.setState(6004);
		} else if(ex instanceof FileUploadException) {
			jsonResult.setState(6005);
		}
		return jsonResult;
	}
}
