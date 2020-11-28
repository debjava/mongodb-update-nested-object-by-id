package com.ddlab.rnd.type1;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.UpdateOperations;

import com.ddlab.rnd.Report;
import com.ddlab.rnd.Util;

public class TestUpdate3 {

	public static void main(String[] args) {
		Datastore ds = Util.getDatastore();

		UpdateOperations<ValdnReport> updateOperations = ds.createUpdateOperations(ValdnReport.class).disableValidation()
				.set("detailsList.$.validation", "Abra Ka Dabra").enableValidation();

		ds.update(ds.createQuery(ValdnReport.class)
				.filter("_id", "5fc29bb6727aab407c633f38")
				.filter("detailsList.did", "d-1"), updateOperations);

		System.out.println("Updated successfully ...");

	}

}
