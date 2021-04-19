package com.company;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Stepdefs {
    @Given("^User gets random Beer$")
    public void getThePunkapi()throws Exception {
        String url = "https://api.punkapi.com/v2/beers/random";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        con.setRequestMethod("GET");
        int responsecode = con.getResponseCode();
        if (responsecode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responsecode);
        } else {
            Scanner scanner = new Scanner(URL.openStream());

            //Write all the JSON data into a string using a scanner
            while (scanner.hasNext()) {
                String inline = scanner.nextLine();
            }

            //Close the scanner
            scanner.close();

        }
    }

        @Then("the id is printed to console")
        public void theIdIsPrintedToConsole() {

            String idString = puzzle.getString("Id");
        }
    }
}
