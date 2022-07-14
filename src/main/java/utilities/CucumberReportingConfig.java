package utilities;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;
public class CucumberReportingConfig {

	public static void reportConfig() {

		File reportOutputDirectory = new File("target");

		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("target\\cucumber.json");//we can also change the whole name if we want to here.

		String buildNumber = "1";
		String projectName = "Tek School Retail Website - Tigers";//we can change the name of 
		//the project as per our need

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration - check javadoc for details
		configuration.addPresentationModes(PresentationMode.RUN_WITH_JENKINS);
		// do not make scenario failed when step has status SKIPPED
		configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
		configuration.setBuildNumber(buildNumber);
		// Additional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "chrome");//we are openeing browser as chrome
		configuration.addClassifications("Branch", "release/1.0");

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		@SuppressWarnings("unused")
		Reportable result = reportBuilder.generateReports();
	}
}
//so this class will basically help us to genrate test report along site with logs when we run our
//test cases, we don't know nor we have to learn what those lines are, because they are just bulid 
//to use.
