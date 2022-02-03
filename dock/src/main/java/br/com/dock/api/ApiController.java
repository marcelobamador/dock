package br.com.dock.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dock.model.TerminalEntity;
import br.com.dock.request.ChangeTerminalRequest;
import br.com.dock.service.TerminalService;

@RestController
@RequestMapping("v1/terminals")
public class ApiController {
	
	TerminalService terminalService;
	
	public ApiController(TerminalService terminalService) {
		this.terminalService = terminalService;
	}
	
	
	@GetMapping
	public List<TerminalEntity> getAllTerminals() {
		return terminalService.getAllTerminals();
	}
	
	@GetMapping("/{id}")
	public TerminalEntity getAllTerminalsById(@PathVariable Integer id) {
		return terminalService.getAllTerminalsById(id);
	}
	
	@PatchMapping("/{id}")
	public TerminalEntity changeTerminal(@PathVariable Integer id, @RequestBody ChangeTerminalRequest changeTerminal) {
		return terminalService.changeTerminal(id, changeTerminal);
	}

}
