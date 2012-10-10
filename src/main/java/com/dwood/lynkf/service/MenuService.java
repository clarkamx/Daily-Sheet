package com.dwood.lynkf.service;

import net.sf.json.JSONArray;

public interface MenuService {
	JSONArray loadMenu(String parentId) throws Exception;
}
