package testNG;

import org.testng.annotations.Test;

public class DependencyManagement {


	//HighSchool
	//Higher secondary
	//Engineering


	@Test()
	public void highSchool() {
		System.out.println("High school");
	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher secondary");
	}
	@Test (dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println("Engineering");
	}


}
