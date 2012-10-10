package com.dwood.lynkf.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.dwood.lynkf.service.MenuService;

public class MenuAction {
	private MenuService menuService;
	
	private String parentId;

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	public void loadTreeNode() throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/json");
		response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        JSONArray jsonArray = null;
        try {
        	jsonArray = menuService.loadMenu(parentId);
		} catch (Exception e) {
			jsonArray = null;
		} finally {
			out.write(jsonArray.toString());
			out.flush();
			out.close();
		}
	}
}
