package chapter11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlowLayoutFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("FlowLayout frame");
		
		frame.getContentPane().setLayout(new FlowLayout());
		
		frame.getContentPane().add(makePanel(Color.red));
		frame.getContentPane().add(makePanel(Color.orange));
		frame.getContentPane().add(makePanel(Color.green));
		frame.getContentPane().add(makePanel(Color.blue));
		frame.getContentPane().add(makePanel(new Color(75, 0, 130)));
		frame.getContentPane().add(makePanel(new Color(138, 43, 226)));
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private static JPanel makePanel(Color color) {
		JPanel panel = new JPanel();
		panel.setBackground(color);
		panel.setPreferredSize(new Dimension(100, 100));
		return panel;
	}
} 