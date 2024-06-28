package com.bean;

public class ValueBean {

	private float firstvalue;
	private float secondvalue;
	private float result;

	public float getFirstvalue() {
		return firstvalue;
	}

	public void setFirstvalue(float firstvalue) {
		this.firstvalue = firstvalue;
	}

	public float getSecondvalue() {
		return secondvalue;
	}

	public void setSecondvalue(float secondvalue) {
		this.secondvalue = secondvalue;
	}

	public float getResult() {
		result = firstvalue + secondvalue;
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

}
