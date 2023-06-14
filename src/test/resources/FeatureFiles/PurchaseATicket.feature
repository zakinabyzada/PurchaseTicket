Feature: Ticket Purchase and Message Verification
	
	Scenario Outline: Verify user purchase and ticket successfully 
		
			Given User inputs Navigates to "https://blazedemo.com/purchase.php"
			When User inputes FirstName and lastName "<FirstName>" 
			And User inputs Address "<address>"
			And User inputs City "<City>"
			And User inputs State "<State>"
			And User inputs ZipCode "<ZipCode>"
			And User Selects Card Type "<CardType>"
			And User inputs Credit Card Number "<Credit Card Number>"
			And User inputs Month "<Month>"
			And User inputs year "<year>"
			And User inputs Name on Card "<Name on card>"
			And User Clicks the Remeber Me button 
			And User Clicks the Purchase Flight button 
			Then System outputs message "<Message>"
			
			Examples:
				|FirstName | address | City  	 | State      | ZipCode | CardType         | Credit Card Number  | Month | year | Name on card | Message
				| Ahmd 		 | 3241		 |phoenix  | arizona    | 23941   | Visa             | 329842019312 			 | 10 	 | 2028 | AhmadZaki		 | Thank you for your purchase today!
				| gary 		 | 1341 qw |Aushburn | california | 23223   | American Express | 3423243324144 			 | 12 	 | 2058 | gary	       | Thank you for your purchase today!	
				| hamza 	 | 123 stre|tempe    | virigina   | 42445   | Diner's Club     | 34444444431			   | 11 	 | 2038 | hamza		     | Thank you for your purchase today!
				| mahmood  | 31 blvrd|cactus   | wioming    | 52255   | Diner's Club     | 315511513535		 	   | 13 	 | 2048 | mahmood		   | Thank you for your purchase today!