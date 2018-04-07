import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;


public class EmailFrame extends JFrame {
	
   //Declaration of JFrame variables
	private JTextField jtfTo;
	private JTextField jtfFrom;
	private JTextField jtfServer;
	
   /*Main */
	public static void main(String[] args) {
		new EmailFrame();
	}


   /*Constructor (Creates GUI)*/
	public EmailFrame() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel inbox = new JPanel();
		getContentPane().add(inbox,BorderLayout.WEST);
		inbox.setLayout(new GridLayout(8, 0, 0, 0));
		
		JButton btnMessage = new JButton("Message");
		inbox.add(btnMessage);
		
		JPanel msgView = new JPanel();
		getContentPane().add(msgView,BorderLayout.CENTER);
		msgView.setLayout(new GridLayout(0, 1, 0, 0));
		msgView.setBorder(new EmptyBorder(10, 10, 10, 10));
      this.setSize(600,400);
		
		JPanel msgViewTop = new JPanel();
		msgView.add(msgViewTop);
		msgViewTop.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("To: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		msgViewTop.add(lblNewLabel);
		
		jtfTo = new JTextField(10);
		msgViewTop.add(jtfTo);
		jtfTo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("From: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		msgViewTop.add(lblNewLabel_1);
		
		jtfFrom = new JTextField();
		msgViewTop.add(jtfFrom);
		jtfFrom.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Address: ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		msgViewTop.add(lblNewLabel_2);
		
		jtfServer = new JTextField();
		msgViewTop.add(jtfServer);
		jtfServer.setColumns(10);
		
		JRadioButton rdbtnEncryptMessage = new JRadioButton("Encrypt Message");
		msgViewTop.add(rdbtnEncryptMessage);
		
		JLabel label = new JLabel("");
		msgViewTop.add(label);
		
		JLabel lblCompose = new JLabel("Compose: ");
		msgViewTop.add(lblCompose);
		
		JButton btnSend = new JButton("Send ");
		msgViewTop.add(btnSend);
		
		JPanel msgViewBot = new JPanel();
		msgView.add(msgViewBot);
		msgViewBot.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea textArea = new JTextArea();
		msgViewBot.add(textArea);
		
		this.setVisible(true);
	}
}
