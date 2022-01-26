Feature: Manage address functionality

Background: User is successfully logged in
Given User open "Chrome" browser with exe "D:\\Automation Support\\eclipse\\chromedriver.exe"
Given User open url as "https://www.flipkart.com/"
When user add synchronization  
When user click on cancel button
When user move on login dropdown
When user click on my profile
When user enter "9359363302" as username
When user enter "999999999" as password
Then user click on login button
  


                 

           
@SmokeTest
Scenario: Manage address functionality with valid data
When user click on manage address  
When user click on add adress
When user add name as "Shubham"
When user add number as "9359363302"
When user add pincode as "414601"
When user add localityr as "Pimpalgaon Malvi"
When user add adress as "Pimpalgaon Malvi Ahmednagar"
When user select address type as Home
When user click on save
Then validate if address is added successfully              