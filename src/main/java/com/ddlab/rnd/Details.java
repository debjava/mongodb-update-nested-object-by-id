package com.ddlab.rnd;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import lombok.Data;
@Data
public class Details {
	
	@Id
	private String _id = new ObjectId().toString();
	@Property("validation")
	private String validation;
	@Property("value")
	private String value;

}
