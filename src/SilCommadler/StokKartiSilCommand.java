package SilCommadler;

import Commandler.CommandIF;
import Frameler.StokKartiFrame;
import Modeller.StokKartiModel;

public class StokKartiSilCommand implements CommandIF {
	private StokKartiFrame stokKartiFrame;
	
	

	public StokKartiSilCommand(StokKartiFrame stokKartiFrame) {
		super();
		this.stokKartiFrame = stokKartiFrame;
	}


	@Override
	public void execute() {
		
		StokKartiModel stokKartiModel = new StokKartiModel();
		
		stokKartiModel.setStokKodu(stokKartiFrame.tfStokKodu.getText());
		
		stokKartiModel.delete();
		
	}
	
	
}
