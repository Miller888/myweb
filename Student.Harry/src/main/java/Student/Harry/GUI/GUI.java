package Student.Harry.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.ScrollPane;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	JTextArea response_texArea;
	JTextArea url_textArea;
	JButton sent_Btn;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI frame = new GUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	/**
	 * Create the frame.
	 */
	public GUI() {
		
		setTitle("Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("請輸入URL");
		lblNewLabel.setBounds(25, 15, 173, 25);
		contentPane.add(lblNewLabel);
		
		sent_Btn = new JButton("Sent");
		sent_Btn.setBounds(410, 373, 78, 23);
		contentPane.add(sent_Btn);
		sent_Btn.addActionListener(new Model(this));
		JLabel lblResponse = new JLabel("Response");
		lblResponse.setBounds(25, 96, 483, 15);
		contentPane.add(lblResponse);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(25, 50, 453, 25);
		contentPane.add(scrollPane);
		
		url_textArea = new JTextArea();
		scrollPane.setViewportView(url_textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(25, 121, 453, 242);
		contentPane.add(scrollPane_1);
		
		response_texArea = new JTextArea();
		scrollPane_1.setViewportView(response_texArea);
		setVisible(true);
	}
}
