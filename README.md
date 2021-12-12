# timestamp-microservice
Freecodecamp microservice using java springboot
Clone the repo and run offline

http://localhost:8080/api/timestamps //returns the current date




http://localhost:8080/api/timestamps/2021-08-10 //returns {
  "unix": 1627776000000,
  "utc": "Sun, 01 Aug 2021 00:00:00 GMT"
}

http://localhost:8080/api/timestamps/1627776000000 //returns 
/returns {
  "unix": 1627776000000,
  "utc": "Sun, 01 Aug 2021 00:00:00 GMT"
}
http://localhost:8080/api/timestamps/2021-08-100
/returns {
  "status": 500,
  "message": "Internal Server error"
}
