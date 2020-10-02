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
		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.BLACK);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		if (questionIndex >= 0) {
			Math set1 = MathQuestions.intBank.get(questionIndex);
			set1.render(g2);
		} else if (questionIndex >= 3) {
			Math set2 = MathQuestions.derivBank.get(questionIndex);
			set2.render(g2);
		} else if (questionIndex >= 6) {
			Math set3 = MathQuestions.limBank.get(questionIndex);
			set3.render(g2);
		}
	}

	public void setQuestionIndex(int index) {
		questionIndex = index;
	}

	public int getQuestionIndex() {
		return questionIndex;
	}

}
