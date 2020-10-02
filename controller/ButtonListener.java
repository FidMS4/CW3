package controller;

import java.awt.event.*;
import javax.swing.*;

import model.MathQuestions;
import view.MathPanel;

public class ButtonListener implements ActionListener {

	private MathPanel panel;

	public ButtonListener(MathPanel panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();
		if (source == panel.getIntegralButton()) {
			int index = panel.getCanvas().getQuestionIndex();
			++index;
			if (index == 3) {
				index = 0;
			}
			panel.getCanvas().setQuestionIndex(index);
			panel.getCanvas().repaint();

		} else if (source == panel.getDerivativeButton()) {
			int index = panel.getCanvas().getQuestionIndex();
			
			++index;
			if (index == 6) {
				index = 3;
			}
			panel.getCanvas().setQuestionIndex(index);
			panel.getCanvas().repaint();
			
		} else if (source == panel.getLimitButton()) {
			int index = panel.getCanvas().getQuestionIndex();
			
			++index;
			if (index == 9) {
				index = 6;
			}
			panel.getCanvas().setQuestionIndex(index);
			panel.getCanvas().repaint();

		} else if (source == panel.getAButton()) {
			

		} else if (source == panel.getBButton()) {
			

		} else if (source == panel.getCButton()) {
			

		} else if (source == panel.getDButton()) {
			
		}


		// } else if (button == panel.getPrevButton()) {
		// 	int index = panel.getCanvas().getQuestionIndex();
		// 	--index;
		// 	if (index < 0) {
		// 		index = QuestionBank.database.size()-1;
		// 	}
		// 	panel.getCanvas().setQuestionIndex(index);
		// 	panel.getCanvas().repaint();
		// } else if (button == panel.getEnterButton()) {
		// 	int index = panel.getCanvas().getQuestionIndex();
		// 	if (index < 0) {
		// 		JOptionPane.showMessageDialog(panel.getWindow(), "No question presented yet");
		// 		return;
		// 	}
		// 	String response = panel.getAnswerField().getText();
		// 	String message;
		// 	if (QuestionBank.database.get(index).checkAnswer(response)) {
		// 		message = response + ": Correct answer!";
		// 	} else {
		// 		message = response + ": Wrong answer!";
		// 	}
		// 	JOptionPane.showMessageDialog(panel.getWindow(), message);
		// 	panel.getAnswerField().setText("");
		//}

	}
}
