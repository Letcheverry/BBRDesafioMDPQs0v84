package cl.bbr.mdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.bbr.mdp.entity.EntityTransaction;
import java.util.List;


@Repository
@Transactional
public interface TrxRepository extends JpaRepository<EntityTransaction, Integer> {
    List<EntityTransaction> findAllByTypeIgnoreCase(String type);
}


