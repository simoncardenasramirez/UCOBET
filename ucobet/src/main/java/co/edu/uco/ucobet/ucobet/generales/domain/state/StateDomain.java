package co.edu.uco.ucobet.ucobet.generales.domain.state;

import co.edu.uco.ucobet.ucobet.generales.domain.Domain;
import co.edu.uco.ucobet.ucobet.generales.domain.country.CountryDomain;

import java.util.UUID;



public final class StateDomain extends Domain {

	private String name;
	private CountryDomain country;

	// este constructor publico o privado ? depende de los mapper, ellos deben poder
	// ver el objeto (mirar en todas las clases domain)
	private StateDomain(final UUID id, final String name, final CountryDomain country) {
		super(id);
		setName(name);
		setCountry(country);
	}

	public static final StateDomain create(final UUID id, final String name, final CountryDomain country) {
		return new StateDomain(id, name, country);
	}

	public CountryDomain getCountry() {
		return country;
	}

	private void setCountry(final CountryDomain country) {
		this.country = country;
	}

	public final String getName() {
		return name;
	}

	private final void setName(final String name) {
		this.name = name;
	}

}
