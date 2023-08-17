package KaydetCommandler;

import Commandler.CommandIF;
import Frameler.KdvTipKartiFrame;
import Modeller.KdvTipKartiModel;

public class KdvTipKartiKaydetCommand implements CommandIF  {
	private KdvTipKartiFrame kdvTipKartiFrame;

	public KdvTipKartiKaydetCommand(KdvTipKartiFrame kdvTipKartiFrame) {
		super();
		this.kdvTipKartiFrame = kdvTipKartiFrame;
	}

	@Override
	public void execute() {

		KdvTipKartiModel kdvTipKartiModel = new KdvTipKartiModel();
		
		kdvTipKartiModel.setKtKodu(kdvTipKartiFrame.tfKTKodu.getText());
		kdvTipKartiModel.setKtAdi(kdvTipKartiFrame.tfKTAdi.getText());
		kdvTipKartiModel.setKtOrani(Double.parseDouble(kdvTipKartiFrame.tfKTOrani.getText()));
				
		if(kdvTipKartiModel.isRecorded()) {
			kdvTipKartiModel.update();
		}
		else {
			kdvTipKartiModel.insert();
		}			
		
	}
}
