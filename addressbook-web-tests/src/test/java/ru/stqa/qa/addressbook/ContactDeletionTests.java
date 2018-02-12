package ru.stqa.qa.addressbook;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        gotoHomePage();
        selectContact();
        deleteSelectedContact();
        acceptAlertToDelete();
        gotoHomePage();
    }

}
