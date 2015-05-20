package nl.angarde.jtdp.declaratie.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Een Declaratie formulier die door een medewerker is ingevuld.
 * @author Andre
 *
 */
@Entity
public class Declaratie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private Integer medewerkerId;
	private int maand;
	private int jaar;
	private Date datumAkkoordMedewerker;
	private Date datumAkkoordWerkgever;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getMedewerkerId() {
		return medewerkerId;
	}

	public void setMedewerkerId(Integer medewerkerId) {
		this.medewerkerId = medewerkerId;
	}

	public int getMaand() {
		return maand;
	}

	public void setMaand(int maand) {
		this.maand = maand;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	public Date getDatumAkkoordMedewerker() {
		return datumAkkoordMedewerker;
	}

	public void setDatumAkkoordMedewerker(Date datumAkkoordMedewerker) {
		this.datumAkkoordMedewerker = datumAkkoordMedewerker;
	}

	public Date getDatumAkkoordWerkgever() {
		return datumAkkoordWerkgever;
	}

	public void setDatumAkkoordWerkgever(Date datumAkkoordWerkgever) {
		this.datumAkkoordWerkgever = datumAkkoordWerkgever;
	}

}
