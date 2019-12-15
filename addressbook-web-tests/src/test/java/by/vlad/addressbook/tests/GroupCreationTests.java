package by.vlad.addressbook.tests;

import by.vlad.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    int before = app.getGroupHelper().getGroupCount();

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("Test1", null, null));

    int after = app.getGroupHelper().getGroupCount();

    Assert.assertEquals(after, before + 1);

  }

}
