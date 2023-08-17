package Frameler;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StokTipKartiFrame extends JInternalFrame {
	public JTextField tfSTKodu;
	public JTextField tfSTAdi;
	public JTextField tfSTAciklama;
	public JButton btnSTKaydet;
	public JButton btnSTSil;
	public JButton btnSTIlk;
	public JButton btnSTSon;
	public JButton btnSTIleri;
	public JButton btnSTGeri;
	
	
	
	public StokTipKartiFrame() {
		setTitle("STOK TIP KARTI");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		setResizable(true);
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 358, 230);
		getContentPane().setLayout(null);
		
		JLabel lblSTKodu = new JLabel("Kodu:");
		lblSTKodu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSTKodu.setBounds(56, 52, 76, 20);
		getContentPane().add(lblSTKodu);
		
		JLabel lblSTAdi = new JLabel("Adı:");
		lblSTAdi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSTAdi.setBounds(56, 83, 76, 19);
		getContentPane().add(lblSTAdi);
		
		JLabel lblSTAciklama = new JLabel("Açıklama:");
		lblSTAciklama.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSTAciklama.setBounds(56, 113, 76, 19);
		getContentPane().add(lblSTAciklama);
		
		tfSTKodu = new JTextField();
		tfSTKodu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfSTKodu.setBounds(142, 54, 141, 20);
		getContentPane().add(tfSTKodu);
		tfSTKodu.setColumns(10);
		
		tfSTAdi = new JTextField();
		tfSTAdi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfSTAdi.setBounds(142, 84, 141, 20);
		getContentPane().add(tfSTAdi);
		tfSTAdi.setColumns(10);
		
		tfSTAciklama = new JTextField();
		tfSTAciklama.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfSTAciklama.setBounds(142, 114, 141, 20);
		getContentPane().add(tfSTAciklama);
		tfSTAciklama.setColumns(10);
		
		btnSTKaydet = new JButton("KAYDET");
		btnSTKaydet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSTKaydet.setBounds(40, 150, 116, 28);
		getContentPane().add(btnSTKaydet);
		
		btnSTSil = new JButton("SİL");
		btnSTSil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSTSil.setBounds(166, 150, 116, 28);
		getContentPane().add(btnSTSil);
		
		btnSTIlk = new JButton("İLK");
		btnSTIlk.setBounds(21, 11, 57, 28);
		getContentPane().add(btnSTIlk);
		
		btnSTIleri = new JButton("İLERİ");
		btnSTIleri.setBounds(181, 11, 68, 28);
		getContentPane().add(btnSTIleri);
		
		btnSTSon = new JButton("SON");
		btnSTSon.setBounds(259, 11, 62, 28);
		getContentPane().add(btnSTSon);
		
		btnSTGeri = new JButton("GERİ");
		btnSTGeri.setBounds(88, 12, 68, 27);
		getContentPane().add(btnSTGeri);

	}
}
