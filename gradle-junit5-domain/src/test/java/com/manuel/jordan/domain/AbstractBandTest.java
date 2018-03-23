package com.manuel.jordan.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 *
 * @author manueljordan
 * @since gradle-junit-5
 */
class AbstractBandTest {

	void toPassOneTest() {

		Band band = new Band("Pink Floyd");

		assertThat(band).isNotNull()
		                .isInstanceOf(Band.class)
		                .extracting("name")
		                .doesNotContainNull()
		                .containsExactly("Pink Floyd");

	}

	void toPassTwoTest() {

		Band band = new Band("The Doors");

		assertThat(band).isNotNull()
		                .isInstanceOf(Band.class)
		                .extracting("name")
		                .doesNotContainNull()
		                .containsExactly("The Doors");

	}

	void toPassThreeTest() {

		Band band = new Band("Rick Wakeman");

		assertThat(band).isNotNull()
		                .isInstanceOf(Band.class)
		                .extracting("name")
		                .doesNotContainNull()
		                .containsExactly("Rick Wakeman");

	}

	/**
	 *
	 * @author manueljordan
	 * @since gradle-junit-5
	 */
	static class StaticBandTest extends AbstractBandTest {

		@Test
		@Override
		void toPassOneTest() {
			super.toPassOneTest();
		}

		@Test
		@Override
		void toPassTwoTest() {
			super.toPassTwoTest();
		}

		@Test
		@Override
		void toPassThreeTest() {
			super.toPassThreeTest();
		}

	}

}