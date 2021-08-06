package com.techlab.model;

public class Division implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		return 0;
	}

}
