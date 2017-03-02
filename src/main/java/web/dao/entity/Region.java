package web.dao.entity;

public class Region {
	private int id;
	private String name;
	private String administrativeCode;
	private int level;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdministrativeCode() {
		return administrativeCode;
	}
	public void setAdministrativeCode(String administrativeCode) {
		this.administrativeCode = administrativeCode;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
