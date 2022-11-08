package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

public class Calculator implements ActionListener{
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton divisionButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton multiplyButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton substractButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton additionButton;
	JButton clearButton;
	
	float oldValue;
	String operator;
	float ans =0;
	float newValue;
	boolean isAnswered = false;
	
	public Calculator() { 
		
		  jf = new JFrame("Calculator");
		  
		  jf.setLayout(null);
		  jf.setSize(430,670);
		  jf.setLocation(500,60);
		  
		  displayLabel = new JLabel();
		  displayLabel.setFont(new Font("Arial",Font.PLAIN,35));
		  displayLabel.setBounds(20,50,375,60);
		  displayLabel.setBackground(Color.WHITE);
		  displayLabel.setOpaque(true);
		  displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		  displayLabel.setForeground(Color.BLACK);
		  displayLabel.setBorder(new CompoundBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK),BorderFactory.createEmptyBorder(3, 3, 3, 3)));
		  jf.add(displayLabel);
		  
		  sevenButton = new JButton("7");
		  sevenButton.setBounds(30,150,60,60);
		  sevenButton.setBorder(BorderFactory.createEtchedBorder());
		  sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		  sevenButton.setBackground(Color.GRAY);
		  sevenButton.setOpaque(true);
		  sevenButton.addActionListener(this);
		  jf.add(sevenButton);
		  
		  eightButton = new JButton("8");
		  eightButton.setBounds(130,150,60,60);
		  eightButton.setBorder(BorderFactory.createEtchedBorder());
		  eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		  eightButton.setBackground(Color.GRAY);
		  eightButton.setOpaque(true);
		  eightButton.addActionListener(this);
		  jf.add(eightButton);
		  
		  nineButton = new JButton("9");
		  nineButton.setBounds(230,150,60,60);
		  nineButton.setBorder(BorderFactory.createEtchedBorder());
		  nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		  nineButton.setBackground(Color.GRAY);
		  nineButton.setOpaque(true);
		  nineButton.addActionListener(this);
		  jf.add(nineButton);
		  
		  divisionButton = new JButton("/");
		  divisionButton.setBounds(330,150,60,60);
		  divisionButton.setBorder(BorderFactory.createEtchedBorder());
		  divisionButton.setFont(new Font("Arial",Font.PLAIN,40));
		  divisionButton.setBackground(Color.GRAY);
		  divisionButton.setOpaque(true);
		  divisionButton.addActionListener(this);
		  jf.add(divisionButton);
		  
		  fourButton = new JButton("4");
		  fourButton.setBounds(30,250,60,60);
		  fourButton.setBorder(BorderFactory.createEtchedBorder());
		  fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		  fourButton.setBackground(Color.GRAY);
		  fourButton.setOpaque(true);
		  fourButton.addActionListener(this);
		  jf.add(fourButton);
		  
		  fiveButton = new JButton("5");
		  fiveButton.setBounds(130,250,60,60);
		  fiveButton.setBorder(BorderFactory.createEtchedBorder());
		  fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		  fiveButton.setBackground(Color.GRAY);
		  fiveButton.setOpaque(true);
		  fiveButton.addActionListener(this);
		  jf.add(fiveButton);
		  
		  sixButton = new JButton("6");
		  sixButton.setBounds(230,250,60,60);
		  sixButton.setBorder(BorderFactory.createEtchedBorder());
		  sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		  sixButton.setBackground(Color.GRAY);
		  sixButton.setOpaque(true);
		  sixButton.addActionListener(this);
		  jf.add(sixButton);
		  
		  multiplyButton = new JButton("x");
		  multiplyButton.setBounds(330,250,60,60);
		  multiplyButton.setBorder(BorderFactory.createEtchedBorder());
		  multiplyButton.setFont(new Font("Arial",Font.PLAIN,40));
		  multiplyButton.setBackground(Color.GRAY);
		  multiplyButton.setOpaque(true);
		  multiplyButton.addActionListener(this);
		  jf.add(multiplyButton);
		  
		  oneButton = new JButton("1");
		  oneButton.setBounds(30,350,60,60);
		  oneButton.setBorder(BorderFactory.createEtchedBorder());
		  oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		  oneButton.setBackground(Color.GRAY);
		  oneButton.setOpaque(true);
		  oneButton.addActionListener(this);
		  jf.add(oneButton);
		  
		  twoButton = new JButton("2");
		  twoButton.setBounds(130,350,60,60);
		  twoButton.setBorder(BorderFactory.createEtchedBorder());
		  twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		  twoButton.setBackground(Color.GRAY);
		  twoButton.setOpaque(true);
		  twoButton.addActionListener(this);
		  jf.add(twoButton);
		  
		  threeButton = new JButton("3");
		  threeButton.setBounds(230,350,60,60);
		  threeButton.setBorder(BorderFactory.createEtchedBorder());
		  threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		  threeButton.setBackground(Color.GRAY);
		  threeButton.setOpaque(true);
		  threeButton.addActionListener(this);
		  jf.add(threeButton);
		  
		  substractButton = new JButton("-");
		  substractButton.setBounds(330,350,60,60);
		  substractButton.setBorder(BorderFactory.createEtchedBorder());
		  substractButton.setFont(new Font("Arial",Font.PLAIN,40));
		  substractButton.setBackground(Color.GRAY);
		  substractButton.setOpaque(true);
		  substractButton.addActionListener(this);
		  jf.add(substractButton);
		  
		  dotButton = new JButton(".");
		  dotButton.setBounds(30,450,60,60);
		  dotButton.setBorder(BorderFactory.createEtchedBorder());
		  dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		  dotButton.setBackground(Color.GRAY);
		  dotButton.setOpaque(true);
		  dotButton.addActionListener(this);
		  jf.add(dotButton);
		  
		  zeroButton = new JButton("0");
		  zeroButton.setBounds(130,450,60,60);
		  zeroButton.setBorder(BorderFactory.createEtchedBorder());
		  zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		  zeroButton.setBackground(Color.GRAY);
		  zeroButton.setOpaque(true);
		  zeroButton.addActionListener(this);
		  jf.add(zeroButton);
		  
		  equalButton = new JButton("=");
		  equalButton.setBounds(230,450,60,60);
		  equalButton.setBorder(BorderFactory.createEtchedBorder());
		  equalButton.setFont(new Font("Arial",Font.PLAIN,40));
		  equalButton.setBackground(Color.GRAY);
		  equalButton.setOpaque(true);
		  equalButton.addActionListener(this);
		  jf.add(equalButton);
		  
		  additionButton = new JButton("+");
		  additionButton.setBounds(330,450,60,60);
		  additionButton.setBorder(BorderFactory.createEtchedBorder());
		  additionButton.setFont(new Font("Arial",Font.PLAIN,40));
		  additionButton.setBackground(Color.GRAY);
		  additionButton.setOpaque(true);
		  additionButton.addActionListener(this);
		  jf.add(additionButton);
		  
		  clearButton = new JButton("Clear");
		  clearButton.setBounds(30,550,360,60);
		  clearButton.setBorder(BorderFactory.createEtchedBorder());
		  clearButton.setFont(new Font("Arial",Font.PLAIN,35));
		  clearButton.setBackground(Color.GRAY);
		  sevenButton.setOpaque(true);
		  clearButton.addActionListener(this);
		  jf.add(clearButton);
		  
		  jf.setVisible(true);
		  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		 new Calculator();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sevenButton) {
			if(isAnswered) {
				displayLabel.setText("7");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else
		if(e.getSource() == eightButton) {
			if(isAnswered) {
				displayLabel.setText("8");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else
		if(e.getSource() == nineButton) {
			if(isAnswered) {
				displayLabel.setText("9");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}else
		if(e.getSource() == fourButton) {
			if(isAnswered) {
				displayLabel.setText("4");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}else
		if(e.getSource() == fiveButton) {
			if(isAnswered) {
				displayLabel.setText("5");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else
		if(e.getSource() == sixButton) {
			if(isAnswered) {
				displayLabel.setText("6");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else
		if(e.getSource() == oneButton) {
			if(isAnswered) {
				displayLabel.setText("1");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else
		if(e.getSource() == twoButton) {
			if(isAnswered) {
				displayLabel.setText("2");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else
		if(e.getSource() == threeButton) {
			if(isAnswered) {
				displayLabel.setText("3");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else
		if(e.getSource() == dotButton) {
			if(isAnswered) {
				displayLabel.setText("0.");
				isAnswered = false;
			}else {
				if(displayLabel.getText() == "") {
					displayLabel.setText("0.");
				}else {
				displayLabel.setText(displayLabel.getText()+".");
				}
			}
			ans = 0;
		}else
		if(e.getSource() == zeroButton) {
			if(isAnswered) {
				displayLabel.setText("0");
				isAnswered = false;
			}else {
			displayLabel.setText(displayLabel.getText()+"0");
			}
		}else
		if(e.getSource() == additionButton) {
			
			if(displayLabel.getText() != "") {
				operator = "+";
				oldValue = Float.parseFloat(displayLabel.getText());
			}
			displayLabel.setText("");
		}else
		if(e.getSource() == divisionButton) {
			
			if(displayLabel.getText() != "") {
				operator = "/";
				oldValue = Float.parseFloat(displayLabel.getText());
			}
			displayLabel.setText("");
		}else
		if(e.getSource() == multiplyButton) {
			
			if(displayLabel.getText() != "") {
				operator = "*";
				oldValue = Float.parseFloat(displayLabel.getText());
			}
			displayLabel.setText("");
		}else
		if(e.getSource() == substractButton) {
			
			if(displayLabel.getText() != "") {
				operator = "-";
				oldValue = Float.parseFloat(displayLabel.getText());
			}
			displayLabel.setText("");
		}else
		if(e.getSource() == equalButton) {
			if(isAnswered) {
				displayLabel.setText(""+ans+"");
			}else {
				if(displayLabel.getText() == null || displayLabel.getText() == "" || displayLabel.getText() == ".") {
					displayLabel.setText(""+ans+"");
				}else {
			newValue = Float.parseFloat(displayLabel.getText());
			isAnswered = true;
			if(operator == "+") {
				ans = oldValue + newValue;
			}
			if(operator == "-") {
				ans = oldValue - newValue;
			}
			if(operator == "*") {
				ans = oldValue * newValue;
			}
			if(operator == "/") {
				ans = oldValue / newValue;
			}
			if(operator == null || operator == "") {
				ans = newValue;
			}
			displayLabel.setText(""+ans+"");
			oldValue = ans;
			operator = "";
				}
			}
		}else
		if(e.getSource() == clearButton) {
			displayLabel.setText("");
		}
	}
}
