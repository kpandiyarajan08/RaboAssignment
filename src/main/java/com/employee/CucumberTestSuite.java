package com.employee;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(strict=false, tags= {"@CreateEmployee-WithValidData"}, features="/resources/features/",plugin = {"pretty", "json:target/cucumber-json-report.json","html:target/cucumber-html-report"})
public class CucumberTestSuite {
}