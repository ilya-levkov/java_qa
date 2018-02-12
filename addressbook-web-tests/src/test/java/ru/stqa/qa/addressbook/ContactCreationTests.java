package ru.stqa.qa.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void testContactCreation() {
        gotoContactAddPage();
        fillContactForm(new ContactData("Ilya", "Levkov", "Ryazan", "89209622355", "ilya.levkov2@gmail.com"));
        submitContactCreation();
        returnToContactPage();
    }

}
