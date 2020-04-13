package cn.fjmx.controller;


import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {
/*
	@ExceptionHandler({ServiceException.class})
	public JsonResult<Void> handleException(Throwable ex) {
		JsonResult<Void> jsonResult = new JsonResult<>(ex);
		if (ex instanceof UsernameDuplicateException) {
			jsonResult.setState(6000);
		} else if (ex instanceof UserNotFoundException) {
			jsonResult.setState(6001);
		} else if (ex instanceof PasswordNotMatchException) {
			jsonResult.setState(6002);
		} else if (ex instanceof AccessDeniedException) {
			jsonResult.setState(6003);
		} else if (ex instanceof InsertException) {
			jsonResult.setState(6004);
		} else if(ex instanceof TombNotFoundException) {
			jsonResult.setState(6005);
		}else if(ex instanceof BereavedNotFoundException) {
			jsonResult.setState(6006);
		}else if(ex instanceof CommentatorsNotFoundException) {
			jsonResult.setState(6007);
		}else if(ex instanceof GiftNotFoundException) {
			jsonResult.setState(6008);
		}
		
		return jsonResult;
	}*/
	
}
