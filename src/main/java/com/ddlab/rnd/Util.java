package com.ddlab.rnd;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class Util {

	private Util() {

	}

	public static Datastore getDatastore() {

		final Morphia morphia = new Morphia();
		morphia.mapPackage("com.ddlab.rnd");

		final String host = "localhost";
		final int port = 27017;
		MongoClient mongoClient = new MongoClient(host, port);

		final Datastore datastore = morphia.createDatastore(mongoClient, "morphia_example");
		datastore.ensureIndexes();

		return datastore;

	}
}
