package model;

import java.util.*;
import java.awt.*;

public class Limits extends Math {
	private ArrayList<String> choices;

	public Limits(String text, int answer) {
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
		g2.setBackground(Color.green);
		g2.setColor(Color.white);

		g2.drawLine(50, 75, 50, 75);

		g2.setFont(new Font("courier", Font.BOLD, 12));
		int no = 1;
		for (var c: choices) {
			g2.drawString(no + ". " + c, 80, no * 50 + 100);
			++no;
		}
	}
}