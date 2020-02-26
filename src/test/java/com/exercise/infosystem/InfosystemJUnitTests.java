package com.exercise.infosystem;

import com.exercise.infosystem.domain.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
public class InfosystemJUnitTests {
	
	@Test
	public void personClassTest() {
		Person firstPerson = new Person();
		assertThat(firstPerson).isNotNull();
	}

	@Test
	public void classesTest(){
		RealEstate estateTest = new RealEstate(123456789, "Juhana Tervo", "Rauhankatu 50", 4 );
		assertThat(estateTest.getOwnerName()).isEqualTo("Juhana Tervo");
		assertThat(estateTest.toString()).isNotNull();
		
		Residence residence = new Residence(258963, "Kajaaninkatu 45", 300, "owner-occupied", "inhabited", 3, 4);
		assertThat(residence.getApartmentCode()).isGreaterThan(0);
		
		Person personTest = new Person("15021970-512P", "Iida Hinkula", residence, "Espoo", "Finnish", "Finnish", "15-02-1970", "Business owner" );
		personTest.setMunicipality("Helsinki");
		assertThat(personTest.getMunicipality()).isEqualTo("Helsinki");
		
		Building buildingTest = new Building(51, "Kaarrostie 46", personTest, 2016, "Rented", 2100, "Store", estateTest);
		assertThat(buildingTest.getOwner()).isEqualTo(personTest);
	}
	
}
