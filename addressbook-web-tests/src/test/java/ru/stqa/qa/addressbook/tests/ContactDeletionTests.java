package ru.stqa.qa.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.gotoHomePage();
        app.selectContact();
        app.deleteSelectedContact();
        app.acceptAlertToDelete();
        app.gotoHomePage();
    }

}
