package Commandler;

import javax.swing.table.DefaultTableModel;
import FrameCommandler.StokKartiFrameCommand;
import Frameler.StokKartiListesiFrame;
import Modeller.StokKartiModel;

public class PopupStokKartiCommand {

	public void stokKartiDoldur(StokKartiListesiFrame stokKartiListesiFrame) {
		StokKartiModel stokKartiModel = new StokKartiModel();
				
		DefaultTableModel model = (DefaultTableModel) stokKartiListesiFrame.tbTable.getModel();
		int selectedRowIndex = stokKartiListesiFrame.tbTable.getSelectedRow();
		
		stokKartiModel.setStokKodu((String) model.getValueAt(selectedRowIndex, 0));
		stokKartiModel.setStokAdı((String) model.getValueAt(selectedRowIndex, 1));
		stokKartiModel.setStokTipi((Integer) model.getValueAt(selectedRowIndex, 2));
		stokKartiModel.setBirimi((String) model.getValueAt(selectedRowIndex, 3));
		stokKartiModel.setBarkodu((String) model.getValueAt(selectedRowIndex, 4));
		stokKartiModel.setKdvTipi((Double)model.getValueAt(selectedRowIndex, 5));
		stokKartiModel.setAcıklama((String) model.getValueAt(selectedRowIndex, 6));
		stokKartiModel.setOlusturmaTarihi((String) model.getValueAt(selectedRowIndex, 7));

		StokKartiFrameCommand stokKartiFrameCommand = new StokKartiFrameCommand(); 
		stokKartiFrameCommand.execute();
		
		stokKartiFrameCommand.stokKartiFrame.tfStokKodu.setText(stokKartiModel.getStokKodu());
		stokKartiFrameCommand.stokKartiFrame.tfStokAdı.setText(stokKartiModel.getStokAdı());
		stokKartiFrameCommand.stokKartiFrame.cbStokTipi.setSelectedItem(stokKartiModel.getStokTipi());
		stokKartiFrameCommand.stokKartiFrame.cbBirimi.setSelectedItem(stokKartiModel.getBirimi());
		stokKartiFrameCommand.stokKartiFrame.tfBarkodu.setText(stokKartiModel.getBarkodu());
		stokKartiFrameCommand.stokKartiFrame.cbKdvTipi.setSelectedItem(stokKartiModel.getKdvTipi());
		stokKartiFrameCommand.stokKartiFrame.taAciklama.setText(stokKartiModel.getAcıklama());
		stokKartiFrameCommand.stokKartiFrame.tfOlusturmaTarihi.setText(stokKartiModel.getOlusturmaTarihi());
		
	}
}
