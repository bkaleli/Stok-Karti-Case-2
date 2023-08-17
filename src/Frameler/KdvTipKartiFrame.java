package Frameler;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class KdvTipKartiFrame extends JInternalFrame {
	public JTextField tfKTKodu;
	public JTextField tfKTAdi;
	public JTextField tfKTOrani;
	public JButton btnKTKaydet;
	public JButton btnKTSil;
	public JButton btnKTIlk;
	public JButton btnKTGeri;
	public JButton btnKTSon;
	public JButton btnKTIleri;
	
	public KdvTipKartiFrame() {
		setTitle("KDV TIP KARTI");
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 358, 230);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		tfKTKodu = new JTextField();	
		tfKTKodu.setBounds(134, 53, 150, 20);
		getContentPane().add(tfKTKodu);
		tfKTKodu.setColumns(10);
		
		tfKTAdi = new JTextField();
		tfKTAdi.setBounds(134, 84, 150, 20);
		getContentPane().add(tfKTAdi);
		tfKTAdi.setColumns(10);
		
		tfKTOrani = new JTextField();
		tfKTOrani.setBounds(134, 115, 150, 20);
		getContentPane().add(tfKTOrani);
		tfKTOrani.setColumns(10);
		
		JLabel lblKTKodu = new JLabel("Kodu:");
		lblKTKodu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKTKodu.setBounds(57, 51, 67, 20);
		getContentPane().add(lblKTKodu);
		
		JLabel lblKTAdi = new JLabel("Adı:");
		lblKTAdi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKTAdi.setBounds(57, 82, 67, 20);
		getContentPane().add(lblKTAdi);
		
		JLabel lblKTOrani = new JLabel("Orani:");
		lblKTOrani.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKTOrani.setBounds(57, 113, 67, 20);
		getContentPane().add(lblKTOrani);
		
		btnKTKaydet = new JButton("KAYDET");
		btnKTKaydet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnKTKaydet.setBounds(57, 159, 108, 29);
		getContentPane().add(btnKTKaydet);
		
		btnKTSil = new JButton("SİL");
		btnKTSil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnKTSil.setBounds(175, 159, 108, 29);
		getContentPane().add(btnKTSil);
		
		btnKTIlk = new JButton("İLK");
		btnKTIlk.setBounds(21, 11, 61, 29);
		getContentPane().add(btnKTIlk);
		
		btnKTGeri = new JButton("GERİ");
		btnKTGeri.setBounds(92, 11, 73, 28);
		getContentPane().add(btnKTGeri);
		
		btnKTSon = new JButton("SON");
		btnKTSon.setBounds(261, 11, 61, 29);
		getContentPane().add(btnKTSon);
		
		btnKTIleri = new JButton("İLERİ");
		btnKTIleri.setBounds(184, 11, 67, 28);
		getContentPane().add(btnKTIleri);
		
	}
}
