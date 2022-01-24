package com.company.strategy;

import com.company.strategy.duck.MallardDuck;
import com.company.strategy.duck.RubberDuck;
import com.company.strategy.quack.Quack;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuck = new RubberDuck();


		mallard.performQuack();
		mallard.display();

		rubberDuck.performQuack();
		rubberDuck.display();

		rubberDuck.setQuackBehavior(new Quack());

		mallard.performQuack();
		mallard.display();

		rubberDuck.performQuack();
		rubberDuck.display();

	}
}
