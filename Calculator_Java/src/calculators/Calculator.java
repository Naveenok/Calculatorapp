package calculators;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first_num;
	double second_num;
	double result;
	String operations;
	String answer;
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
		frame.setBounds(100, 100, 236, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 11, 206, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn7.getText();
				textField.setText(Enternumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 137, 50, 50);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String Enternumber = textField.getText() + btn8.getText();
				textField.setText(Enternumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(62, 137, 50, 50);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn9.getText();
				textField.setText(Enternumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(114, 137, 50, 50);
		frame.getContentPane().add(btn9);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";	
				 
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(166, 86, 50, 50);
		frame.getContentPane().add(btnPlus);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn4.getText();
				textField.setText(Enternumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 189, 50, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn5.getText();
				textField.setText(Enternumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(62, 189, 50, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn6.getText();
				textField.setText(Enternumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(114, 189, 50, 50);
		frame.getContentPane().add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn1.getText();
				textField.setText(Enternumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 240, 50, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn2.getText();
				textField.setText(Enternumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(62, 240, 50, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn3.getText();
				textField.setText(Enternumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(114, 240, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";	
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul.setBounds(166, 240, 50, 50);
		frame.getContentPane().add(btnmul);

		JButton btnzero = new JButton("0");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btnzero.getText();
				textField.setText(Enternumber);
			}
		});
		btnzero.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnzero.setBounds(10, 291, 50, 50);
		frame.getContentPane().add(btnzero);

		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField.getText().contains("."))
		          {
		          textField.setText(textField.getText() + btndot.getText());
		          }
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(62, 291, 50, 50);
		frame.getContentPane().add(btndot);

		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(166, 291, 50, 50);
		frame.getContentPane().add(btnequal);

		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";	
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(166, 137, 50, 50);
		frame.getContentPane().add(btnsub);

		JButton btnclr = new JButton("Clr");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = null;
				textField.setText(Enternumber);

			}
		});
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclr.setBounds(62, 86, 102, 50);
		frame.getContentPane().add(btnclr);

		JButton btnarrow = new JButton("<");
		btnarrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText();
				if (Enternumber.length() > 0) {
					textField.setText(Enternumber.substring(0, Enternumber.length() - 1));
					if (Enternumber.length() <= 0) {

						textField.setText(null);
					}
					/* textField. */
				}
			}
		});
		btnarrow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnarrow.setBounds(10, 86, 50, 50);
		frame.getContentPane().add(btnarrow);

		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";	
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBounds(166, 189, 50, 50);
		frame.getContentPane().add(btndiv);
		
		JButton btnNewButton = new JButton("+-");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(114, 291, 50, 50);
		frame.getContentPane().add(btnNewButton);

	}
}
