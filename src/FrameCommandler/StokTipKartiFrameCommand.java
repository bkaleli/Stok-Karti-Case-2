package FrameCommandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Frameler.MainFrame;
import Frameler.StokTipKartiFrame;
import KaydetCommandler.StokTipKartiKaydetCommand;
import SilCommadler.StokTipKartiSilCommand;
import StokTipKartiNavigasyonCommandler.StokTipKartiGeriCommand;
import StokTipKartiNavigasyonCommandler.StokTipKartiIleriCommand;
import StokTipKartiNavigasyonCommandler.StokTipKartiIlkCommand;
import StokTipKartiNavigasyonCommandler.StokTipKartiSonCommand;

public class StokTipKartiFrameCommand {
	private StokTipKartiFrame stokTipKartiFrame;
	
	public void execute() {
		// TODO Auto-generated method stub

		stokTipKartiFrame = new StokTipKartiFrame();
		MainFrame.desktopPane.add(stokTipKartiFrame).setVisible(true);
		
		setListeners();
	}

	private void setListeners() {
		stokTipKartiFrame.btnSTKaydet.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StokTipKartiKaydetCommand kaydetCommand = new StokTipKartiKaydetCommand(stokTipKartiFrame);
				kaydetCommand.execute();
			}
			
		});
		
		stokTipKartiFrame.btnSTSil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StokTipKartiSilCommand silCommand = new StokTipKartiSilCommand(stokTipKartiFrame);
				silCommand.execute();
			}
			
		});
		
		stokTipKartiFrame.btnSTIlk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StokTipKartiIlkCommand ilkCommand = new StokTipKartiIlkCommand(stokTipKartiFrame);
				ilkCommand.execute();
			}
			
		});
		
		stokTipKartiFrame.btnSTSon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StokTipKartiSonCommand sonCommand = new StokTipKartiSonCommand(stokTipKartiFrame);
				sonCommand.execute();
			}
			
		});
		
		stokTipKartiFrame.btnSTIleri.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StokTipKartiIleriCommand ileriCommand = new StokTipKartiIleriCommand(stokTipKartiFrame);
				ileriCommand.execute();
			}
			
		});
		
		stokTipKartiFrame.btnSTGeri.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StokTipKartiGeriCommand geriCommand = new StokTipKartiGeriCommand(stokTipKartiFrame);
				geriCommand.execute();
			}
			
		});
	
		
	}
}
