package com.java1234.util;

import static org.junit.Assert.*;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.java1234.entity.PunchRecords;
import com.java1234.service.PunchRecordsService;

public class PunchRecordsTest {

	@Resource
	private PunchRecordsService service;
	
	@Test
	public void test() {
		PunchRecords punchRecords = new PunchRecords();
		punchRecords.setDate(new Date());
		punchRecords.setPlace("上课的肌肤");
		punchRecords.setState("1");
		System.out.println(service.add(punchRecords));
		
	}

}
