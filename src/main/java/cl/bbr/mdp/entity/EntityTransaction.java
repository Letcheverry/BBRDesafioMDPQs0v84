package cl.bbr.mdp.entity;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Cacheable(true)
@Entity
@Table(name = "transactions")
public class EntityTransaction implements Serializable {

	private static final long serialVersionUID = -5454315670915840467L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" )
	private Long id;

	@Column(name = "commerce" )
	private String commerce;

	@Column(name = "amount")
	private Integer amount;

	@Column(name = "type")
	private String type;

	@Column(name = "user")
	private String user;

	@Column(name = "datetrx")
	private Instant datetrx;

	public void setUser(String user) {
		this.user = user;
	}

	public void setDatetrx(Instant datetrx) {
		this.datetrx = datetrx;
	}

	public String getUser() {
		return user;
	}

	public Instant getDatetrx() {
		return datetrx;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommerce() {
		return commerce;
	}

	public void setCommerce(String commerce) {
		this.commerce = commerce;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EntityTransaction [id=" + id + ", commerce=" + commerce + ", amount=" + amount + ", type=" + type + ", user="+ user + ", datetrx=" + datetrx +"]" ;
	}

}