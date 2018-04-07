import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginFrame extends JFrame {
	//Declaration of JFrame variables
	private JPanel contentPane;
	private JTextField jtfUsername;

	public static void main(String[] args) {
		new LoginFrame();
	}

	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(22, 102, 94, 30);
		contentPane.add(lblUsername);
		
		jtfUsername = new JTextField();
		jtfUsername.setBounds(108, 109, 208, 20);
		contentPane.add(jtfUsername);
		jtfUsername.setColumns(10);
		
		JButton jbLogin = new JButton("Login");
		jbLogin.setBounds(326, 108, 89, 23);
		contentPane.add(jbLogin);
		
		JLabel jlTitle = new JLabel("SMTP Client Login");
		jlTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jlTitle.setBounds(147, 34, 160, 30);
		contentPane.add(jlTitle);
		
		this.setResizable(false);
		this.setVisible(true);
	}
}