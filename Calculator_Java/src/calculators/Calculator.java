package calculators;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

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
		frame.setBounds(100, 100, 236, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 11, 206, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 137, 50, 50);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(62, 137, 50, 50);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(114, 137, 50, 50);
		frame.getContentPane().add(btn9);

		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(166, 86, 50, 50);
		frame.getContentPane().add(btnPlus);

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 189, 50, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(62, 189, 50, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(114, 189, 50, 50);
		frame.getContentPane().add(btn6);

		 	

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 240, 50, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(62, 240, 50, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(114, 240, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnmul = new JButton("*");
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul.setBounds(166, 240, 50, 50);
		frame.getContentPane().add(btnmul);

		JButton btnzero = new JButton("0");
		btnzero.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnzero.setBounds(10, 291, 50, 50);
		frame.getContentPane().add(btnzero);

		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(62, 291, 50, 50);
		frame.getContentPane().add(btndot);

		JButton btnequal = new JButton("=");
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(114, 291, 102, 50);
		frame.getContentPane().add(btnequal);
		
		JButton btnsub = new JButton("-");
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(166, 137, 50, 50);
		frame.getContentPane().add(btnsub);
		
		JButton btnclr = new JButton("Clr");
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclr.setBounds(62, 86, 102, 50);
		frame.getContentPane().add(btnclr);
		
		JButton btnarrow = new JButton("<");
		btnarrow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnarrow.setBounds(10, 86, 50, 50);
		frame.getContentPane().add(btnarrow);
		
		JButton btndiv = new JButton("/");
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBounds(166, 189, 50, 50);
		frame.getContentPane().add(btndiv);

	}
}
