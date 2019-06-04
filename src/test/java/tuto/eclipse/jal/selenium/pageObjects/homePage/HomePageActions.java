package tuto.eclipse.jal.selenium.pageObjects.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class HomePageActions {

	/*
	 * ACTIONS
	 */
	protected void clickSearchButton() {
		MyDriver.driver.findElement(By.id(HomePageIDs.SEARCH_BUTTON_ID)).click();
	}

	public void closeModal() {
		MyDriver.driver.findElements(By.cssSelector(HomePageIDs.MODAL_CLOSE_BUTTON_CSS)).get(1).click();
	}

	public void setDepartureCity(String departurecity) {
		// Selector
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_FROM_CITY_ID)));
		s.selectByValue(departurecity);
	}

	public void setArrivalCity(String ArrivalCity) {
		Select s1 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.ARRIVAL_TO_CITY_ID)));
		s1.selectByValue(ArrivalCity);

	}

	public void setDepartureDate(String D, String M) {

		Select s1 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_DAY)));
		s1.selectByValue(D);
		Select s2 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_MONTH)));
		s2.selectByValue(M);
	}

	public void setReturnDate(String D, String M) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_DAY)));
		s.selectByValue(D);
		Select s1 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_MONTH)));
		s1.selectByValue(M);
	}

	public void closeModal1() {
		MyDriver.driver.findElements(By.cssSelector(HomePageIDs.MODAL_CLOSE_BUTTON_CSS)).get(1).click();
	}

}
