# Bike-Inventory
API for managing inventory for bikes with full CRUD(create, read, update, delete) operations.

This project has a three layer design with repository, service and web/controller layers along with a pojo(plain old java object) class and an exception class. I used Postman to test the functionality of the API.

I created one pojo class Bike, which includes five private fields and a public custructor taking in no parameters that assigns a randomly generated unique id. I also have public getters and setters for each of the fields.

In the repository layer I added the @Repository annotation, indicating that this is where the data is being stored and I am using an ArrayList to store the bike objects.
I've also created several methods enabling CRUD operations to be done on the ArrayList.

In the service layer I have created a BikeService interface with several abstract methods and a BikeServiceImpl class which implements the BikeService interface. In the BikeServiceImpl class I am using the @Service annotation, indicating the business logic of the API resides here, and I am using the @Autowired annoation to inject the BikeRepository bean into the BikeServiceImpl class to have access to the ArrayList of bike objects. I'm also implementing all the abstract classes from the BikeService interface. 

In the web/controller layer I'm injecting the BikeService bean via the @Autowired annotation and using the @RestController annotation which combines the @Controller and @ResponseBody annotations, indicating the class serves as a controller and that the object returned is automatically serialized into JSON and passed back into the HttpResponse object. In the controller file I have mapping annotations as well as the appropriate handler methods to handle HTTP requests(GET, POST, PUT, DELETE).

In the exception folder I created a BikeNotFoundException class which extends the Exception class and has a public constructor that calls the constructor of the parent class Exception via the super keyword which takes in a String parameter. This exception is thrown when a bike with a certain id is not present in the ArrayList.
