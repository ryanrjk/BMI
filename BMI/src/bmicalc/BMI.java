package bmicalc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BMI {

	public static void main(String[] args) {
		
		//creates a frame titled
		JFrame f = new JFrame("BMI Calculator");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,150);
		f.setLocationRelativeTo(null);
		
		//creating Jpanel
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		//creating first label
		JLabel heightin = new JLabel("Height (in)");
		JLabel heightft = new JLabel("Height (ft)");
		JLabel weight = new JLabel("Weight (pounds)");
		
		//text fields
		JTextField height2 = new JTextField(10);
		JTextField height3 = new JTextField(10);
		
		JTextField weight2 = new JTextField(10);
		
		
		
		//creating a button that says calculate
		JButton b = new JButton("Calculate");
		JButton b2 = new JButton("Reset");
		
		//adding components to panel
		panel.add(heightft);
		panel.add(height3);
		panel.add(heightin);
		panel.add(height2);
		
		panel2.add(weight);
		panel2.add(weight2);
		
		panel3.add(b);
		panel3.add(b2);
		
		
		//add components to jframe
		f.getContentPane().add(BorderLayout.NORTH, panel);
		f.getContentPane().add(BorderLayout.CENTER, panel2);
		f.getContentPane().add(BorderLayout.SOUTH, panel3);
		
		
		//add action listener
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				//bmi calculations
				try {
				String heightstr2 = height3.getText();
				double heightd2 = Double.parseDouble(heightstr2);
				
				String heightstr = height2.getText();
				double heightd = Double.parseDouble(heightstr);
				
				double heightinches = (heightd)+(heightd2*12);
				
				String weightstr = weight2.getText();
				double weightd = Double.parseDouble(weightstr);
				
				double results = (weightd*703)/(heightinches*heightinches);	
				
				String strDouble = String.format("%.2f", results);
				
				if (results < 18.5) {
					JOptionPane.showMessageDialog(null,strDouble+ " - eat some food"+"\n\nBody Mass Index Chart\nUnderweight: - 18.5\nNormal Weight: 18.5 - 24.9\nOverweight: 25 - 29.9\nObesity: 30+\n\n");
				}
				else if (results > 18.5 && results < 24.9){
					JOptionPane.showMessageDialog(null,"BMI: "+strDouble+ " - normal..."+"\n\nBody Mass Index Chart\nUnderweight: - 18.5\nNormal Weight: 18.5 - 24.9\nOverweight = 25 - 29.9\nObesity: 30+\n\n");
				}
				else if(results > 25 && results < 29.9) {
					JOptionPane.showMessageDialog(null,"BMI: "+strDouble + " - tubby"+"\n\nBody Mass Index Chart\nUnderweight: - 18.5\nNormal Weight: 18.5 - 24.9\nOverweight = 25 - 29.9\nObesity: 30+\n\n");
				}
				else {
					JOptionPane.showMessageDialog(null, "BMI: "+strDouble+ " - extra tubby"+"\n\nBody Mass Index Chart\\nUnderweight: < 18.5\\nNormal Weight: 18.5 - 24.9\\nOverweight = 25 - 29.9\\nObesity: 30+\\n\\n\"");
				}
				
				}
				catch (NumberFormatException e){
					JOptionPane.showMessageDialog(null, "Please Fill Out Fields Correctly.");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				//reset
				height2.setText(null);
				height3.setText(null);
				weight2.setText(null);
				
			}
		});
		
		System.out.println("Body Mass Index Chart\nUnderweight: < 18.5\nNormal Weight: 18.5 - 24.9\nOverweight = 25 - 29.9\nObesity: 30+\n\n");
				
		//set visible frame
		f.setVisible(true);
		
	}

}
