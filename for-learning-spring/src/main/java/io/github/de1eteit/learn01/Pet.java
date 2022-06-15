package io.github.de1eteit.learn01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pet {
	@Value("Lulu")
	private String name;
	@Value("11")
	private int ownTime;

	public Pet() {
	}

	public Pet(String name, int ownTime) {
		this.name = name;
		this.ownTime = ownTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOwnTime() {
		return ownTime;
	}

	public void setOwnTime(int ownTime) {
		this.ownTime = ownTime;
	}

	@Override
	public String toString() {
		return "Pet{" +
				"name='" + name + '\'' +
				", ownTime=" + ownTime +
				'}';
	}
}
