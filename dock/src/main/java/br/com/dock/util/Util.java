package br.com.dock.util;

import java.util.ArrayList;
import java.util.List;

import br.com.dock.dto.TerminalDTO;
import br.com.dock.model.TerminalEntity;

public class Util {
	public static List<TerminalDTO> parseFindAllTerminals(List<TerminalEntity> terminalEntity) {
		List<TerminalDTO> listReturn = new ArrayList<TerminalDTO>();
		TerminalDTO returnDTO;
		for(TerminalEntity termEntity : terminalEntity) {
			returnDTO = new TerminalDTO();
			returnDTO.setLogic(termEntity.getTerminalId().getLogic());
			returnDTO.setModel(termEntity.getTerminalId().getModel());
			returnDTO.setMxf(termEntity.getMxf());
			returnDTO.setMxr(termEntity.getMxr());
			returnDTO.setPlat(termEntity.getPlat());
			returnDTO.setPtid(termEntity.getPtid());
			returnDTO.setPVERFM(termEntity.getPVERFM());
			returnDTO.setSam(termEntity.getSam());
			returnDTO.setSerial(termEntity.getTerminalId().getSerial());
			returnDTO.setVersion(termEntity.getTerminalId().getVersion());
			listReturn.add(returnDTO);
		}
		
		return listReturn;
	}
}
