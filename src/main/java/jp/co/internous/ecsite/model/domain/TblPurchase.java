package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {
//	フィールド変数（mst_userテーブルのカラム）
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private Timestamp createdAt;
	
//	idの設定と取得
	public int getId () {
		return id ;
	}
	public void setId (int id) {
		this.id = id;
	}
	
//	userIdの設定と取得
	public int getUserId () {
		return userId ;
	}
	public void setUserId (int userId) {
		this.userId = userId;
	}
	
//	goodsIdの設定と取得
	public int getGoodsId () {
		return goodsId ;
	}
	public void setGoodsId (int goodsId) {
		this.goodsId = goodsId;
	}
	
//	goodsNameの設定と取得
	public String getGoodsName () {
		return goodsName ;
	}
	public void setGoodsName (String goodsName) {
		this.goodsName = goodsName;
	}
	
//	itemCountの設定と取得
	public int getItemCount () {
		return itemCount ;
	}
	public void setItemCount (int itemCount) {
		this.itemCount = itemCount;
	}
	
//	totalの設定と取得
	public int getTotal () {
		return total ;
	}
	public void setTotal (int total) {
		this.total = total;
	}
	
//	createdAtの設定と取得
	public Timestamp getCreatedAt () {
		return createdAt ;
	}
	public void setCreatedAt (Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
}
