package Pemilu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DptPemilu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNama;
	private JTextField textUmur;
	private JComboBox cbMenikah;
	private JLabel lblInfo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DptPemilu frame = new DptPemilu();
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
	public DptPemilu() {
		setTitle("DPT Pemilu 2024");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplikasi DPT Pemilu 2024 ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(141, 11, 175, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(32, 62, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNama = new JTextField();
		textNama.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textNama.setBounds(117, 60, 206, 20);
		contentPane.add(textNama);
		textNama.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Umur");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(32, 100, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textUmur = new JTextField();
		textUmur.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textUmur.setBounds(117, 98, 116, 20);
		contentPane.add(textUmur);
		textUmur.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Menikah");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(32, 139, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		cbMenikah = new JComboBox();
		cbMenikah.setModel(new DefaultComboBoxModel(new String[] {"ya", "tidak"}));
		cbMenikah.setBounds(117, 136, 63, 20);
		contentPane.add(cbMenikah);
		
		lblInfo = new JLabel("");
		lblInfo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblInfo.setBounds(32, 164, 343, 86);
		contentPane.add(lblInfo);
		
		JButton btnPROSES = new JButton("PROSES");
		btnPROSES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textNama.getText();
				int umur = Integer.parseInt(textUmur.getText());
				String status=cbMenikah.getSelectedItem().toString();
				
				if (umur >17) {
					lblInfo.setText(n+", Anda Terdapat Di DPT");
				} else if ((umur <17) && (status.equals("ya"))) {
					lblInfo.setText(n+", Anda Terdapat Di DPT");
				} else if ((umur <17) && (!status.equals("ya"))) {
					lblInfo.setText(n+", Anda Tidak Bisa IKut Memilih Di PEMILU 2024");
				}
			}
		});
		btnPROSES.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnPROSES.setBounds(61, 261, 89, 23);
		contentPane.add(btnPROSES);
		
		JButton btnRESET = new JButton("RESET");
		btnRESET.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNama.setText("");
				textUmur.setText("");
				cbMenikah.setSelectedIndex(0);
				lblInfo.setText("");
			}
		});
		btnRESET.setBounds(258, 261, 89, 23);
		contentPane.add(btnRESET);
	}
}