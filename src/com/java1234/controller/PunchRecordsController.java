package com.java1234.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java1234.entity.PunchRecords;

@Controller
@RequestMapping("/punchRecords")
public class PunchRecordsController {

	@RequestMapping("/save")
	public String save(PunchRecords punchRecords,HttpServletResponse response)throws Exception{
		System.err.println("save进来了！！");
		return null;
	}
}
