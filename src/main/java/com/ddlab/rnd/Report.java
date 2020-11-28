package com.ddlab.rnd;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value = "reports", noClassnameStored = true)
public class Report {
	
	@Id
	private String _id = new ObjectId().toString();
	@Property("name")
	private String name;
	@Property("type")
	private String type;
	
	@Embedded
	private List<Details> detailsList;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public List<Details> getDetailsList() {
		return detailsList;
	}
	public void setDetailsList(List<Details> detailsList) {
		this.detailsList = detailsList;
	}
	
}
