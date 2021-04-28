# ninja-accountant
Application to manage your personal (or family) financial affairs.

Technical requirements:
	Techonologies:
    	DI container            - Spring-Boot Framework
    	ORM                     - Hibernate
    	Database migration tool - Liquibase
    	Logging                 - any
    	Webservices             - REST
		architecture			- MVC, Thin client
Functional requirements:
	1 - System should provide ability to create/update/delete an user account.
		User should be identified by login and password and has a possibility to set a photo as avatar of profile.
	2 - User account shoud contain a bunch of 'wallets' which can be createdm renamed and deleted by owner (user)
	3 - Wallet should contain current balance in selected currency. User should be able to create records with his expenditures and incomes.
		3.1 - Wallet should also have next features:
			3.1.1 - Calculate expenditures for selected period of time
			3.1.2 - Have a possibility to be a deposite wallet with deposite rate and be able to calculate expected income for selected period of time
			3.1.3 - Generate report with all incomes and expenditures for selected period of time. Period should be adjustable but have some of predefined values like: 'last 						week', 'last month', '1st, 2nd, 3rd or 4th tax quarter of currect year' etc. Wallet should have a possibility to save report into different type of files like: 
					.txt, .xml (.html)
    
