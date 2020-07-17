package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

public class DBActions extends CommonOps
{
    @Step("Get The Credentials from DB")
    public static List <String> getCredentials(String query)
    {
        List <String> credentials = new ArrayList<String>();
        try
        {
            rs = stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1));
            credentials.add(rs.getString(2));
        }
        catch (Exception e)
        {
            System.out.println("Error occurred while Printing Table Data, See details: " + e);
        }
        return credentials;
    }
}
