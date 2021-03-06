package SanityTests;

import Extensions.ApiActions;
import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.ApiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class grafanaAPI extends CommonOps
{
    /**
     ------------- ##@ For running this u need to download Grafana, Open Grafana localhost server and use your machine to run @## -------------
     ------------- ##@ Modify the Details as you wish @## -------------**/

    // ------------- ##@  This test can past by changing the name to the team that you wish to search and you already assigned  @## -------------
    @Test(priority = 0, description = "Test01: Get Team From Grafana") // This test marked in comment on purpose
    @Description("Test Description: Login to Grafana and get team details")
    public void test01_GetTeam()
    {
        Verifications.text(ApiFlows.getTeamProperty("teams[0].name"),"Shay's Team"); // In my grafana user its the team name, variable change between users
    }

    @Test(priority = 0, description = "Test01: Add team and verify")
    @Description("Test Description: Add team to Grafana and verify it")
    public void test01_addTeamAndVerify()
    {
        ApiFlows.postTeam("Lior's Team", "Shula@gmail.com");
        Verifications.text(ApiFlows.getTeamProperty("teams[0].name"),"Lior's Team");
    }

    @Test(priority = 1, description = "Test02: Update team and verify")
    @Description("Test Description: Update team in Grafana and verify it")
    public void test02_UpdateTeamAndVerify()
    {
        ApiFlows.updateTeam("Lior's Team", "lior@gmail.com", "2"); // The team ID Changing --> It's depend on how many times you created team on your machine
        Verifications.text(ApiFlows.getTeamProperty("teams[0].name"),"Lior's Team");
    }

    @Test(priority = 2, description = "Test03: Delete team and verify")
    @Description("Test Description: Delete team from Grafana and verify number of teams")
    public void test03_DeleteTeamAndVerify() //"/api/teams/"
    {
        ApiFlows.deleteTeam("5"); // The team ID Changing --> It's depend on how many times you created team at your machine
        Verifications.text(ApiFlows.getTeamProperty("totalCount"),"1");
    }


    @Test(priority = 2, description = "Test03: Delete team and verify")
    @Description("Test Description: Delete team from Grafana and verify number of teams")
    public void test03_DeleteTeamAndVerify2() //"/api/teams/"
    {
        ApiActions.delete("/api/teams/", "5"); // The team ID Changing --> It's depend on how many times you created team at your machine
        Verifications.text(ApiFlows.getTeamProperty("totalCount"),"1");
    }
}
