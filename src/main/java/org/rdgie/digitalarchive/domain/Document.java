package org.rdgie.digitalarchive.domain;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "document")
public class Document {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "report_id")
	private int reportid;
	@Column(name = "date_of_report")
	private String dateofreport;
	@Column(name = "type_of_identifier")
	private String typeofidentifier;
	@Column(name = "classification")
	private String classification;
	@Column(name = "province")
	private String province;
	@Column(name = "district")
	private String district;
	@Column(name = "sector")
	private String sector;
	@Column(name = "cell")
	private String cell;
	@Column(name = "village")
	private String village;
	@Column(name = "firstname1")
	private String firstname1;
	@Column(name = "lastname1")
	private String lastname1;
	@Column(name = "firstname2")
	private String firstname2;
	@Column(name = "lastname2")
	private String lastname2;
	@Column(name = "firstname3")
	private String firstname3;
	@Column(name = "lastname3")
	private String lastname3;
	public int getReportid() {
		return reportid;
	}
	public void setReportid(int reportid) {
		this.reportid = reportid;
	}
	public String getDateofreport() {
		return dateofreport;
	}
	public void setDateofreport(String dateofreport) {
		this.dateofreport = dateofreport;
	}
	public String getTypeofidentifier() {
		return typeofidentifier;
	}
	public void setTypeofidentifier(String typeofidentifier) {
		this.typeofidentifier = typeofidentifier;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getFirstname1() {
		return firstname1;
	}
	public void setFirstname1(String firstname1) {
		this.firstname1 = firstname1;
	}
	public String getLastname1() {
		return lastname1;
	}
	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}
	public String getFirstname2() {
		return firstname2;
	}
	public void setFirstname2(String firstname2) {
		this.firstname2 = firstname2;
	}
	public String getLastname2() {
		return lastname2;
	}
	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}
	public String getFirstname3() {
		return firstname3;
	}
	public void setFirstname3(String firstname3) {
		this.firstname3 = firstname3;
	}
	public String getLastname3() {
		return lastname3;
	}
	public void setLastname3(String lastname3) {
		this.lastname3 = lastname3;
	}

}
