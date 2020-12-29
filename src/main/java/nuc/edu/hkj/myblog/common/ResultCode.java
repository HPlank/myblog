package nuc.edu.hkj.myblog.common;


public enum ResultCode {
 
    SUCCESS("200", "Success!"),
 
    FAIL("400", "Failure!"),
    
    NO_PERMISSION("403", "Need Authorities!"),//没有权限
    LOGIN_NO("402", "Need Login!"),//未登录
    LOGIN_FAIL("401", "Login Failure!"),//登录失败
    LOGIN_SUCCESS("200", "Login Success!"),//登录成功
    LOGOUT_SUCCESS("200", "Logout Success!"),//退出登录
    SESSION_EXPIRES("101", "Session Expires!"),//会话到期
    SESSION_EXPIRES_OTHER_LOGIN("101", "Session Expires!Other users login！"),//会话到期,其他用户登录
    NOERROR("505","未知错误，请联系管理员");
    
    private String code;
    private String message;
    
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
	/**
	 * 
	 * @param code
	 * @param message
	 */
    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
 
}
 