package cl.bbr.mdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


import cl.bbr.mdp.service.ServiceImpl;

@RestController
@RequestMapping("/api/v1/desafio/mdp/")
public class Controller {

	@Autowired
	private ServiceImpl service;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> createRamdonTrx() {

		ResponseEntity<?> result = new ResponseEntity<Object>( service.createRamdonTrx(), HttpStatus.OK);

		return result;
	}

	@RequestMapping(value="/search", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> search(@RequestParam(required = false) String paymentMethod){
		ResponseEntity<?> result = new ResponseEntity<Object>(service.searchTrx(paymentMethod), HttpStatus.OK);
		return result;
	}

}
