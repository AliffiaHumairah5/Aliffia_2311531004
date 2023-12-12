package Pemilu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TugasPekan8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox CBJurusan;
	private JTextField textNAMA;
	private JTextField textNIM;
	private JLabel lblinfo;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasPekan8 frame = new TugasPekan8();
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
	public TugasPekan8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMAHASISWA = new JLabel("MAHASISWA");
		lblMAHASISWA.setBounds(173, 11, 84, 15);
		lblMAHASISWA.setFont(new Font("Times New Roman", Font.BOLD, 12));
		contentPane.add(lblMAHASISWA);
		
		JLabel lblNAMA = new JLabel("NAMA : ");
		lblNAMA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNAMA.setBounds(21, 48, 62, 14);
		contentPane.add(lblNAMA);
		
		JLabel lblNIM = new JLabel("NIM :");
		lblNIM.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNIM.setBounds(21, 86, 46, 14);
		contentPane.add(lblNIM);
		
		JComboBox CBJurusan = new JComboBox();
		CBJurusan.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CBJurusan.setModel(new DefaultComboBoxModel(new String[] {"Teknik Komputer", "Sistem Informasi", "Informatika"}));
		CBJurusan.setBounds(93, 114, 118, 22);
		contentPane.add(CBJurusan);
		
		JLabel lblJURUSAN = new JLabel("JURUSAN : ");
		lblJURUSAN.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblJURUSAN.setBounds(21, 118, 84, 14);
		contentPane.add(lblJURUSAN);
		
		JLabel lblinfo = new JLabel("");
		lblinfo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblinfo.setBounds(21, 143, 407, 54);
		contentPane.add(lblinfo);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNAMA.setText("");
				textNIM.setText("");
				CBJurusan.setSelectedIndex(0);
				lblinfo.setText("");
			
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(43, 208, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PROSES");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textNAMA.getText();
				String m = textNIM.getText();
				String p = CBJurusan.getSelectedItem().toString();
				lblinfo.setText(n+ " dengan NIM " +m+ " dari Jurusan " +p+ " Berhasil Diproses");
				
				
			}
		});
		
		
		
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(301, 208, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textNAMA = new JTextField();
		textNAMA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textNAMA.setBounds(93, 45, 209, 20);
		contentPane.add(textNAMA);
		textNAMA.setColumns(10);
		
		textNIM = new JTextField();
		textNIM.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textNIM.setColumns(10);
		textNIM.setBounds(93, 83, 152, 20);
		contentPane.add(textNIM);
		
		
		
		
	}
}