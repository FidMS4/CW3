package controller;

import java.awt.event.*;
import javax.swing.*;

import model.MathQuestions;
import view.MathPanel;
import view.MathPanel.QuestionState;

public class ButtonListener implements ActionListener {

	private MathPanel panel;
	int selectedAnswer = 0;

	public ButtonListener(MathPanel panel) {
		this.panel = panel;
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		if (source == panel.getIntegralButton()) {
			panel.setQuestionState(QuestionState.INTEGRAL);
			int index = panel.getCanvas().getQuestionIndex();
			++index;
			if (index == 3) {
				index = 0;
			}
			panel.getCanvas().setQuestionIndex(index);
			panel.getCanvas().repaint();

		} else if (source == panel.getDerivativeButton()) {
			panel.setQuestionState(QuestionState.DERIVATIVE);
			int derivIndex = panel.getCanvas().getDerivQuestionIndex();
			++derivIndex;
			if (derivIndex == 3) {
				derivIndex = 0;
			}
			panel.getCanvas().setDerivQuestionIndex(derivIndex);
			panel.getCanvas().repaint();
			
		} else if (source == panel.getLimitButton()) {
			panel.setQuestionState(QuestionState.LIMIT);
			int limIndex = panel.getCanvas().getLimQuestionIndex();
			++limIndex;
			if (limIndex == 3) {
				limIndex = 0;
			}
			panel.getCanvas().setLimQuestionIndex(limIndex);
			panel.getCanvas().repaint();

		} else if (source == panel.getOneButton()) {
			panel.getSubmitButton().setEnabled(true);
			selectedAnswer = 1;

		} else if (source == panel.getTwoButton()) {
			panel.getSubmitButton().setEnabled(true);
			selectedAnswer = 2;

		} else if (source == panel.getThreeButton()) {
			panel.getSubmitButton().setEnabled(true);
			selectedAnswer = 3;

		} else if (source == panel.getFourButton()) {
			panel.getSubmitButton().setEnabled(true);
			selectedAnswer = 4;

		} else if (source == panel.getSubmitButton()) {
			int index = panel.getCanvas().getQuestionIndex();
			int derivIndex = panel.getCanvas().getDerivQuestionIndex();
			int limIndex = panel.getCanvas().getLimQuestionIndex();
			MathPanel.QuestionState state = panel.getQuestionState();

			if (state == QuestionState.INTEGRAL) {
				String message;
				if (MathQuestions.intBank.get(index).checkAnswer(selectedAnswer)) {
					message = selectedAnswer + " is correct";
				} else {
					message = selectedAnswer + " is wrong";
				}
				JOptionPane.showMessageDialog(panel.getWindow(), message);
			}	

			else if (state == QuestionState.DERIVATIVE) {
				String message;
				if (MathQuestions.derivBank.get(derivIndex).checkAnswer(selectedAnswer)) {
					message = selectedAnswer + " is correct";
				} else {
					message = selectedAnswer + " is wrong";
				}
				JOptionPane.showMessageDialog(panel.getWindow(), message);
			}

			else  {
				//state = QuestionState.LIMIT;
				String message;
				if (MathQuestions.limBank.get(limIndex).checkAnswer(selectedAnswer)) {
					message = selectedAnswer + " is correct";
				} else {
					message = selectedAnswer + " is wrong";
				}
				JOptionPane.showMessageDialog(panel.getWindow(), message);
			}
		}
	}

}
