package com.techlab.test;

import com.techlab.model.Addition;
import com.techlab.model.Context;
import com.techlab.model.Division;
import com.techlab.model.Multiplication;
import com.techlab.model.Substraction;

public class StrategyTest {

	public static void main(String[] args) {
		Context c = new Context(new Addition());
		System.out.println("40 + 20 = "+c.executeOpr(40, 20));
		
		c = new Context(new Multiplication());
		System.out.println("40 * 20 = "+c.executeOpr(40, 20));
		
		c = new Context(new Substraction());
		System.out.println("40 - 20 = "+c.executeOpr(40, 20));
		
		c = new Context(new Division());
		System.out.println("40 / 20 = "+c.executeOpr(40, 20));
	}

}
