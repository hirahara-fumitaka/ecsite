package jp.co.internous.ecsite.model.domain;

public class MstUser {

//	フィールド変数（mst_userテーブルのカラム）
	private int id;
	private String userName;
	private String password;
	private String fullName;
	private int isAdmin;
	
//	idの設定と取得
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
	
//	fullNameの設定と取得
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
// isAdminの設定と取得
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
}
