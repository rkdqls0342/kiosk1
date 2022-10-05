package edu.sungil.foods.web.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.sungil.foods.web.domain.dto.MenuInfo;
import edu.sungil.foods.web.domain.dto.OrdInfo;
import edu.sungil.foods.web.domain.dto.SchMenuInfo;
import edu.sungil.foods.web.domain.dto.SchOrdInfo;

@Mapper
public interface AdminMapper {
	void insertMenu(MenuInfo menuInfo);

	List<MenuInfo> selectMenuList(SchMenuInfo schMenuInfo);

	void updateMenu(MenuInfo menuInfo);

	void insertOrd(OrdInfo ordInfo);

	List<OrdInfo> selectOrdList(SchOrdInfo schOrdInfo);

	void updateOrd(OrdInfo ordInfo);
	
}