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
	private JRadioButton aButton = new JRadioButton("a.");
	private JRadioButton bButton = new JRadioButton("b.");
	private JRadioButton cButton = new JRadioButton("c.");
	private JRadioButton dButton = new JRadioButton("d.");
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

		panel.add(aButton);
		panel.add(bButton);
		panel.add(cButton);
		panel.add(dButton);

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
		cp.add(BorderLayout.EAST, ePanel);

		canvas = new MathCanvas(this);
		cp.add(BorderLayout.NORTH, canvas);

		ButtonListener listener = new ButtonListener(this);
		aButton.addActionListener(listener);
		bButton.addActionListener(listener);
		cButton.addActionListener(listener);
		dButton.addActionListener(listener);
		intButton.addActionListener(listener);
		derivButton.addActionListener(listener);
		limButton.addActionListener(listener);
		submitButton.addActionListener(listener);
	}

	public JRadioButton getAButton() {
		return aButton;
	}

	public JRadioButton getBButton() {
		return bButton;
	}

	public JRadioButton getCButton() {
		return cButton;
	}

	public JRadioButton getDButton() {
		return dButton;
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

	public JFrame getWindow() {
		return window;
	}

	public MathCanvas getCanvas() {
		return canvas;
	}
}
