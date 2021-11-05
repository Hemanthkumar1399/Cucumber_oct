Feature: Hotel Booking In Adactin Application
Scenario: Login Page
Given user Launch The Application 
When user Enter The Username In Username Filed 
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigate To Search Hotel Page 

Scenario: Search Hotel Page
When user Select Loaction 
And user Select Hotels In Hotels Field
And user Select The Room Type In Room Type Field 
And user Select The Number Of Rooms In Number Of Rooms Field 
And user Select The Checkin Data In Checkin Date Field
And user Select The Check out Data In Check Out Field 
And user Select The Adults Per Room In Adults Per Room Field 
And user Select The Child Per Room In Child Per Room Field 
Then user Click The Search Button And It Navigate To Select Hotel 

Scenario: Select Hotel Page 
When user Click The Select Hotel In Select Hotel Field 
Then user Click The Continue Button And It Navigate To Book A Page 

Scenario: Book A Hotel Page 
When user Enter The First Name In First Name Field
And user Enter The Last name In Last Name Field
And user Enter The Address In Address Field 
And user Enter The Credit Card No In Credit Card No Field 
And user Select The Credit Card Type In Credit Card Type Field
And user Select The Expiry Month In Expiry Month Field
And user Select The Expiry Year In Expiry Year Field 
And user Select The CVV No In CVV Field  
Then user Click The Book Now Button And Navigate To Booking Confirmation Page

Scenario: Booking Confirmation Page
Then User Click The My Itinerary Button And Navigate To My Itinerary Page

Scenario: In My Itinerary Page
Then user Click The Logout Button And It Navigate To Home Page
 