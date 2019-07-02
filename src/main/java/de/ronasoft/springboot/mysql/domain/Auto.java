package de.ronasoft.springboot.mysql.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Auto {
    private Long id;
    private String model;
    private String marke;
    private String herstellungsland;
    private float preis;
    
    public Auto() {
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
		this.id = id;
	}
 
    public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getHerstellungsland() {
		return herstellungsland;
	}

	public void setHerstellungsland(String herstellungsland) {
		this.herstellungsland = herstellungsland;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((herstellungsland == null) ? 0 : herstellungsland.hashCode());
		result = prime * result + ((marke == null) ? 0 : marke.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + Float.floatToIntBits(preis);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (herstellungsland == null) {
			if (other.herstellungsland != null)
				return false;
		} else if (!herstellungsland.equals(other.herstellungsland))
			return false;
		if (marke == null) {
			if (other.marke != null)
				return false;
		} else if (!marke.equals(other.marke))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Float.floatToIntBits(preis) != Float.floatToIntBits(other.preis))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Auto [id=");
		builder.append(id);
		builder.append(", model=");
		builder.append(model);
		builder.append(", marke=");
		builder.append(marke);
		builder.append(", herstellungsland=");
		builder.append(herstellungsland);
		builder.append(", preis=");
		builder.append(preis);
		builder.append("]");
		return builder.toString();
	}
}
