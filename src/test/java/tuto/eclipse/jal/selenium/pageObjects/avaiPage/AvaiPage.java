package tuto.eclipse.jal.selenium.pageObjects.avaiPage;

public class AvaiPage {
	public AvaiPage() {
		super();
		System.out.println("La new page dispo à été crée");
	}

	public void run() {
		performActions();
	}

	private void performActions() {
		System.out.println("On va faire les actions de la page dispo");
		AvaiPageActions actions = new AvaiPageActions();
		actions.clickContinueButton();

	}
}
