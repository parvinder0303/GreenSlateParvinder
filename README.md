# Automated Test Scenarios of Open Cart

Created all test classes name with the testScenario so that it will be easy to look for each scenario

First scenario, made two test cases.

In first test case (newUserRegistration) used randomString generator function so that each time new email is generated automatically.
      In other case(existingUserRegistration) used one already existing email (abc@gmail.com).
      

In Second Scenario, only 1 test case (SearchOrderProduct()) is made in which used resource Bundle to get the dynamic data from properties file. 
      So that when we change value in properties file data can be changed and each time by making change in just properties file
      In this try and catch is also used in case the product is not present it will run catch block and print element is not present.


In third scenario, we have 3 test cases in all we are using 3 different currencies and checking product price are in same curriences or not.

First Test Case (DefaultCurrencyDisplayed) US Dollar is already displayed so it will check that price are displayed in US Dollar.
Second Test Case (EuroCurrencyDisplayed) Euro is selected, so it will check that price are displayed in Euro.
Third Test Case (PoundCurrencyDisplayed) Pound is selected, so it will check that price are displayed in US Dollar.


#### Each scenario can be run individually or combined in MasterSuite.xml file
