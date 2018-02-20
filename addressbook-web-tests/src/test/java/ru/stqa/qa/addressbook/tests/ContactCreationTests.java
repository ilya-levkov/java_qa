package ru.stqa.qa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.qa.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Ilya", "Levkov", "Ryazan", "89209622355", "ilya.levkov2@gmail.com", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToContactPage();
    }

}
