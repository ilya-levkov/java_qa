package ru.stqa.qa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.qa.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Ilya", "Levkov", "Ryazan", "89209622355", "ilya.levkov2@gmail.com", "test1"), true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Ivan", "Petrov", "Ryazan", "89209622355", "ivan.petrov@gmail.com", "test1"), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactPage();
    }
}
