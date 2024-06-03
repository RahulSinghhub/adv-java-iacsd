package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString

public class Doctors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String docname;
	private String speciality;
	/*
	 * public int getDid() { return did; } public void setDid(int did) { this.did =
	 * did; } public String getDocname() { return docname; } public void
	 * setDocname(String docname) { this.docname = docname; } public String
	 * getIssue() { return issue; } public void setIssue(String issue) { this.issue
	 * = issue; }
	 * 
	 * @Override public String toString() { return "Doctors [did=" + did +
	 * ", docname=" + docname + ", issue=" + issue + "]"; } public Doctors(int did,
	 * String docname, String issue) { super(); this.did = did; this.docname =
	 * docname; this.issue = issue; }
	 */
}
