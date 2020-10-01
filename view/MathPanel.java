package view;

import java.awt.*;
import javax.swing.*;

import controller.ButtonListener;

public class MathPanel {
	private JFrame window;
	private JButton intButton = new JButton("Integrals");
	private JButton derivButton = new JButton("Derivatives");
	private JButton limButton = new JButton("Limits");
	private JRadioButton[] choiceButtons;

	private JButton submitButton = new JButton("Submit");

	private MathCanvas canvas;

	public MathPanel(JFrame window) {
		this.window = window;
	}

	public void start() {
		Container cp = window.getContentPane();

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 5));
		cp.add(BorderLayout.SOUTH, panel);

		ButtonListener listener = new ButtonListener(this);

		choiceButtons = new JRadioButton[5];
		for (int i = 1; i <= 4; i++) {
			choiceButtons[i] = new JRadioButton("" + i);
			panel.add(choiceButtons[i]);
			choiceButtons[i].addActionListener(listener);
		}

		JPanel rightSide = new JPanel();
		rightSide.add(submitButton);
		submitButton.setPreferredSize(new Dimension(100, 400));
		cp.add(BorderLayout.EAST, rightSide);

		canvas = new MathCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);

		submitButton.addActionListener(listener);

	}

	public JRadioButton[] getChoiceButtons() {
		return choiceButtons;
	}

	// public JButton getQuitButton() {
	// 	return quitButton;
	// }

	// public JButton getEnterButton() {
	// 	return enterButton;
	// }


	// public JFrame getWindow() {
	// 	return window;
	// }

	// public MathCanvas getCanvas() {
	// 	return canvas;
	// }
}
