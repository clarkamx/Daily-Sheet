package com.dwood.lynkf.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.dwood.lynkf.common.util.MLogger;
import com.dwood.lynkf.service.MenuService;

public class MenuAction {
	@Autowired
	private MenuService menuService;
	
	private String parentId;

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
			MLogger.getLogger().error(e.getMessage());
			jsonArray = new JSONArray();
		} finally {
			out.write(jsonArray.toString());
			out.flush();
			out.close();
		}
	}
}
