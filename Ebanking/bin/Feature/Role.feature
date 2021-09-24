Feature: Role Creation

Scenario Outline: Verify Role Creation with Multiple sets of Data

Given Tester should on Ranford Home Page

When Tester Enters Username and Password

When Tester click on Role button

Then Tester click New Role and enters "<RoleName>" and "<RoleType>"

Then Tester close the Application 

Examples:

        | RoleName | RoleType |
        | Clerkdfb | E |
        | Tellerdfb | E |  
        | Managerdfb | E |      