package edu.sungil.foods.web.domain.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MenuInfo {
	private long menuNo;
	private String menuNm;
	private long menuPrc;
	private String menuDesc;
	private long menuStockQty;
	private String menuDispYn;
	private MultipartFile menuImgNm;
	private String fileNm;
}
