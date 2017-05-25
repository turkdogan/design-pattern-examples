Builder pattern is a creational pattern which is used to "build" complex object by creating each part of the complex object using a building method.

In this specific example, a soup is built by using a Soup Builder object. At each step, a specific ingredient of soup is added to the system (salt, water etc.). Then after all the proper ingredients added, cook (build) is called. Traditionally "build" method name is used to create object.

Builder pattern seems to be alternative to a complex having parameters. But there is an important distinction between builder pattern and constructor building: In the builder pattern, building parts are optional. For example we may not add "salt" to build soup. This can be performed by using multiple constructors: a constructor having parameter with salt and a constructor without salt parameter.

Readibility is another advantage of builder pattern. Following the parameter <--> part from constructor is not feasable as in building process of the builder pattern.
