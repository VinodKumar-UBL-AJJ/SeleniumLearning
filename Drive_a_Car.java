package testNG;

import org.testng.annotations.Test;

public class Drive_a_Car {
	
	@Test(priority = 0)
	public void startaCar() {
		
		System.out.println("Starting a car");
	}
	@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("Apply first gear");
	}
	@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("Apply second gear");
	}
	
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("Apply third gear");
	}
	@Test(priority = 4)
	public void putFourthGear() {
		System.out.println("Apply fourth gear");
	}
	@Test(enabled = false)
	public void SwitchOnMusic() {
		System.out.println("Switching the Music ON");
	}

}
