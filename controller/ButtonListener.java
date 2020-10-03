package controller;

import java.awt.event.*;
import javax.swing.*;

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
			int derivIndex = panel.getCanvas().getDerivQuestionIndex();
			++derivIndex;
			if (derivIndex == 3) {
				derivIndex = 0;
			}
			panel.getCanvas().setDerivQuestionIndex(derivIndex);
			panel.getCanvas().repaint();
			
		} else if (source == panel.getLimitButton()) {
			int limIndex = panel.getCanvas().getLimQuestionIndex();
			++limIndex;
			if (limIndex == 3) {
				limIndex = 0;
			}
			panel.getCanvas().setLimQuestionIndex(limIndex);
			panel.getCanvas().repaint();

		} else if (source == panel.getAButton()) {
			panel.getSubmitButton().setEnabled(true);

		} else if (source == panel.getBButton()) {
			panel.getSubmitButton().setEnabled(true);

		} else if (source == panel.getCButton()) {
			panel.getSubmitButton().setEnabled(true);

		} else if (source == panel.getDButton()) {
			panel.getSubmitButton().setEnabled(true);


		} else if (source == panel.getSubmitButton()) {
			int index = panel.getCanvas().getQuestionIndex();
			// if (index < 0) {
			// 	JOptionPane.showMessageDialog(panel.getWindow(), "Pick a set of questions first");
			// 	return;
			// }
		// 	String response = Button.getText();
			
		// 	if (QuestionBank.database.get(index).checkAnswer(response)) {
		// 		message = response + ": Correct answer!";
		// 	} else {
		// 		message = response + ": Wrong answer!";
		// 	}
		// 	JOptionPane.showMessageDialog(panel.getWindow(), message);
		 }
		}

}
