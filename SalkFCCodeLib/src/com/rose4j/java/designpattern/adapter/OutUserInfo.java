package com.rose4j.java.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class OutUserInfo implements IOutUserInfo {

	@Override
	public Map getUserBaseInfo() {
		Map baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "员工姓名");
		baseInfoMap.put("userMobile", "员工联系方式");
		return baseInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		Map homeMap = new HashMap();
		homeMap.put("homeAddress", "员工家庭住址");
		homeMap.put("userTelNum", "员工的家庭电话");
		return homeMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		Map officeMap = new HashMap();
		officeMap.put("jobPoisition", "员工工作职位");
		return officeMap;
	}

}
