package KdvTipKartiNavigasyonCommandler;

import Commandler.CommandIF;
import Frameler.KdvTipKartiFrame;
import Modeller.KdvTipKartiModel;

public class KdvTipKartiIlkCommand implements CommandIF{

	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiIlkCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}

	public void execute() {
		KdvTipKartiModel kdvTipKartiModel = new KdvTipKartiModel();		
		kdvTipKartiModel.ilkVeri();
		
		kdvTipKartiFrame.tfKTKodu.setText(kdvTipKartiModel.getKtKodu());
		kdvTipKartiFrame.tfKTAdi.setText(kdvTipKartiModel.getKtAdi());
		kdvTipKartiFrame.tfKTOrani.setText(String.valueOf(kdvTipKartiModel.getKtOrani()));
		
	}
}
