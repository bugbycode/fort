package com.fort.module.rule;

import com.fort.module.resource.Resource;

public class RuleInfo extends Resource {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6536634835730123916L;

	private int ruleId;
	
	private String ruleName;

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
}