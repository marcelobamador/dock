package br.com.dock.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.dock.model.TerminalEntity;
import br.com.dock.repository.TerminalRepository;
import br.com.dock.request.ChangeTerminalRequest;
import br.com.dock.service.TerminalService;

import static java.util.Objects.isNull;

@Service
public class TerminalServiceImpl implements TerminalService {
	
	TerminalRepository terminalRepository;
	
	public TerminalServiceImpl(TerminalRepository terminalRepository) {
		this.terminalRepository = terminalRepository;
	}

	public List<TerminalEntity> getAllTerminals() {
		return this.terminalRepository.findAll();
	}

	public TerminalEntity getAllTerminalsById(Integer id) {
		return this.terminalRepository.getById(id);
	}
	
	@Transactional
	public TerminalEntity changeTerminal(Integer id, ChangeTerminalRequest changeTerminal) {
		TerminalEntity terminalEntityDb = this.terminalRepository.getById(id);
		
		if (isNull(terminalEntityDb)) {
			return null;
		}
		
		terminalEntityDb.setModel(changeTerminal.getModel());
		terminalEntityDb.setMxf(changeTerminal.getMxf());
		terminalEntityDb.setMxr(changeTerminal.getMxr());
		terminalEntityDb.setPlat(changeTerminal.getPlat());
		terminalEntityDb.setPtid(changeTerminal.getPtid());
		terminalEntityDb.setPVERFM(changeTerminal.getPVERFM());
		terminalEntityDb.setSam(changeTerminal.getSam());
		terminalEntityDb.setSerial(changeTerminal.getSerial());
		terminalEntityDb.setVersion(changeTerminal.getVersion());
		
		return this.terminalRepository.save(terminalEntityDb);
	}

}
