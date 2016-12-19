package com.entity;

import java.sql.Date;

public class Film {
	private int film_id;
	private String title;
	private String description;
	private String release_year;
	private int language_id;
	private int original_language_id;
	private float rental_duration;
	private int length;
	private float replacement_cost;
	private String rating;
	private String special_features;
	private Date last_update;

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRelease_year() {
		return release_year;
	}

	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	public int getOriginal_language_id() {
		return original_language_id;
	}

	public void setOriginal_language_id(int original_language_id) {
		this.original_language_id = original_language_id;
	}

	public float getRental_duration() {
		return rental_duration;
	}

	public void setRental_duration(float rental_duration) {
		this.rental_duration = rental_duration;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getReplacement_cost() {
		return replacement_cost;
	}

	public void setReplacement_cost(float replacement_cost) {
		this.replacement_cost = replacement_cost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecial_features() {
		return special_features;
	}

	public void setSpecial_features(String special_features) {
		this.special_features = special_features;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

}
