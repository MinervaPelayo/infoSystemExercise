# infoSystemExercise
I used the Finnish Population Information System as a reference to create four different classes. The system registers information
about people, residence, buildings, and real estate. 

The main idea is that there is a Person class where the basic information of people will be managed. In this class, I included a 
Residence object from the Residence class. Meaning that this object will provide more details about the place where that specific 
person is living at. 

The Building class provides basic information about buildings. For this class, I am considering that the owner is also registerd in the
System, that is why I decided to include the Person object as a way to get more details about the owner of the building. I also 
included a Real Estate object from RealEstate class, considering that the building is also part of a Real Estate. 

The RealEstate class provides more information about Real Estate such as who owns it and how many buildings are located in there. 

I added a couple of JUnit tests to check that objects where being created correctly and correct information was being saved. 
