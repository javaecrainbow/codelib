package com.rose4j.java.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class OutUserInfo implements IOutUserInfo {

	@Override
	public Map getUserBaseInfo() {
		Map baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "Ա������");
		baseInfoMap.put("userMobile", "Ա����ϵ��ʽ");
		return baseInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		Map homeMap = new HashMap();
		homeMap.put("homeAddress", "Ա����ͥסַ");
		homeMap.put("userTelNum", "Ա���ļ�ͥ�绰");
		return homeMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		Map officeMap = new HashMap();
		officeMap.put("jobPoisition", "Ա������ְλ");
		return officeMap;
	}

}
