import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"cucumber/features"},
        glue = {"steps"},
        plugin = {"progress", "pretty", "html:Report1"}
)
public class testRunner extends AbstractTestNGCucumberTests {

}
