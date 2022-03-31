package CucumberOptions;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/Features",
        glue = {"stepsdefination"},
        tags="@tag2Login or @tag3Register or @tag1SelectFlight"
		)

public class TestRunner  {
}