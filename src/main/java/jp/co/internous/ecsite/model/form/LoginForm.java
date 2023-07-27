package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm  implements Serializable {
	
	private String userName;
	private String password;
	
//	userNameの設定と取得
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
//	passwordの設定と取得
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}

}
