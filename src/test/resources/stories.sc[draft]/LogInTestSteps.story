Narrative:
As a User of Skins.Cash
I want to Login
So that i can trade

Scenario: Login in Scins.Cash
Given: As a USER I want to login in Skins.Cash
When: The USER Click <button>
And: Skins.Cash redirects user to Steam Login Page
And: User entered valid <login> and <password>
And: Successfully authenticated
Then: User redirected to main page of Skins.cash

Examples:
|name|
|"STEAM LOGIN"|
|"GET CASH NOW"|
Examples:
|login|password|
|clatchorkick|OJKdQMNbyMXcM42w|
|shumisteam001|8GLtSBfhYzICQENO|
|johnsteam001|XaMq6tiD313qp33w|
|elfriedehubki6|AVZl8nSIyB5a|