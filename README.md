Create following endpoints:
1.Method: POST 
  Url: /customer 
  Request Body: Customer
  Result: controller   ->    service => service -> controller ('POST successful')

  
2. Method: GET
   Url: /customer/{customerId}
   Result: controller   ->    service => service -> controller ('Get successful')
   
#steps:
1. run the applicatoin 
2. http://localhost:8080/h2-console/login.do?jsessionid=9bcefbac740537b347447b6e3b8a2827
3. Run below query: 
CREATE TABLE TBL_EMPLOYEES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);


INSERT INTO TBL_EMPLOYEES (first_name, last_name, email) VALUES
  ('Lokesh', 'Gupta', 'abc@gmail.com'),
  ('Deja', 'Vu', 'xyz@email.com'),
  ('Caption', 'America', 'cap@marvel.com');


   
   
