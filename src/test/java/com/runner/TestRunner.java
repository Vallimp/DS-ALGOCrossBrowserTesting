package com.runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.utils.ConfigReader;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features"
,glue ={"com.StepDefinations","com.utils.Helper", "appHooks"}
,monochrome=true,dryRun = false,  
tags = "@startPage",
plugin= {"pretty","html:target/cucumber.html"
		,"html:target/HtmlReports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
})
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
	@BeforeTest
    @Parameters({"browser"})
    public void defineBrowser(String browser) throws Throwable {
		ConfigReader.loadConfig();
		ConfigReader.setBrowserType(browser);
		System.out.println(" in runner " + browser);
	}
}