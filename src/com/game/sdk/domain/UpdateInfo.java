package com.game.sdk.domain;

import com.alibaba.fastjson.annotation.JSONField;

public class UpdateInfo {
	public String face;
	
	@JSONField(name = "point_action_msg")
	public String pointMessage;
}
