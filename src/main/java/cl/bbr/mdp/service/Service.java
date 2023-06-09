package cl.bbr.mdp.service;

import java.util.List;

import cl.bbr.mdp.entity.EntityTransaction;

public interface Service {

	public EntityTransaction createRamdonTrx ( );

	public List<EntityTransaction> searchTrx( String Type );

}
