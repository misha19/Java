package javaprog;

import javax.swing.JOptionPane;;

public class NumersDialog {

	public static void main(String[] args) {
		int creditDays = 20 ; 
		JOptionPane.showMessageDialog(null , creditDays);
		JOptionPane.showMessageDialog(null, "Every bill is due in "+ creditDays+ " days.");

	}

}
