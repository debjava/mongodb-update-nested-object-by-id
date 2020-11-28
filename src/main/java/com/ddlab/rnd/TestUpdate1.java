package com.ddlab.rnd;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.UpdateOperations;

public class TestUpdate1 {

	public static void main(String[] args) {
		Datastore ds = Util.getDatastore();

		UpdateOperations<Report> updateOperations = ds.createUpdateOperations(Report.class).disableValidation()
				.set("detailsList.$.validation", "Abra Ka Dabra").enableValidation();

		ds.update(ds.createQuery(Report.class)
				.filter("detailsList._id", "5fc21530727aab0a2c1190ee"), updateOperations);

		System.out.println("Updated successfully ...");

	}

}
