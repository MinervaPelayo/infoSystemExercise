package com.exercise.infosystem.domain;

public class Person {
	
	private String personalIdentityCode;
	private String name;
	private Residence residence;
	private String municipality;
	private String citizenship;
	private String nativeLanguage;
	private String birthDate;
	private String occupation;
	
	public Person() {
	}

	public Person(String personalIdentityCode, String name, Residence residence, String municipality,
			String citizenship, String nativeLanguage, String birthDate, String occupation) {
		super();
		this.personalIdentityCode = personalIdentityCode;
		this.name = name;
		this.residence = residence;
		this.municipality = municipality;
		this.citizenship = citizenship;
		this.nativeLanguage = nativeLanguage;
		this.birthDate = birthDate;
		this.occupation = occupation;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPersonalIdentityCode() {
		return personalIdentityCode;
	}

	public String getName() {
		return name;
	}

	public String getNativeLanguage() {
		return nativeLanguage;
	}

	public String getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Person [personalIdentityCode=" + personalIdentityCode + ", name=" + name + ", residence=" + residence
				+ ", municipality=" + municipality + ", citizenship=" + citizenship + ", nativeLanguage="
				+ nativeLanguage + ", birthDate=" + birthDate + ", occupation=" + occupation + "]";
	}

}
