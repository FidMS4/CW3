package view;

import java.awt.*;
import javax.swing.*;

public class GamePlay {

	private JFrame window;

	public GamePlay(JFrame window) {
		this.window = window;
		window.setTitle("Welcome to Calc Review!");
	}

	public void start() {
		Container cp = window.getContentPane();
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(350, 225));
	
		JButton startButton = new JButton("Start Questions");
		startButton.setPreferredSize(new Dimension(400, 225));
		panel.add(startButton);
		cp.add(BorderLayout.CENTER, panel);

		startButton.addActionListener( e -> {
			window.getContentPane().removeAll();
			var mathPanel = new MathPanel(window);
			mathPanel.start();
			window.pack();
			window.revalidate();
		});
	}
}