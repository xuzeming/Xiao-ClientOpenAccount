package com.zl.pojo;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class IdentifyJsonObject implements Serializable{

	private static final long serialVersionUID = -7731764183502995514L;
	
	private List<JSONObject> jSONObject;

	public List<JSONObject> getjSONObject() {
		return jSONObject;
	}

	public void setjSONObject(List<JSONObject> jSONObject) {
		this.jSONObject = jSONObject;
	}
	
}
