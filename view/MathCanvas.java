package view;

import javax.swing.*;

import model.Math;
import model.MathQuestions;

import java.awt.*;

public class MathCanvas extends JPanel {

	private MathPanel panel;
	private int questionIndex = -1;
	private int derivQuestionIndex = -1;
	private int limQuestionIndex = -1;
	
	public MathCanvas(MathPanel panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(500, 350));
		setBackground(Color.black);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		if (questionIndex >= 0) {
			Math set1 = MathQuestions.intBank.get(questionIndex);
			set1.render(g2);
		} else if (derivQuestionIndex >= 0) {
			Math set2 = MathQuestions.derivBank.get(derivQuestionIndex);
			set2.render(g2);
		} else if (limQuestionIndex >= 0) {
			Math set3 = MathQuestions.limBank.get(limQuestionIndex);
			set3.render(g2);
		}
	}

	public void setQuestionIndex(int index) {
		questionIndex = index;
	}

	public int getQuestionIndex() {
		return questionIndex;
	}

	public void setDerivQuestionIndex(int index) {
		derivQuestionIndex = index;
	}

	public int getDerivQuestionIndex() {
		return derivQuestionIndex;
	}

	public void setLimQuestionIndex(int index) {
		limQuestionIndex = index;
	}

	public int getLimQuestionIndex() {
		return limQuestionIndex;
	}

}
