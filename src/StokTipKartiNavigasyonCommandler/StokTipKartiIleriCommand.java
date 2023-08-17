package StokTipKartiNavigasyonCommandler;

import Commandler.CommandIF;
import Frameler.StokTipKartiFrame;
import Modeller.StokTipKartiModel;

public class StokTipKartiIleriCommand implements CommandIF{
	
	private StokTipKartiFrame stokTipKartiFrame;

	public StokTipKartiIleriCommand(StokTipKartiFrame stokTipKartiFrame) {
		super();
		this.stokTipKartiFrame = stokTipKartiFrame;
	}

	public void execute() {
		StokTipKartiModel stokTipKartiModel = new StokTipKartiModel();
		
		stokTipKartiModel.setStKodu(stokTipKartiFrame.tfSTKodu.getText());
		
		stokTipKartiModel.ileri();
		
		stokTipKartiFrame.tfSTKodu.setText(stokTipKartiModel.getStKodu());
		stokTipKartiFrame.tfSTAdi.setText(stokTipKartiModel.getStAdi());
		stokTipKartiFrame.tfSTAciklama.setText(String.valueOf(stokTipKartiModel.getStAciklama()));
		
	}
}
