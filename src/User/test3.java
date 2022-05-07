package User;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.baseD;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Insets;

public class test3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrNom = new JTextArea();
		txtrNom.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrNom.setMargin(new Insets(2, 7, 2, 2));
		txtrNom.setText("Nom");
		txtrNom.setBackground(SystemColor.activeCaption);
		txtrNom.setBounds(10, 11, 128, 397);
		contentPane.add(txtrNom);
		
		JTextArea txtrPrnom = new JTextArea();
		txtrPrnom.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrPrnom.setMargin(new Insets(2, 7, 2, 2));
		txtrPrnom.setText("Pr\u00E9nom");
		txtrPrnom.setBackground(SystemColor.inactiveCaptionBorder);
		txtrPrnom.setBounds(137, 11, 128, 397);
		contentPane.add(txtrPrnom);
		
		JTextArea txtrFilire = new JTextArea();
		txtrFilire.setMargin(new Insets(2, 8, 2, 2));
		txtrFilire.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		txtrFilire.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrFilire.setText("Fili\u00E8re                 ");
		txtrFilire.setBackground(SystemColor.activeCaption);
		txtrFilire.setBounds(275, 11, 163, 397);
		contentPane.add(txtrFilire);
		baseD i= new baseD();
		Connection c=i.connexion();
		ResultSet rs=i.selectionn(c);
		ArrayList<String> noms = new ArrayList<String>();
		ArrayList<String> prenoms = new ArrayList<String>();
		ArrayList<String> filieres = new ArrayList<String>();
		String Newligne=System.getProperty("line.separator");
		try {
			while (rs.next()) {
				
				txtrNom.append(Newligne+rs.getString("nom"));
				txtrPrnom.append(Newligne+rs.getString("prenom"));	
				txtrFilire.append(Newligne+rs.getString("filiere"));		
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
