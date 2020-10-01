package view;

import javax.swing.*;

import model.Math;
import model.MathQuestions;

import java.awt.*;

public class MathCanvas extends JPanel {

	private MathPanel panel;
	private int questionIndex = -1;

	public MathCanvas(MathPanel panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(350, 400));
		setBackground(Color.GREEN);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		if (questionIndex >= 0) {
			Math q = MathQuestions.bank.get(questionIndex);
			q.render(g2);
		}
	}

	public void setQuestionIndex(int index) {
		questionIndex = index;
	}

	public int getQuestionIndex() {
		return questionIndex;
	}

}
