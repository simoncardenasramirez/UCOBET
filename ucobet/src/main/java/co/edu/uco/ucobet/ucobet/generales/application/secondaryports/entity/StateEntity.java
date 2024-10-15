package co.edu.uco.ucobet.ucobet.generales.application.secondaryports.entity;

import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "State")
public final class StateEntity  {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "country")
	private CountryEntity country;

	public StateEntity() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
		setCountry(CountryEntity.create());
	}

	public StateEntity(final UUID id,final  String name) {
		setId(id);
		setName(name);
	}

	public StateEntity(final UUID id,final  String name, final CountryEntity country) {
		setId(id);
		setName(name);
		setCountry(country);
	}


	public static final StateEntity create(){
		return new StateEntity();
	}

	public static final StateEntity create(final UUID id){
		return new StateEntity(id, TextHelper.EMPTY,CountryEntity.create());
	}

	public static final StateEntity create(final UUID id, final String name){
		return new StateEntity(id, name);
	}

	public static final StateEntity create(final UUID id, final String name, final CountryEntity country){
		return new StateEntity(id, name, country);
	}

	public UUID getId() {
		return id;
	}

	public final void setId(UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}

	public String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = TextHelper.getDefault(name, TextHelper.EMPTY);
	}

	public final CountryEntity getCountry() {
		return country;
	}

	public final void setCountry(final CountryEntity country) {
		this.country = ObjectHelper.getDefault(country, CountryEntity.create());
	}
}
