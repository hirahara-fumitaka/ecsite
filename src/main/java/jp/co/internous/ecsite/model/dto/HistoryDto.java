package jp.co.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.domain.TblPurchase;

public class HistoryDto {
	
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private String createdAt;
	
//	idの設定と取得
	public int getId () {
		return id ;
	}
	public void setId (int id) {
		this.id = id;
	}
	
//  userIdの設定と取得
	public int getUserId () {
		return userId ;
	}
	public void setUserId (int userId) {
		this.userId = userId;
	}
//	goodsNameの設定と取得
	public int getGoodsId () {
		return goodsId ;
	}
	public void setGoodsName (int goodsId) {
		this.goodsId = goodsId;
	}

//	goodsNameの設定と取得
	public String getGoodsName () {
		return goodsName ;
	}
	public void setGoodsName (String goodsName) {
		this.goodsName = goodsName;
	}
	
//	priceの設定と取得
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
	public String getCreatedAt () {
		return createdAt ;
	}
	public void setCreatedAt (String createdAt) {
		this.createdAt = createdAt;
	}
	
	//コンストラクタの設定(今回使用しない)
	public HistoryDto() {}
	
	//コンストラクタの設定(今回使用しない)
	public HistoryDto(TblPurchase entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.goodsId = entity.getGoodsId();
		this.goodsName = entity.getGoodsName();
		this.itemCount = entity.getItemCount();
		this.total = entity.getTotal();
		
		Timestamp d = entity.getCreatedAt();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd hh:mm::ss");
		this.createdAt = f.format(d);
	}
}
