import java.awt.EventQueue;
import javax.swing.*;
import courier.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.Date;
public class CS extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user1;
	private JPasswordField pwd;
    String username="2003A51256",password1="2003A51256";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CS frame = new CS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 504);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Sign in");
		lblNewLabel.setBounds(242, 46, 139, 32);
		contentPane.add(lblNewLabel);
		
		JLabel user = new JLabel("Username");
		user.setBounds(137, 137, 114, 32);
		contentPane.add(user);
		
		JLabel password = new JLabel("Password");
		password.setBounds(137, 223, 114, 32);
		contentPane.add(password);
		
		user1 = new JTextField();
		user1.setBounds(280, 143, 173, 20);
		contentPane.add(user1);
		user1.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(280, 229, 173, 20);
		contentPane.add(pwd);

		JButton signin = new JButton("Sign in");
		signin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(e.getSource()== signin)
                {

                    String us1 = user1.getText();
                    String password = new String(pwd.getPassword());
                    if(password.equals(password1)&&username.equals(us1))
                    {
                        JFrame frame = new JFrame("Main Window");
                        JOptionPane.showMessageDialog(frame, "Authentication successful","Result", JOptionPane.INFORMATION_MESSAGE);
                        frame.setSize(450,450);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setVisible(false);
                        EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                try {
                                    courier.CourierSystem1 frame = new courier.CourierSystem1();
                                    frame.setVisible(true);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                    }
                    else
                    {
                        JFrame frame = new JFrame("Main Window");
                        JOptionPane.showMessageDialog(frame, "Wrong password","Result", JOptionPane.INFORMATION_MESSAGE);
                        frame.setSize(450,450);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setVisible(false);
                    }
                }
			}
		});
		signin.setBounds(280, 351, 114, 23);
		contentPane.add(signin);
		
		JButton back = new JButton("Close");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(e.getSource()==back)
                {
                    contentPane.setVisible(false);
                }
			}
		});
		back.setBounds(137, 351, 101, 23);
		contentPane.add(back);
        
	}
}
