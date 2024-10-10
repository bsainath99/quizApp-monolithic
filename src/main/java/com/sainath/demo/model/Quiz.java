package com.sainath.demo.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
@Data
@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	@ManyToMany
	private List<Question> questions;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public List<Question> getQuestions() {
//		return questions;
//	}
//	public void setQuestions(List<Question> questions) {
//		this.questions = questions;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, questions, title);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Quiz other = (Quiz) obj;
//		return id == other.id && Objects.equals(questions, other.questions) && Objects.equals(title, other.title);
//	}
//	@Override
//	public String toString() {
//		return "Quiz [id=" + id + ", title=" + title + ", questions=" + questions + "]";
//	}
//	public Quiz(int id, String title, List<Question> questions) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.questions = questions;
//	}
//	public Quiz() {
//		// TODO Auto-generated constructor stub
//	}
	
}
