# Movie Ticket Booking

## Tech Stack
    • Langaugae - Java 19
    • Frameworks- Spring boot
    • Database - Postgresql
    • Integration technologies - Spring data JPA, Lombok
    • Cloud technologies - NA
    • Preferred editor to build and present solution : Intellij


### API Contract:
###### Base URL : https://xyz.com/api/v1

#### Read Scenario:

Browse theatres currently running the show (movie selected) in the town, including show timing by a chosen date

| Method   | URL                                                                                                                          |
|----------|------------------------------------------------------------------------------------------------------------------------------|
| GET      | /api/v1/theatre/{movie_name}/{city}                                                                                          |
| Response | [{"theatre_name":"PVR cinepolis", "showDateTime":1677078000000 },{"theatre_name":"INOX R21", "showDateTime":1677088800000 }] |
| Code     | 200                                                                                                                          |


#### Write Scenario:

Book movie tickets by selecting a theatre, timing, and preferred seats for the day

| Method | URL              |
|--------|------------------|
| POST   | /api/v1/booking  |

    Request_body:
    
    "show_seat":{
                "seatNum" : "1,2"
                "show":{
                            "showDateTime":"1677078000000"
                            "movie" : 
                                {   
                                    "id": 1
                                    "title":"ABCD",
                                },
                            "theatre":
                                {
                                    "id": 101,
                                    "theatreName":"PVR Cinepolis",
                                    "location":{
                                                    "id": 1,
                                                    "street":"Rajpath club road",
                                                    "city":"Ahmedabad", 
                                                    "state":"Gujarat",
                                                    "country":"INDIA"
                                                }:
                                }
                        }
                }





