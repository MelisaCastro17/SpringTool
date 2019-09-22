package co.edu.unilibre.rest.dto;

public class MovieDto {
	private String name;
	private Integer year;
	public MovieDto(String name, Integer year) {
		super();
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
}
