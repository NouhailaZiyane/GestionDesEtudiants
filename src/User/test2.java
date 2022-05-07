package User;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.baseD;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class test2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test2 frame = new test2();
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
	public test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vous voulez");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(127, 45, 142, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Consulter les informations des \u00E9tudiants");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test3 t= new test3(); t.setVisible(true); dispose();
				
			}
		});
		btnNewButton.setBounds(147, 133, 289, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1.setBounds(0, 0, 130, 418);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSaisirLesInformations = new JButton("Saisir les informations des \u00E9tudiants");
		btnSaisirLesInformations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test4 t= new test4(); t.setVisible(true); dispose();
			}
		});
		btnSaisirLesInformations.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSaisirLesInformations.setBounds(147, 197, 289, 32);
		contentPane.add(btnSaisirLesInformations);
		
		JButton btnModificationDesInformations = new JButton("Modifier les informations d'un \u00E9tudiant");
		btnModificationDesInformations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test5 t= new test5(); t.setVisible(true); dispose();
			}
		});
		btnModificationDesInformations.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModificationDesInformations.setBounds(147, 271, 289, 32);
		contentPane.add(btnModificationDesInformations);
	}

}
