package StokKartiNavigasyonCommanler;

import Commandler.CommandIF;
import Frameler.StokKartiFrame;
import Modeller.StokKartiModel;

public class StokKartiSonCommand implements CommandIF{
	private StokKartiFrame stokKartiFrame;

	public StokKartiSonCommand(StokKartiFrame stokKartiFrame) {
		super();
		this.stokKartiFrame = stokKartiFrame;
	}

	public void execute() {
		StokKartiModel stokKartiModel = new StokKartiModel();
			
		stokKartiModel.sonVeri();
		
		stokKartiFrame.tfStokKodu.setText(stokKartiModel.getStokKodu());
		stokKartiFrame.tfStokAdı.setText(stokKartiModel.getStokAdı());
		stokKartiFrame.cbStokTipi.setSelectedItem(stokKartiModel.getStokTipi());
		stokKartiFrame.cbBirimi.setSelectedItem(stokKartiModel.getBirimi());
		stokKartiFrame.tfBarkodu.setText(stokKartiModel.getBarkodu());
		stokKartiFrame.cbKdvTipi.setSelectedItem(stokKartiModel.getKdvTipi());
		stokKartiFrame.taAciklama.setText(stokKartiModel.getAcıklama());
		stokKartiFrame.tfOlusturmaTarihi.setText(stokKartiModel.getOlusturmaTarihi());
		
	}
}
