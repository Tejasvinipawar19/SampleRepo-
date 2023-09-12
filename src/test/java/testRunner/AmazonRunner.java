package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*single scenario: tags="@scenario tag name"
 * multiple scenario: tags= "@scenariotag1 or @scenariotag2
 * ignore scenario: tags="not @scenario tag name"
 */



@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles/Amezon.feature",
                      glue="stepdef",
                     // tags="@HomePage or @Mobiles",
                      tags="not @Mobiles",
                      publish=true)
public class AmazonRunner {

}
