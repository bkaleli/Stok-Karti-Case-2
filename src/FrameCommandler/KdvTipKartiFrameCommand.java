package FrameCommandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Frameler.KdvTipKartiFrame;
import Frameler.MainFrame;
import KaydetCommandler.KdvTipKartiKaydetCommand;
import KdvTipKartiNavigasyonCommandler.KdvTipKartiGeriCommand;
import KdvTipKartiNavigasyonCommandler.KdvTipKartiIleriCommand;
import KdvTipKartiNavigasyonCommandler.KdvTipKartiIlkCommand;
import KdvTipKartiNavigasyonCommandler.KdvTipKartiSonCommand;
import SilCommadler.KdvTipKartiSilCommand;

public class KdvTipKartiFrameCommand {
	private KdvTipKartiFrame kdvTipKartiFrame;

	public void execute() {
		// TODO Auto-generated method stub
		
		kdvTipKartiFrame = new KdvTipKartiFrame();
		MainFrame.desktopPane.add(kdvTipKartiFrame).setVisible(true);
		
		setListeners();
	}

	private void setListeners() {
		kdvTipKartiFrame.btnKTKaydet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				KdvTipKartiKaydetCommand kaydetCommand = new KdvTipKartiKaydetCommand(kdvTipKartiFrame);
				kaydetCommand.execute();
			}
		});
		
		kdvTipKartiFrame.btnKTSil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				KdvTipKartiSilCommand silCommand = new KdvTipKartiSilCommand(kdvTipKartiFrame);
				silCommand.execute();
				
			}	
		});
		
		kdvTipKartiFrame.btnKTIlk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				KdvTipKartiIlkCommand ilkCommand = new KdvTipKartiIlkCommand(kdvTipKartiFrame);
				ilkCommand.execute();
				
			}	
		});
		
		kdvTipKartiFrame.btnKTSon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				KdvTipKartiSonCommand sonCommand = new KdvTipKartiSonCommand(kdvTipKartiFrame);
				sonCommand.execute();
				
			}	
		});
		
		kdvTipKartiFrame.btnKTIleri.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				KdvTipKartiIleriCommand ileriCommand = new KdvTipKartiIleriCommand(kdvTipKartiFrame);
				ileriCommand.execute();
				
			}	
		});
		
		kdvTipKartiFrame.btnKTGeri.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				KdvTipKartiGeriCommand geriCommand = new KdvTipKartiGeriCommand(kdvTipKartiFrame);
				geriCommand.execute();
				
			}	
		});
	}
}
