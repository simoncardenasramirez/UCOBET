package co.edu.uco.ucobet.ucobet.generales.crosscutting.helpers;

public final class ObjectHelper {

	private static final ObjectHelper INSTANCE = new ObjectHelper();

	private ObjectHelper() {
		super();
	}

	public static final ObjectHelper getObjectHelper() {
		return INSTANCE;
	}

	public <O> boolean isNull(O objeto) {
		return objeto == null;
	}

	public <O> O getDefaultValue(O objeto, O valorDefecto) {
		return isNull(objeto) ? valorDefecto : objeto;
	}

}
