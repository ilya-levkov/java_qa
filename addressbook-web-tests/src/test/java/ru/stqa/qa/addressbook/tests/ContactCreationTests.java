package ru.stqa.qa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.qa.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void testContactCreation() {
        app.gotoContactAddPage();
        app.fillContactForm(new ContactData("Ilya", "Levkov", "Ryazan", "89209622355", "ilya.levkov2@gmail.com"));
        app.submitContactCreation();
        app.returnToContactPage();
    }

}
