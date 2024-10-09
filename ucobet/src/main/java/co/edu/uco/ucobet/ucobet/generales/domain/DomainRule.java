package co.edu.uco.ucobet.ucobet.generales.domain;

public interface DomainRule<T> {

	void execute(T data);
}
