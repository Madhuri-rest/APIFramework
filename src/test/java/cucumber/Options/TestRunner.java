package cucumber.Options;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\APIFramework\\src\\test\\java\\Feature",plugin = {"json:target/jsonReport/apireport.json" ,"html:target/cucumber-reports"} , glue ={"StepDefination"}  )
public  class TestRunner {

}
