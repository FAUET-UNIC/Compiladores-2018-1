import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.io.IOException;

public class IDE extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDE frame = new IDE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public IDE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JTextArea textArea = new JTextArea(13, 40);
		textArea.setBackground(new Color(199, 192, 186));

		contentPane.add(textArea);

		JButton btnNewButton = new JButton("Escrever");
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					FileWriter arq = new FileWriter("C:\\Users\\netto\\git\\Compilador\\src\\tabuada.L");
					PrintWriter gravarArq = new PrintWriter(arq);
					gravarArq.printf(textArea.getText());
					arq.close();

				} catch (IOException e1) {
					e1.getMessage();

				}

			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Compilar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal pn = new Principal();
				pn.compilar();
			}
			
			
		});
		contentPane.add(btnNewButton_1);

	}

}
