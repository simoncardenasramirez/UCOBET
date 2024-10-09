package co.edu.uco.ucobet.ucobet.generales.domain.city;

import co.edu.uco.ucobet.ucobet.generales.domain.Domain;
import co.edu.uco.ucobet.ucobet.generales.domain.state.StateDomain;

import java.util.UUID;



public final class CityDomain extends Domain {

	private String name;
	private StateDomain state;

	// este constructor publico o privado ? depende de los mapper, ellos deben poder
	// ver el objeto (mirar en todas las clases domain)
	private CityDomain(final UUID id, final String name, final StateDomain state) {
		super(id);
		setName(name);
		setState(state);

	}

	public static final CityDomain create(final UUID id, final String name, final StateDomain state) {
		return new CityDomain(id, name, state);
	}

	public StateDomain getState() {
		return state;
	}

	private void setState(final StateDomain state) {
		this.state = state;
	}

	public final String getName() {
		return name;
	}

	private final void setName(final String name) {
		this.name = name;
	}

}
