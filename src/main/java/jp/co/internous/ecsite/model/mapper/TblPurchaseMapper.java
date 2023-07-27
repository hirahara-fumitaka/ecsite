package jp.co.internous.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.internous.ecsite.model.dto.HistoryDto;

@Mapper
public interface TblPurchaseMapper {
	
	//履歴表示の際のtbl_purchaseテーブル表示
	List<HistoryDto> findHistory(int UserId);
	
	//カートから購入時、tbl_purchaseテーブルに追加
	int insert(int userId, int goodsId, String goodsName,int itemCount, int total );

}
