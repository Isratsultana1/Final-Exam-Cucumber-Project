package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	//@Test
	@RunWith(Cucumber.class)
	@CucumberOptions(
		features="src\\test\\java\\feature\\techfios.feature",
		glue="steps",
		tags= "@Scenerio1 or @Scenerio2" ,
		monochrome=true,
		dryRun=false,
		plugin= {
				"pretty",
				"html:target/reports/cucumber.html",
				"json:target/reports/cucumber.jason"
		}
		)
		public class LoginRunner {		
			
			
			

		}
	
	
	
	
	
	

