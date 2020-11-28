package com.ddlab.rnd.type1;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import lombok.Data;

@Data
@Entity(value = "vldnreports", noClassnameStored = true)
public class ValdnReport {
	
	@Id
	private String _id = new ObjectId().toString();
	@Property("name")
	private String name;
	@Property("type")
	private String type;
	@Property("rid")
	private String reportId;
	
	@Embedded
	private List<VldnReportDetails> detailsList;
	
	
}
