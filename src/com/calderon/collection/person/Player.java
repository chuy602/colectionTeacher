package com.calderon.collection.person;

public class Player extends Person {
	private Integer dorsal;
	private String demarcation;
	
	public Player(String dni, String nombre, Integer edad, Integer dorsal, String demarcation) {
		super(dni, nombre, edad);
		this.dorsal = dorsal;
		this.demarcation = demarcation;
	}
	
	

	public Integer getDorsal() {
		return dorsal;
	}

	public String getDemarcation() {
		return demarcation;
	}

	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}

	public void setDemarcation(String demarcation) {
		this.demarcation = demarcation;
	}

	@Override
	public String toString() {
		return "Player [getDorsal()=" + getDorsal() + ", getDemarcation()=" + getDemarcation() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
