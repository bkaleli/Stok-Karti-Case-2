package KaydetCommandler;

import Commandler.CommandIF;
import Frameler.StokKartiFrame;
import Modeller.StokKartiModel;


public class StokKartiKaydetCommand implements CommandIF {
	private StokKartiFrame stokKartiFrame;
	
	public StokKartiKaydetCommand(StokKartiFrame stokKartiFrame) {
		super();
		this.stokKartiFrame = stokKartiFrame;
	}
	
	public void execute() {
		
		StokKartiModel stokKartiModel = new StokKartiModel();
		stokKartiModel.setStokKodu(stokKartiFrame.tfStokKodu.getText());
		stokKartiModel.setStokAdı(stokKartiFrame.tfStokAdı.getText());
		stokKartiModel.setStokTipi((int) stokKartiFrame.cbStokTipi.getSelectedItem());
		stokKartiModel.setBirimi((String) stokKartiFrame.cbBirimi.getSelectedItem());
		stokKartiModel.setBarkodu(stokKartiFrame.tfBarkodu.getText());
		stokKartiModel.setKdvTipi(Double.valueOf((stokKartiFrame.cbKdvTipi.getSelectedItem()).toString()));
		stokKartiModel.setAcıklama(stokKartiFrame.taAciklama.getText());
		stokKartiModel.setOlusturmaTarihi(stokKartiFrame.tfOlusturmaTarihi.getText());
				
		if(stokKartiModel.isRecorded()) {
			stokKartiModel.update();
		}
		else {
			stokKartiModel.insert();
		}		
	}
}
	
