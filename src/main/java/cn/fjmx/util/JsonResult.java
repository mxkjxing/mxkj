package cn.fjmx.util;

/**
 * 用于封装返回给客户端的数据的类
 * @param <T> 响应数据的类型
 */
public class JsonResult<T> {
	private Integer state;
	private String message;
	private T data;
	
	public JsonResult() { 
		super();
	}
	public JsonResult(Integer state) {
		super();
		this.state = state;
	}
	public JsonResult(Integer state, T data) {
		super();
		this.state = state;
		this.data = data;
	}
	public JsonResult(Throwable e) {
		super();
		this.message = e.getMessage();
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", message=" + message + ", data=" + data + "]";
	}
	
}
