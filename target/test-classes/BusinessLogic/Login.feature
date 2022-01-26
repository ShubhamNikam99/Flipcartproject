Feature: Login Functionality

Background: User is successfully logged in
Given User open "Chrome" browser with exe "D:\\Automation Support\\eclipse\\chromedriver.exe"
Given User open url as "https://www.flipkart.com/"




Scenario: Login functionality with valid credentials
When user add synchronization  
When user click on cancel button
When user move on login dropdown
When user click on my profile
When user enter "9359363302" as username
When user enter "999999999" as password
Then user click on login button
Then application shows user profile to user  


                  