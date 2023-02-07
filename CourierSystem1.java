package courier;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CourierSystem1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user1;
	private JTextField order1;
	private JTextField price1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public CourierSystem1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 631);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("Recipient name");
		name.setBounds(81, 82, 131, 14);
		contentPane.add(name);
		
		user1 = new JTextField();
		user1.setBounds(271, 79, 182, 20);
		contentPane.add(user1);
		user1.setColumns(10);
		
		JLabel order = new JLabel("Order name");
		order.setBounds(81, 133, 131, 14);
		contentPane.add(order);
		
		order1 = new JTextField();
		order1.setBounds(271, 130, 182, 20);
		contentPane.add(order1);
		order1.setColumns(10);
		
		JLabel price = new JLabel("Price of Product");
		price.setBounds(81, 187, 131, 14);
		contentPane.add(price);
		
		price1 = new JTextField();
		price1.setBounds(271, 184, 182, 20);
		contentPane.add(price1);
		price1.setColumns(10);
		
		JLabel details = new JLabel("Details of the order");
		details.setBounds(81, 242, 131, 14);
		contentPane.add(details);
		
		JTextArea details1 = new JTextArea();
		details1.setBounds(271, 242, 182, 75);
		contentPane.add(details1);
		
		JLabel address = new JLabel("Address");
		address.setBounds(81, 379, 119, 14);
		contentPane.add(address);
		
		JTextArea address1 = new JTextArea();
		address1.setBounds(271, 374, 182, 75);
		contentPane.add(address1);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==add)
				{
                    String name=user1.getText(),order2=order1.getText(),price2=price1.getText(),details2 = details1.getText(),address2=address1.getText();
					System.out.println("..........Customer  details......");
                    System.out.println("Recipient name : "+name);
                    System.out.println("Address : "+address2);
					System.out.println("..........Order details......");
                    System.out.println("Order name : "+order2);
                    System.out.println("Product details : "+details2);
					System.out.println("..........Order details......");
					System.out.println("Billing amount : "+price2);
                    
				}
			}
		});
		add.setBounds(511, 489, 109, 46);
		contentPane.add(add);
		
		
	}
}
