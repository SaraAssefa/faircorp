
# faircorp Back End #

* An application which will able to manage smart building 

**By Sara Assefa ALEMAYEHU**

* Created 4 Related tables: Building, Room, Window, Heater
* Created 4 Data Transfer Objects(DTO): BuildingDto, RoomDto, WindowDto, HeaterDto
* Created 4 Data Access Objects (DAO): BuildingDao, RoomDao, HeaterDao, WindowDao
* Tests to test DAO and Endpoint functionality (41 tests in total)

** End points **

** Building controller 

| HTTP method | URL | Comment |

* GET  /api/building | returns a list of all buildings|
* POST  /api/building | creates a new building |
* GET  /api/building/{id} | returns a specific building by id|
* DELETE  /api/building/{id} | deletes a building by id|

** Room controller 

| HTTP method | URL | Comment |

* GET /api/rooms | returns a list of all rooms|
* POST /api/rooms | creates a new room |
* GET /api/rooms/{id} | returns a specific room by id|
* DELETE /api/rooms/{id} | deletes a room by id|
* PUT /api/rooms/{id}/switch-heater | change all heater status in room if ON to OFF or viceversa |
* PUT /api/rooms/{id}/switch-window | change all window status in room if OPEN to CLOSED or viceversa |

** Heater controller 

| HTTP method | URL | Comment |

* GET /api/heaters | returns a list of all heaters|
* POST /api/heaters | creates a new heater |
* GET /api/heaters/{id} | returns a specific heater by id|
* DELETE /api/heaters/{id} | deletes a heater by id|
* PUT /api/heaters/{id}/switch | change heater status if ON to OFF or viceversa |

** Window controller 

| HTTP method | URL | Comment |

* GET /api/windows | returns list of all windows|
* POST /api/windows | creates a new window |
* GET /api/windows/{id} | returns a specific window by id|
* DELETE /api/windows/{id} | deletes a window by id|
* PUT /api/windows/{id}/switch | change window's status if OPEN to CLOSED or viceversa|

** Security controller 

| HTTP method | URL | Comment |

* GET /api/users | returns list of all users |but user should have admin role to do this |

** User Credentials **

** Two different types of users **
** USER
  * username: user
  * password: userPasswordS
** ADMIN 
  * username: admin
  * password: adminPasswordS
  
 Final application is hosted at: https://faircorp-sara-alemayehu.cleverapps.io/login
 To test end points: https://faircorp-sara-alemayehu.cleverapps.io/swagger-ui/index.html