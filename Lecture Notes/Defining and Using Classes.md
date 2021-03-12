### 1. usage of *static* in Java

#### static variable

* staic variable refers to the common propety of all the objects of a class.
* staic variable only gets allocated a memory space once in the class area. 
* Therefore, if in any instance object of the class, a specific propety variable is the same, we can make it *staic* so that we can save n-1 memory space. (n is the number of instance objects) 

#### static method
* can have the access to static variable/method and change the value of it. cannot call non-static variable or method.
* belongs to the class not a specific instance, no need to create an instance of the class. Can use the Class.*static method* to use it. 
* this and super cannot be used in the static context.

#### addition:

* why the *main* method has to be static?
because in this way, there is no need to create an extra instance for the outermost layer class  before calling the main method, which can save the memory space.

* why the static method can only have access to static variable not instance variable/method?
because the static method belongs to the class not a specific object, while the instance variable/method can be changed in any single object. Therefore, if using instance variable/method in the static method, the static method cannot be invariant in every object, whih means it does not only belong to the class. 
Also, the static method must be implemented, not an abstract method. Because it cannot be changed in any instance beject.
