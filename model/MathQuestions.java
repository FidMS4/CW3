package model;

import java.util.*;

public class MathQuestions {

	public static final ArrayList<Math> bank = new ArrayList<>();

	static {
		// integrals
		var q1 = new Integrals("What is the integral of 16x^3", 2);
		q1.addChoice("4x + C");
		q1.addChoice("4x^4 + C");
		q1.addChoice("48x^2 + C");
		q1.addChoice("4x^2 + C");

		var q2 = new Integrals("What is the integral of 1/x?", 4);
		q2.addChoice("x/x^2 + C");
		q2.addChoice("ln + C");
		q2.addChoice("e^x + C");
		q2.addChoice("ln|x| + C");

		var q3 = new Integrals("What is the integral of sin(4x)?", 1);
		q2.addChoice("-cos(4x)/4 + C");
		q2.addChoice("4cos(4x) + C");
		q2.addChoice("sin(4x)/4 + C");
		q2.addChoice("-sin(4x)/4 + C");

		// derivatives
		var q4 = new Derivatives("What is the 2nd derivative of cos(x)?", 3);
		q2.addChoice("cos(x)");
		q2.addChoice("sin(x)");
		q2.addChoice("-cos(x)");
		q2.addChoice("-sin(x)");

		var q5 = new Derivatives("What is the derivative of 3^x?", 1);
		q2.addChoice("3^xln(3)");
		q2.addChoice("3x^2");
		q2.addChoice("ln(3^x)");
		q2.addChoice("e^(3x)");

		var q6 = new Derivatives("What is the derivative of x^3e^x?", 2);
		q2.addChoice("e^x + 2x^2)");
		q2.addChoice("e^x(x^3) + 3e^x(x^2)");
		q2.addChoice("e^3(x^x)");
		q2.addChoice("3x^2(e^x) + 3x^2(e^x)");

		// limits
		var q7 = new Limits("What is the limit as x goes to infinity of ?", 2);
		q2.addChoice("");
		q2.addChoice("");
		q2.addChoice("");
		q2.addChoice("");

		var q8 = new Limits("What is ?", 2);
		q2.addChoice("");
		q2.addChoice("");
		q2.addChoice("");
		q2.addChoice("");

		var q9 = new Limits("?", 2);
		q2.addChoice("");
		q2.addChoice("");
		q2.addChoice("");
		q2.addChoice("");

		bank.add(q1);
		bank.add(q2);
		bank.add(q3);
		bank.add(q4);
		bank.add(q5);
		bank.add(q6);
		bank.add(q7);
		bank.add(q8);
		bank.add(q9);

	}
}
