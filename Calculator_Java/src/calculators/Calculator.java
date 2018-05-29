package calculators;

import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 255, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 218, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//1st row
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 54, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(66, 54, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9=new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(122, 54, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus=new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(178, 54, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//2nd row
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(66, 110, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6=new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(122, 110, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnsub=new JButton("-");
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(178, 110, 50, 50);
		frame.getContentPane().add(btnsub);
	
//row 3
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 166, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(66, 166, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3=new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(122, 166, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnmul=new JButton("*");
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul.setBounds(178, 166, 50, 50);
		frame.getContentPane().add(btnmul);
		
	
		
		
		
		
		
	}
}
