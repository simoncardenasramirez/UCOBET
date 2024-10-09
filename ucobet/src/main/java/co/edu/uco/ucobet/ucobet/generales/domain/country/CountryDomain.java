package co.edu.uco.ucobet.ucobet.generales.domain.country;

import co.edu.uco.ucobet.ucobet.generales.domain.Domain;

import java.util.UUID;



public final class CountryDomain extends Domain {

	private String name;

	// este constructor publico o privado ? depende de los mapper, ellos deben poder
	// ver el objeto (mirar en todas las clases domain)
	private CountryDomain(final UUID id, final String name) {
		super(id);
		setName(name);
	}

	public static final CountryDomain create(final UUID id, final String name) {
		return new CountryDomain(id, name);
	}

	public final String getName() {
		return name;
	}

	private final void setName(final String name) {
		this.name = name;
	}

}
