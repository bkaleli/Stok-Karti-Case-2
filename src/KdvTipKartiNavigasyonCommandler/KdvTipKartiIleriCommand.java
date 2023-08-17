package KdvTipKartiNavigasyonCommandler;

import Commandler.CommandIF;
import Frameler.KdvTipKartiFrame;
import Modeller.KdvTipKartiModel;

public class KdvTipKartiIleriCommand implements CommandIF{
	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiIleriCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}

	public void execute() {
		KdvTipKartiModel kdvTipKartiModel = new KdvTipKartiModel();
		
		kdvTipKartiModel.setKtKodu(kdvTipKartiFrame.tfKTKodu.getText());
		
		kdvTipKartiModel.ileri();
		
		kdvTipKartiFrame.tfKTKodu.setText(kdvTipKartiModel.getKtKodu());
		kdvTipKartiFrame.tfKTAdi.setText(kdvTipKartiModel.getKtAdi());
		kdvTipKartiFrame.tfKTOrani.setText(String.valueOf(kdvTipKartiModel.getKtOrani()));
		
	}
}
