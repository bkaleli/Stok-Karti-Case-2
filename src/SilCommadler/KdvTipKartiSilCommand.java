package SilCommadler;

import Commandler.CommandIF;
import Frameler.KdvTipKartiFrame;
import Modeller.KdvTipKartiModel;

public class KdvTipKartiSilCommand implements CommandIF {
	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiSilCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}
	
	@Override
	public void execute() {

		KdvTipKartiModel kdvTipKartiModel = new KdvTipKartiModel();
		
		kdvTipKartiModel.setKtKodu(kdvTipKartiFrame.tfKTKodu.getText());
		
		kdvTipKartiModel.delete();
		
		
		
	}
}
