package ru.stqa.qa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.qa.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Ilya", "Levkov", "Ryazan", "89209622355", "ilya.levkov2@gmail.com", null), true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getNavigationHelper().gotoHomePage();
    }

}
