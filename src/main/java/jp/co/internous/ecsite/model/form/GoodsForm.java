package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class GoodsForm implements Serializable{
	
//	フィールド変数（mst_userテーブルのカラム）
	private int id;
	private String goodsName;
	private int price;
	
//	idの設定と取得
	public int getId () {
		return id ;
	}
	public void setId (int id) {
		this.id = id;
	}
	
//	goodsNameの設定と取得
	public String getGoodsName () {
		return goodsName ;
	}
	public void setGoodsName (String goodsName) {
		this.goodsName = goodsName;
	}

//	priceの設定と取得
	public int getPrice () {
		return price ;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	

}
