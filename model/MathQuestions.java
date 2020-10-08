package model;

import java.util.*;

public class MathQuestions {

	public static final ArrayList<Math> intBank = new ArrayList<>();
	public static final ArrayList<Math> derivBank = new ArrayList<>();
	public static final ArrayList<Math> limBank = new ArrayList<>();

	static {
		// integrals
		var q1 = new Integrals("What is the integral of 16x^3", 2);
		q1.addChoice("4x + C");
		q1.addChoice("4x^4 + C");
		q1.addChoice("48x^2 + C");
		q1.addChoice("4x^2 + C");

		var q2 = new Integrals("What is the integral of 1 / x?", 4);
		q2.addChoice("x / x^2 + C");
		q2.addChoice("ln + C");
		q2.addChoice("e^x + C");
		q2.addChoice("ln|x| + C");

		var q3 = new Integrals("What is the integral of sin(4x)?", 1);
		q3.addChoice("-cos(4x) / 4 + C");
		q3.addChoice("4cos(4x) + C");
		q3.addChoice("sin(4x) / 4 + C");
		q3.addChoice("-sin(4x) / 4 + C");

		// derivatives
		var q4 = new Derivatives("What is the 2nd derivative of cos(x)?", 3);
		q4.addChoice("cos(x)");
		q4.addChoice("sin(x)");
		q4.addChoice("-cos(x)");
		q4.addChoice("-sin(x)");

		var q5 = new Derivatives("What is the derivative of 3^x?", 1);
		q5.addChoice("3^xln(3)");
		q5.addChoice("3x^2");
		q5.addChoice("ln(3^x)");
		q5.addChoice("e^(3x)");

		var q6 = new Derivatives("What is the derivative of x^3e^x?", 2);
		q6.addChoice("e^x + 2x^2)");
		q6.addChoice("e^x(x^3) + 3e^x(x^2)");
		q6.addChoice("e^3(x^x)");
		q6.addChoice("3x^2(e^x) + 3x^2(e^x)");

		// limits
		var q7 = new Limits("What is the limit as x goes to 0 of x^2 / 3x^2?", 4);
		q7.addChoice("0");
		q7.addChoice("1");
		q7.addChoice("3");
		q7.addChoice("1/3");

		var q8 = new Limits("What is limit as x goes to infinity of 56 / x^4 + 6x?", 3);
		q8.addChoice("inf");
		q8.addChoice("-inf");
		q8.addChoice("0");
		q8.addChoice("1");

		var q9 = new Limits("What is limit as x goes to infinity of 2x^2+6x / 3x+24?", 2);
		q9.addChoice("2/3");
		q9.addChoice("inf");
		q9.addChoice("0");
		q9.addChoice("1/4");

		intBank.add(q1);
		intBank.add(q2);
		intBank.add(q3);
		derivBank.add(q4);
		derivBank.add(q5);
		derivBank.add(q6);
		limBank.add(q7);
		limBank.add(q8);
		limBank.add(q9);

	}
}
