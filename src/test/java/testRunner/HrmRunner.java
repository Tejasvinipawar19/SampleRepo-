package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles/Hrm.feature",
                      glue="stepdef" ,
                      publish=true)
public class HrmRunner 
{

}
