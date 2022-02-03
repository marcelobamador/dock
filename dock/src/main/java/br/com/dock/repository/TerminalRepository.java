package br.com.dock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dock.model.TerminalEntity;
import br.com.dock.model.TerminalId;

public interface TerminalRepository extends JpaRepository<TerminalEntity, TerminalId>{

}
