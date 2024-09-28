Suppose there Vehicle class 

-OffRoadVehicle
-PassengerVehicle
-SportsVehicle

All these classes extends Vehicle class which has drive method but different Vehicles have different drive Method.
Now move towards Inheritance Concept where we use this to remove code reusability but lets consider offRoadVehicle ans Sports Vehicle wants same drive method and PassengerVehicle wants same drive method of Vehicle.So here 
we are reusing the code at second level which is not good practice.


// Strategy

Create DriveStrategy Interface
create two classes SportsDrive and NormalDrive
use this DriveStrategy in Vehicle
