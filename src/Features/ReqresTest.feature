Feature: Get List of users from Reqres webservice
Scenario: User requests for the list of users
 Given List of Users exist in Page 2
 When a user retrieves the Users list of Page 2
 Then the status code is 200
 And response includes the following
	| users				| 6	|
	| page				| 2	|	
	| per_page		| 6	|	
	| total				|12	|	
	| total_pages	| 2	| 
And response includes the following list of users in any order
|id| email | first_name|last_name|avatar|
| 7  |"michael.lawson@reqres.in"  | "Michael"|"Lawson"  |"https://reqres.in/img/faces/7-image.jpg" |
| 8  |"lindsay.ferguson@reqres.in"| "Lindsay"|"Ferguson"|"https://reqres.in/img/faces/8-image.jpg" |
| 9  |"tobias.funke@reqres.in"    | "Tobias" |"Funke"   |"https://reqres.in/img/faces/9-image.jpg" |
| 10 |"byron.fields@reqres.in"    | "Byron"  |"Fields"  |"https://reqres.in/img/faces/10-image.jpg"|
| 11 |"george.edwards@reqres.in"  | "George" |"Edwards" |"https://reqres.in/img/faces/11-image.jpg"|
| 12 |"rachel.howell@reqres.in"   | "Rachel" |"Howell"  |"https://reqres.in/img/faces/12-image.jpg"|