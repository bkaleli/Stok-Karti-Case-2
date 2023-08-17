package StokTipKartiNavigasyonCommandler;

import Commandler.CommandIF;
import Frameler.StokTipKartiFrame;
import Modeller.StokTipKartiModel;

public class StokTipKartiIlkCommand implements CommandIF{
	
	private StokTipKartiFrame stokTipKartiFrame;

	public StokTipKartiIlkCommand(StokTipKartiFrame stokTipKartiFrame) {
		super();
		this.stokTipKartiFrame = stokTipKartiFrame;
	}

	public void execute() {
		StokTipKartiModel stokTipKartiModel = new StokTipKartiModel();
		stokTipKartiModel.ilkVeri();
		

		stokTipKartiFrame.tfSTKodu.setText(stokTipKartiModel.getStKodu());
		stokTipKartiFrame.tfSTAdi.setText(stokTipKartiModel.getStAdi());
		stokTipKartiFrame.tfSTAciklama.setText(String.valueOf(stokTipKartiModel.getStAciklama()));
		
	}

}
