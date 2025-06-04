package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:reports/cucumber-report.html"},
        glue = {"stepDefinitions"},
        features = {"src/test/resources/web"}
        //monochrome = true
)
public class CucumberRunner {
    // Kelas ini akan menjalankan semua skenario yang ada di dalam file .feature
}
