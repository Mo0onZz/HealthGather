package com.java1234.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.PunchRecordsDao;
import com.java1234.entity.PunchRecords;
import com.java1234.service.PunchRecordsService;
@Service("PunchRecordsService")
public class PunchRecordsServiceImpl implements PunchRecordsService {

	@Resource
	private PunchRecordsDao punchRecordsDao;
	@Override
	public int add(PunchRecords punchRecords) {
		return punchRecordsDao.add(punchRecords);
	}

}
