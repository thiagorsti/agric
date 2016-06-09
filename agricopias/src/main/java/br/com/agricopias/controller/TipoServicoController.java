package br.com.agricopias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.agricopias.entity.TipoServico;
import br.com.agricopias.service.TipoServicoService;

@Controller
@RequestMapping("/servico/tipos")
public class TipoServicoController {	
	
	@Autowired
	private TipoServicoService tipoServicoService;	
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<TipoServico> findAll() {
		return tipoServicoService.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody TipoServico findById(@PathVariable Long id) {
		return tipoServicoService.findById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void delete(@PathVariable Long id) {
		tipoServicoService.delete(id);		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody TipoServico update(@PathVariable Long id, @RequestBody TipoServico tipoServico) {
		return tipoServicoService.update(id, tipoServico);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody TipoServico add(@RequestBody TipoServico tipoServico) {
		return tipoServicoService.add(tipoServico);
	}
}
