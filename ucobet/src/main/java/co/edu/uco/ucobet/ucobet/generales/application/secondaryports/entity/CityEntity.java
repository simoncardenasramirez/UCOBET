package co.edu.uco.ucobet.ucobet.generales.application.secondaryports.entity;


import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "City")
public final class CityEntity {
	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "state")
	private StateEntity state;

	public CityEntity() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
	}

	public CityEntity(final UUID id,final  String name) {
		setId(id);
		setName(name);
	}

	public CityEntity(final UUID id,final  String name, final StateEntity state) {
		setId(id);
		setName(name);
		setState(state);
	}


	public static final CityEntity create(){
		return new CityEntity();
	}

	public static final CityEntity create(final UUID id){
		return new CityEntity(id, TextHelper.EMPTY);
	}

	public static final CityEntity create(final UUID id, final String name){
		return new CityEntity(id, name);
	}

	public static final CityEntity create(final UUID id, final String name, final StateEntity state){
		return new CityEntity(id, name, state);
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

	public final StateEntity getState() {
		return state;
	}

	public final void setState(final StateEntity state) {
		this.state = ObjectHelper.getDefault(state, StateEntity.create());
	}


}
