package br.com.dock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dock.dto.TerminalDTO;
import br.com.dock.model.TerminalEntity;
import br.com.dock.repository.TerminalRepository;
import br.com.dock.util.Util;

@Service
public class TerminalService {
	
	@Autowired
	TerminalRepository terminalRepository;
	
	public List<TerminalDTO> getAllTerminals(){
		List<TerminalEntity> terminalEntity = terminalRepository.findAll();
		return Util.parseFindAllTerminals(terminalEntity);
	}

}
