package KdvTipKartiNavigasyonCommandler;

import Commandler.CommandIF;
import Frameler.KdvTipKartiFrame;
import Modeller.KdvTipKartiModel;

public class KdvTipKartiSonCommand implements CommandIF{

	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiSonCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}

	public void execute() {
		KdvTipKartiModel kdvTipKartiModel = new KdvTipKartiModel();
				
		kdvTipKartiModel.sonVeri();
		
		kdvTipKartiFrame.tfKTKodu.setText(kdvTipKartiModel.getKtKodu());
		kdvTipKartiFrame.tfKTAdi.setText(kdvTipKartiModel.getKtAdi());
		kdvTipKartiFrame.tfKTOrani.setText(String.valueOf(kdvTipKartiModel.getKtOrani()));
	}
}
