package com.ddlab.rnd;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Datastore;

public class TestInsert1 {

	public static void main(String[] args) {
		Datastore ds = Util.getDatastore();
		
		List<Report> reportList = new ArrayList<>();
		
		for( int i = 0 ; i < 3; i++) {
			Report report = new Report();
			report.setName("Product-Name-"+i);
			report.setType("Network Type - "+i);
			
			List<Details> details = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				Details detail = new Details();
				detail.setValidation("Validation-" + j);
				detail.setValue("Value-" + j);
				details.add(detail);
			}
			
			report.setDetailsList(details);
			
			reportList.add(report);
		}

		ds.save(reportList);

		System.out.println("Data saved successfully ...");

	}

}
