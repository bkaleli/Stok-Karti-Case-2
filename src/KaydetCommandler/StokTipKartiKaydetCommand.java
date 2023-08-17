package KaydetCommandler;

import Commandler.CommandIF;
import Frameler.StokTipKartiFrame;
import Modeller.StokTipKartiModel;


public class StokTipKartiKaydetCommand implements CommandIF{
	private StokTipKartiFrame stokTipKartiFrame;

	public StokTipKartiKaydetCommand(StokTipKartiFrame stokTipKartiFrame) {
		super();
		this.stokTipKartiFrame = stokTipKartiFrame;
	
	}
	
	public void execute() {
		StokTipKartiModel stokTipKartiModel = new StokTipKartiModel();
		
		stokTipKartiModel.setStKodu(stokTipKartiFrame.tfSTKodu.getText());
		stokTipKartiModel.setStAdi(stokTipKartiFrame.tfSTAdi.getText());
		stokTipKartiModel.setStAciklama(stokTipKartiFrame.tfSTAciklama.getText());

		if(stokTipKartiModel.isRecorded()) {
			stokTipKartiModel.update();
		}
		else {
			stokTipKartiModel.insert();
		}		
	}
}
