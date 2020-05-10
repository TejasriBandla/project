package com.capgemini.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "E:\\parallel project\\usingExcel\\Features\\Orderingproduct.feature", glue = {
		"com.capgemini.stepdefs" },plugin= {"html:target/cucumber-html-report", "json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json", "junit:target/cucumber2-results.xml"})
public class Run2 extends AbstractTestNGCucumberTests {

}
