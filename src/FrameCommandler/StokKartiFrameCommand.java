package FrameCommandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Commandler.ComboBoxCommand;
import Frameler.MainFrame;
import Frameler.StokKartiFrame;
import KaydetCommandler.StokKartiKaydetCommand;
import SilCommadler.StokKartiSilCommand;
import StokKartiNavigasyonCommanler.StokKartiGeriCommand;
import StokKartiNavigasyonCommanler.StokKartiIleriCommand;
import StokKartiNavigasyonCommanler.StokKartiIlkCommand;
import StokKartiNavigasyonCommanler.StokKartiSonCommand;

public class StokKartiFrameCommand {
	public StokKartiFrame stokKartiFrame;
	
	public void execute() {
		// TODO Auto-generated method stub
		
		
		stokKartiFrame = new StokKartiFrame();
		MainFrame.desktopPane.add(stokKartiFrame).setVisible(true);
		
		ComboBoxCommand comboBoxCommandler = new ComboBoxCommand();
		comboBoxCommandler.comboBoxStokTipi(stokKartiFrame);
		comboBoxCommandler.comboBoxKdvTipi(stokKartiFrame);
		
		setListeners();
			
	}
	
	private void setListeners() {
		stokKartiFrame.btnKaydet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiKaydetCommand kaydetCommand = new StokKartiKaydetCommand(stokKartiFrame);
				kaydetCommand.execute();
			}
		});
		
		stokKartiFrame.btnSil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiSilCommand silCommand = new StokKartiSilCommand(stokKartiFrame);
				silCommand.execute();
			}
		});
		
		stokKartiFrame.btnIlk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiIlkCommand ilkCommand = new StokKartiIlkCommand(stokKartiFrame);
				ilkCommand.execute();
			}
			
		});
		
		stokKartiFrame.btnSon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiSonCommand sonCommand = new StokKartiSonCommand(stokKartiFrame);
				sonCommand.execute();
			}
			
		});
		
		stokKartiFrame.btnIleri.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiIleriCommand ileriCommand = new StokKartiIleriCommand(stokKartiFrame);
				ileriCommand.execute();
			}
			
		});
		
		stokKartiFrame.btnGeri.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StokKartiGeriCommand geriCommand = new StokKartiGeriCommand(stokKartiFrame);
				geriCommand.execute();
			}
			
		});
		
	}
}
