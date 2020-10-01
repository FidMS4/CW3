package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import controller.ButtonListener;

public class MathPanel {
	private JFrame window;
	private JButton intButton = new JButton("Integrals");
	private JButton derivButton = new JButton("Derivatives");
	private JButton limButton = new JButton("Limits");
	private JRadioButton[] choiceButtons;
	//String[] choiceLetters = {"a.", "b.", "c.", "d."};

	private JButton submitButton = new JButton("Submit");

	private MathCanvas canvas;

	public MathPanel(JFrame window) {
		this.window = window;
	}

	public void start() {
		Container cp = window.getContentPane();

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 4));
		cp.add(BorderLayout.CENTER, panel);

		ButtonListener listener = new ButtonListener(this);

		choiceButtons = new JRadioButton[5];
		for (int i = 1; i <= 4; i++) {
			choiceButtons[i] = new JRadioButton("" + i);
			panel.add(choiceButtons[i]);
			choiceButtons[i].addActionListener(listener);
		}

		TitledBorder title = BorderFactory.createTitledBorder("Choices");
		panel.setBorder(title);

		JPanel sPanel = new JPanel();
		sPanel.setLayout(new GridLayout(1, 4));
		cp.add(BorderLayout.SOUTH, sPanel);

		sPanel.add(intButton);
		sPanel.add(derivButton);
		sPanel.add(limButton);

		
		TitledBorder buttonTitle = BorderFactory.createTitledBorder("Problem Types");
		sPanel.setBorder(buttonTitle);

		JPanel ePanel = new JPanel();
		ePanel.add(submitButton);
		submitButton.setPreferredSize(new Dimension(100, 100));
		submitButton.addActionListener(listener);
		cp.add(BorderLayout.EAST, ePanel);

		canvas = new MathCanvas(this);
		cp.add(BorderLayout.NORTH, canvas);

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
