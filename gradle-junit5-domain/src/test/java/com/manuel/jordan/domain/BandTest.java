package com.manuel.jordan.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BandTest {

	@Test
	void toPassOne() {

		Band band = new Band("Pink Floyd");

		assertThat(band).isNotNull()
		                .isInstanceOf(Band.class)
		                .extracting("name")
		                .doesNotContainNull()
		                .containsExactly("Pink Floyd");

	}

	@Test
	void toPassTwo() {

		Band band = new Band("The Doors");

		assertThat(band).isNotNull()
		                .isInstanceOf(Band.class)
		                .extracting("name")
		                .doesNotContainNull()
		                .containsExactly("The Doors");

	}

}