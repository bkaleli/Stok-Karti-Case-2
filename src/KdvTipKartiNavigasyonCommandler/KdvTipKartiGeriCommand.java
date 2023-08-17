package KdvTipKartiNavigasyonCommandler;

import Commandler.CommandIF;
import Frameler.KdvTipKartiFrame;
import Modeller.KdvTipKartiModel;

public class KdvTipKartiGeriCommand implements CommandIF{
	
	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiGeriCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}

	public void execute() {
		KdvTipKartiModel kdvTipKartiModel = new KdvTipKartiModel();
		
		kdvTipKartiModel.setKtKodu(kdvTipKartiFrame.tfKTKodu.getText());
		
		kdvTipKartiModel.geri();
		
		kdvTipKartiFrame.tfKTKodu.setText(kdvTipKartiModel.getKtKodu());
		kdvTipKartiFrame.tfKTAdi.setText(kdvTipKartiModel.getKtAdi());
		kdvTipKartiFrame.tfKTOrani.setText(String.valueOf(kdvTipKartiModel.getKtOrani()));
		
	}
}
