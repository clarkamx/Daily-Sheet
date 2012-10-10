package com.dwood.lynkf.service.impl;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.dwood.lynkf.dao.MenuMapper;
import com.dwood.lynkf.domain.Menu;
import com.dwood.lynkf.domain.MenuCriteria;
import com.dwood.lynkf.service.MenuService;

public class MenuServiceImpl implements MenuService {
	private MenuMapper menuDao;

	public void setMenuDao(MenuMapper menuDao) {
		this.menuDao = menuDao;
	}

	@Override
	public JSONArray loadMenu(String parentId) throws Exception {
		MenuCriteria criteria = new MenuCriteria();
		criteria.or().andParentIdEqualTo(parentId);
		List<Menu> menus = menuDao.selectByExample(criteria);
		JSONArray jsonArray = new JSONArray();
		for(Menu menu: menus) {
			JSONObject jsonObj = new JSONObject();
			jsonObj.element("text", menu.getName());
			jsonObj.element("id", menu.getId());
			jsonObj.element("iconCls", menu.getCls());
			jsonObj.element("leaf", menu.getLeaf());
			jsonArray.add(jsonObj);
		}
		return jsonArray;
	}

}
