package com.techlab.model;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy stg) {
		this.strategy = stg;
	}
	
	public int executeOpr(int n1, int n2) {
		return strategy.doOperation(n1, n2);
	}
}
