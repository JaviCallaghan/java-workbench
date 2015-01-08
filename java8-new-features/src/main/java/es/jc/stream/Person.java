/**
 * 
 */
package es.jc.stream;

import java.io.Serializable;

/**
 * Simple POJO for streams content.
 */
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private Role role;
	private int level;

	/**
	 * Constructor with all fields.
	 * 
	 * @param name the name
	 * @param age the age
	 * @param role the role
	 */
	public Person(String name, Role role, int level) {
		super();
		this.name = name;
		this.role = role;
		this.level = level;
	}

	/**
	 * Getter for the name.
	 * @return the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for the role.
	 * @return the role.
	 */
	public Role getRole() {
		return role;
	}
	
	/**
	 * Getter for the level.
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Person {name=" + name + ", role=" + role + ", level=" + level + "}";
	}

}
