package com.ddlab.rnd;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import lombok.Data;

@Data
@Entity(value = "vldnreports", noClassnameStored = true)
public class Report {
	
	@Id
	private String _id = new ObjectId().toString();
	@Property("name")
	private String name;
	@Property("type")
	private String type;
	
	@Embedded
	private List<Details> detailsList;
	
	
}
