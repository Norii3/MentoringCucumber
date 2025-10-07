package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddRecordPage;

import java.util.List;

public class AddRecordStepDefinitions {

    AddRecordPage addRecordPage;

    @When("enter data")
    public void enter_data(DataTable dataTable) {
        addRecordPage = new AddRecordPage();

        List<List<String>> lists = dataTable.asLists();
        for (List<String> eachList : lists) {
            System.out.println(eachList);
            addRecordPage.enterName(eachList.getFirst());
            addRecordPage.enterAge(eachList.get(1));
            addRecordPage.selectCountry(eachList.getLast());
            addRecordPage.clickAddRecord();
        }
    }

    @Then("assert added records")
    public void assertAddedRecords() {
        addRecordPage = new AddRecordPage();
        addRecordPage.assertAddRecords();
    }
}
