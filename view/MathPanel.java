package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import controller.ButtonListener;

public class MathPanel {

	public enum QuestionState {
		INTEGRAL, DERIVATIVE, LIMIT
	}

	private JFrame window;
	private JButton intButton = new JButton("Integrals");
	private JButton derivButton = new JButton("Derivatives");
	private JButton limButton = new JButton("Limits");
	private JRadioButton oneButton = new JRadioButton("1");
	private JRadioButton twoButton = new JRadioButton("2");
	private JRadioButton threeButton = new JRadioButton("3");
	private JRadioButton fourButton = new JRadioButton("4");
	private JButton submitButton = new JButton("Submit");
	private QuestionState qState;

	private MathCanvas canvas;

	public MathPanel(JFrame window) {
		this.window = window;
	}

	public void start() {
		Container cp = window.getContentPane();

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 4));
		cp.add(BorderLayout.CENTER, panel);

		panel.add(oneButton);
		panel.add(twoButton);
		panel.add(threeButton);
		panel.add(fourButton);

		ButtonGroup choiceGroup = new ButtonGroup();
		choiceGroup.add(oneButton);
		choiceGroup.add(twoButton);
		choiceGroup.add(threeButton);
		choiceGroup.add(fourButton);

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
		submitButton.setEnabled(false);
		submitButton.setPreferredSize(new Dimension(100, 100));
		cp.add(BorderLayout.EAST, ePanel);

		canvas = new MathCanvas(this);
		cp.add(BorderLayout.NORTH, canvas);

		ButtonListener listener = new ButtonListener(this);
		oneButton.addActionListener(listener);
		twoButton.addActionListener(listener);
		threeButton.addActionListener(listener);
		fourButton.addActionListener(listener);
		intButton.addActionListener(listener);
		derivButton.addActionListener(listener);
		limButton.addActionListener(listener);
		submitButton.addActionListener(listener);
	}

	public JRadioButton getOneButton() {
		return oneButton;
	}

	public JRadioButton getTwoButton() {
		return twoButton;
	}

	public JRadioButton getThreeButton() {
		return threeButton;
	}

	public JRadioButton getFourButton() {
		return fourButton;
	}

	public JButton getIntegralButton() {
		return intButton;
	}

	public JButton getDerivativeButton() {
		return derivButton;
	}

	public JButton getLimitButton() {
		return limButton;
	}

	public JButton getSubmitButton() {
		return submitButton;
	}

	public JFrame getWindow() {
		return window;
	}

	public QuestionState getQuestionState() {
		return qState;
	}

	public void setQuestionState(QuestionState qState) {
		this.qState = qState;
	}

	public MathCanvas getCanvas() {
		return canvas;
	}
}
