package com.manuel.jordan.domain;

/**
 *
 * @author manueljordan
 * @since gradle-junit-5
 */
public class Band {

	private String name;

	public Band(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Band [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}