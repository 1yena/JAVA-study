package example_map;

import java.util.Objects;

public class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person other) {
		// 트리맥에서 정렬을 할 수 있도록 이름으로 비교.
		return name.compareTo(other.name);
	}

	// 중복을 없애줌.
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	
		

}
