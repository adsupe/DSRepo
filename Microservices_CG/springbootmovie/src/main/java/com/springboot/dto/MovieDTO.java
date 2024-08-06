package com.springboot.dto;

public class MovieDTO {

	private Long id;
	private String name;
	private String rating;
	private String director;

	public MovieDTO() {
		super();
	}

	public MovieDTO(Long id, String name, String rating, String director) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.director = director;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "MovieProjection [id=" + id + ", name=" + name + ", rating=" + rating + ", director=" + director + "]";
	}

}
