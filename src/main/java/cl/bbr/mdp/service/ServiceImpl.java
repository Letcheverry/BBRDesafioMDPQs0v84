package cl.bbr.mdp.service;

import java.time.Instant;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bbr.mdp.entity.EntityTransaction;
import cl.bbr.mdp.repository.TrxRepository;

@Service
public class ServiceImpl implements cl.bbr.mdp.service.Service {

	enum Type {
		DEBITO, CREDITO, CHEQUE, EFECTIVO;
	}

	@Autowired
	private TrxRepository trxRepository;

	@Value("${custom.global.commerce}")
	private String commerce;

	@Value("${custom.global.user}")
	private String user;


	public EntityTransaction createRamdonTrx() {

		EntityTransaction entTrx = new EntityTransaction();
		Random ran = new Random();
		int amount = ran.nextInt(6000) + 5000;
		Instant instant = Instant.now();

		entTrx.setCommerce(commerce);
		entTrx.setType(Type.values()[new Random().nextInt(Type.values().length)].toString());
		entTrx.setAmount(amount);
		entTrx.setUser(user);
		entTrx.setDatetrx(instant);
		trxRepository.save(entTrx);

		return entTrx;

	}


	public List<EntityTransaction> searchTrx(String type){
		List<EntityTransaction> entTrx;
		if (type == null) {
			entTrx = trxRepository.findAll();
		}else{
			entTrx = trxRepository.findAllByTypeIgnoreCase(type);
		}

		return entTrx;

	}




}
