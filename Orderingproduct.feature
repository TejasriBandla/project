Feature: Ordering product 
Scenario:
To validate whether user is able to place the order using paytm account 
	Given open browser 
	And enter Url 
	Then enter username and password 
	Then click on login 
	Then Select item and filters 
	Then click on add to bag 
	Then click on bag icon 
	Then click on place order 
	Then click on continue 
	Then  choose payment method as paypal/paytm/wallets 
	Then click on paytm 
	Then click on pay now button