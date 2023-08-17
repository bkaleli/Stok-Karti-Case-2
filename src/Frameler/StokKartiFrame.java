package Frameler;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;

public class StokKartiFrame extends JInternalFrame {

	public JTextField tfStokKodu;
	public JTextField tfStokAdı;
	public JTextField tfBarkodu;
	public JTextArea taAciklama;
	public JComboBox<Integer> cbStokTipi;
	public JComboBox<String> cbBirimi;
	public JComboBox<Double> cbKdvTipi;
	public JButton btnSil;
	public JTextField tfOlusturmaTarihi;
	public JTable tbTable;
	public JButton btnKaydet;
	public JButton btnIlk;
	public JButton btnSon;
	public JButton btnGeri;
	public JButton btnIleri;
	

	public JComboBox<Double> getCbKdvTipi() {
		return cbKdvTipi;
	}

	public void setCbKdvTipi(JComboBox<Double> cbKdvTipi) {
		this.cbKdvTipi = cbKdvTipi;
	}

	
	public StokKartiFrame() {
		setTitle("STOK KARTI");
		setResizable(true);
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 398, 452);
		getContentPane().setLayout(null);

		JLabel lblStokKodu = new JLabel("Kodu:");
		lblStokKodu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStokKodu.setBounds(50, 59, 109, 30);
		getContentPane().add(lblStokKodu);
		
		JLabel lblStokAdı = new JLabel("Adı:");
		lblStokAdı.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStokAdı.setBounds(50, 100, 109, 26);
		getContentPane().add(lblStokAdı);

		JLabel lblStokTipi = new JLabel("Stok Tipi:");
		lblStokTipi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStokTipi.setBounds(50, 137, 109, 22);
		getContentPane().add(lblStokTipi);

		JLabel lblBirimi = new JLabel("Birimi:");
		lblBirimi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBirimi.setBounds(50, 170, 109, 26);
		getContentPane().add(lblBirimi);

		JLabel lblBarkodu = new JLabel("Barkoodu:");
		lblBarkodu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBarkodu.setBounds(50, 207, 109, 25);
		getContentPane().add(lblBarkodu);
		
		JLabel lblKdvTipi = new JLabel("Kdv Tipi:");
		lblKdvTipi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKdvTipi.setBounds(50, 243, 109, 26);
		getContentPane().add(lblKdvTipi);
		
		JLabel lblAciklama = new JLabel("Açıklama:");
		lblAciklama.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAciklama.setBounds(50, 280, 109, 30);
		getContentPane().add(lblAciklama);
		
		JLabel lblOlusturmaTarihi = new JLabel("Oluşturma Tarihi:");
		lblOlusturmaTarihi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOlusturmaTarihi.setBounds(50, 321, 109, 30);
		getContentPane().add(lblOlusturmaTarihi);
	
		tfStokKodu = new JTextField();
		tfStokKodu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfStokKodu.setBounds(169, 64, 147, 20);
		getContentPane().add(tfStokKodu);
		tfStokKodu.setColumns(10);

		tfStokAdı = new JTextField();
		tfStokAdı.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfStokAdı.setBounds(169, 103, 147, 20);
		getContentPane().add(tfStokAdı);
		tfStokAdı.setColumns(10);

		tfBarkodu = new JTextField();
		tfBarkodu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfBarkodu.setBounds(169, 209, 147, 20);
		getContentPane().add(tfBarkodu);
		tfBarkodu.setColumns(10);
		
		tfOlusturmaTarihi = new JTextField();
		tfOlusturmaTarihi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfOlusturmaTarihi.setBounds(169, 326, 147, 20);
		getContentPane().add(tfOlusturmaTarihi);
		tfOlusturmaTarihi.setColumns(10);

		cbStokTipi = new JComboBox<Integer>();
		cbStokTipi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbStokTipi.setBounds(169, 137, 147, 22);
		getContentPane().add(cbStokTipi);


		cbBirimi = new JComboBox<String>();
		cbBirimi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbBirimi.addItem("A");
		cbBirimi.addItem("B");
		cbBirimi.addItem("C");
		cbBirimi.addItem("D");
		cbBirimi.setBounds(169, 172, 147, 22);
		getContentPane().add(cbBirimi);

		cbKdvTipi = new JComboBox<Double>();
		cbKdvTipi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbKdvTipi.setBounds(169, 245, 147, 22);
		getContentPane().add(cbKdvTipi);


		taAciklama = new JTextArea();
		taAciklama.setFont(new Font("Monospaced", Font.PLAIN, 14));
		taAciklama.setBounds(169, 284, 147, 20);
		getContentPane().add(taAciklama);

		btnKaydet = new JButton("Kaydet");
		btnKaydet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnKaydet.setBounds(60, 376, 118, 30);
		getContentPane().add(btnKaydet);
	
		btnSil = new JButton("Sil");
		btnSil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSil.setBounds(191, 376, 118, 30);
		getContentPane().add(btnSil);
		
		btnIlk = new JButton("İLK");
		btnIlk.setBounds(10, 25, 61, 23);
		getContentPane().add(btnIlk);
		
		btnSon = new JButton("SON");
		btnSon.setBounds(311, 23, 61, 26);
		getContentPane().add(btnSon);
		
		btnGeri = new JButton("GERİ");
		btnGeri.setBounds(81, 25, 77, 23);
		getContentPane().add(btnGeri);
		
		btnIleri = new JButton("İLERİ");
		btnIleri.setBounds(224, 25, 77, 22);
		getContentPane().add(btnIleri);
		
		
		
	}
}
