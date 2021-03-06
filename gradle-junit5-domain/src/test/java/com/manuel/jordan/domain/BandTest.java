package com.manuel.jordan.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 *
 * @author manueljordan
 * @since gradle-junit-5
 */
class BandTest {

	@Test
	void toPassOneTest() {

		Band band = new Band("Pink Floyd");

		assertThat(band).isNotNull()
		                .isInstanceOf(Band.class)
		                .extracting("name")
		                .doesNotContainNull()
		                .containsExactly("Pink Floyd");

	}

	@Test
	void toPassTwoTest() {

		Band band = new Band("The Doors");

		assertThat(band).isNotNull()
		                .isInstanceOf(Band.class)
		                .extracting("name")
		                .doesNotContainNull()
		                .containsExactly("The Doors");

	}

	@Test
	void toFailOneTest() {

		Band band = new Band("Yes");

		assertThat(band).isNotNull()
		                .isInstanceOf(Band.class)
		                .extracting("name")
		                .doesNotContainNull()
		                .containsExactly("No");

	}

}