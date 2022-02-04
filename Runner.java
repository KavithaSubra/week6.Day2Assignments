package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features"
					,glue="steps"
					,monochrome = true
					,dryRun=false
					,snippets=SnippetType.CAMELCASE
					,publish=true
					,tags="@Functional"
					//,tags="@Smoke"//executing a particular tag
					//,tags="@Functional or @Smoke"//For executing multiple tags
					//,tags="@Functional and @Smoke"//For executing scenarios which belong to multiple tags
					//,tags="not @Regression"	//To eliminate a specific set of scenarios
					)


public class Runner extends BaseClass 
{	
		/*@DataProvider(parallel=true)
		public Object[][] scenarios()
		{
			return super.scenarios();
		}*/

}
