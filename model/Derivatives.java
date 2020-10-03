package model;

import java.util.*;
import java.awt.*;

public class Derivatives extends Math {
	private ArrayList<String> choices;

	public Derivatives(String text, int answer) {
		super(text, answer);
		choices = new ArrayList<>();
	}

	public void addChoice(String c) {
		choices.add(c);
	}

	@Override
	public void display() {
		super.display();
		int no = 1;
		for (var c: choices) {
			System.out.println("\t" + no + "." + c);
			++no;
		}
	}

	@Override
	public void render(Graphics2D g2) {
		super.render(g2);
		g2.setColor(Color.red);
		g2.setFont(new Font("courier", Font.BOLD, 35));
		g2.drawString("Derivatives", 160, 50);

		g2.setColor(Color.white);
		g2.setFont(new Font("courier", Font.BOLD, 17));
		int no = 1;
		for (var c: choices) {
			g2.drawString(no + ". " + c, 14, no * 50 + 100);
			++no;
		}
	}
}
