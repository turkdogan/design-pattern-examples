Factory pattern is one of the most used design pattern. It is a creational pattern and frequently is used to decouple the creation of an object from business implementation of the system. 

In this specific example, there are 4 different models/types of notebook in the "factory". The client requires a notebook but he or she does not care how each laptop is "produced". A proper laptop object is created according requirements of the client (is the client hipster and/or nerd). Thus the creation of the object is "abtracted" from the usage of it.

Abstraction of creation of an object can be very helpful due to creation logic can be updated/modified without interfering the remaining parts of the system.

