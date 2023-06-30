package resources;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BasePage;

public class Listeners extends BasePage implements ITestListener {

	public Listeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void onTestFailure(ITestResult result) {
		// not implemented

		try {
			takeScreenShots(result.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
