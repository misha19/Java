package chapter11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class TabbedFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tabbed frame");
		
		JTabbedPane cardTabs = new JTabbedPane();
		cardTabs.setPreferredSize(new Dimension(300, 400));
		
		JPanel bluePanel = new JPanel();
		JPanel cyanPanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		cyanPanel.setBackground(Color.cyan);
		
		cardTabs.add(bluePanel, "BLUE PANEL");
		cardTabs.add(cyanPanel, "CYAN PANEL");
		
		frame.getContentPane().add(cardTabs, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
}