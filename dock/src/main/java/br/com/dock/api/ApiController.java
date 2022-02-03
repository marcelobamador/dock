package br.com.dock.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dock.dto.TerminalDTO;
import br.com.dock.service.TerminalService;

@RestController
@RequestMapping("v1/")
public class ApiController {
	
	@Autowired
	TerminalService terminalService;
	
	@GetMapping("terminals")
	public List<TerminalDTO> getAllTerminals() {
		return terminalService.getAllTerminals();
	}

}
