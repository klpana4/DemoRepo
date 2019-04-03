Feature: Create lead for leaftaps

#Background:
#Given open the chrome browser

#And maximise the browser
#And set timeouts
#And Hit the url

@Positive @Negative
Scenario Outline: Postive CreateLead scenario
And enter the usename as <Uname>
And enter the password as <Upass>
And click on login 
And click on crmsfa
And click on leads
And click on Createleads
And enter companyname as <Cname>
And enter firstname as <Fname>
And enter lastname as <Lname>
When click Createlead
Then verify lead is created successfully

Examples:
|Uname|Upass|Cname|Fname|Lname|
|DemoSalesManager|crmsfa|cts|kalpana|Kuntal|











 


