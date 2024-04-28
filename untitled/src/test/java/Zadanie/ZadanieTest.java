package Zadanie;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/HomePage.feature", plugin = {"pretty","html:out.html"})
public class ZadanieTest {
}