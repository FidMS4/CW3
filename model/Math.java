package model;

import java.awt.*;

public class Math {
	
	private String text; 
	private int answer;

	public Math(String text, int answer) {
		this.text = text;
		this.answer = answer;
	}

	public boolean checkAnswer(int response) {
		return response == answer;
	}

	public void display() {
		System.out.println(text);
	}

	public void render(Graphics2D g2) {
		g2.setColor(Color.white);
		g2.setFont(new Font("courier", Font.BOLD, 18));
		g2.drawString(text, 12, 100);
	}

}
