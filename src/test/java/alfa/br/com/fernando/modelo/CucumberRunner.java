package alfa.br.com.fernando.modelo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:reports/test-report"},
        glue = {"alfa.br.com.fernando"},
        features = {"src/test/resources/avaliacao.feature"})
public class CucumberRunner {
}
