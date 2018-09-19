package com.gio.composition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROFESSOR")
public class Professor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int professorId;
	
	@Column(name="professor_name")
	private String professorName;
	
	// LAZY fetch will get on demand more memory friendly
	// EAGER fetch will get all data cached
	// Cascade ALL will delegate all changes to composition
	// classes (Detach, Merge, Persist, Refresh, and Remove)
	@ManyToMany(mappedBy="professors", fetch=FetchType.LAZY, 
			cascade=CascadeType.ALL)
	private List<ResearchProject> projects;
	
	public Professor() {
		this.projects = new ArrayList<ResearchProject>();
	}

	public Professor(String professorName) {
		this();
		this.professorName = professorName;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public List<ResearchProject> getProjects() {
		return projects;
	}

	public void setProjects(List<ResearchProject> projects) {
		this.projects = projects;
	}
	
	// helper to assign projects to professor
	public void assignProjectToProfessor(ResearchProject project) {
		this.projects.add(project);
	}
	

}
