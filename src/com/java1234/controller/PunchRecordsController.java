package com.java1234.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java1234.entity.PunchRecords;
import com.java1234.service.PunchRecordsService;
import com.java1234.util.ResponseUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/punchRecords")
public class PunchRecordsController {

	@Resource
	private PunchRecordsService service;
	
	@RequestMapping("/save")
	public String save(PunchRecords punchRecords,HttpServletResponse response)throws Exception{
		int resultTotal=0; 
		System.err.println("save进来了！！");
		punchRecords.setDate(new Date());
		punchRecords.setPlace("上课的肌肤");
		punchRecords.setState("1");
		resultTotal = service.add(punchRecords);
		JSONObject result=new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
}
