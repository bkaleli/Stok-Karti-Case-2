package SilCommadler;

import Frameler.StokTipKartiFrame;
import Modeller.StokTipKartiModel;

public class StokTipKartiSilCommand {
	private StokTipKartiFrame stokTipKartiFrame;

	public StokTipKartiSilCommand(StokTipKartiFrame stokTipKartiFrame) {
		super();
		this.stokTipKartiFrame = stokTipKartiFrame;
	
	}
	
	public void execute() {
		StokTipKartiModel stokTipKartiModel = new StokTipKartiModel();
		
		stokTipKartiModel.setStKodu(stokTipKartiFrame.tfSTKodu.getText());

		stokTipKartiModel.delete();
	}
}
