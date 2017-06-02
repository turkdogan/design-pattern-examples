Singleton is probably the most used design pattern in programming. When a single instance of an object is required in a system, a singleton pattern can be used. 

In this specific example, a database manager instance is created in the system. We do not need a second manager object; single instance is enough.

PS: This example is written to give an idea about singleton design pattern. It may not work in a real world, multithreaded environments.

```
               +---------------------+
               |                     |
               |                     |
+--------------v-------------+       |
|   Singleton                |       |
+----------------------------+       |
|  -instance:Singleton       |       |
|----------------------------+       |
|  -Singleton()              +-------+
|  +getInstance():Singleton  |
|                            |
+----------------------------+
```
