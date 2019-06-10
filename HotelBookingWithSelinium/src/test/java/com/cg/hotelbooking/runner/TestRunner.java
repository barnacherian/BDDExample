package com.cg.hotelbooking.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Features"},
                  glue= {"com.cg.hotelbooking.stepdef"},
                  plugin= {"pretty"})
public class TestRunner {

}
