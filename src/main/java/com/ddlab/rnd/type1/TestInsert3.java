package com.ddlab.rnd.type1;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Datastore;

import com.ddlab.rnd.Util;

public class TestInsert3 {
	public static void main(String[] args) {
		Datastore ds = Util.getDatastore();

		List<ValdnReport> reportList = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			ValdnReport report = new ValdnReport();
			report.setName("Product-Name-" + i);
			report.setType("Network Type - " + i);
			report.setReportId("r-" + i);

			List<VldnReportDetails> details = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				VldnReportDetails detail = new VldnReportDetails();
				detail.setValidation("Validation-" + j);
				detail.setValue("Value-" + j);
				detail.setDetialId("d-" + j);
				details.add(detail);
			}

			report.setDetailsList(details);

			reportList.add(report);
		}

		ds.save(reportList);

		System.out.println("Data saved successfully ...");
	}
}
