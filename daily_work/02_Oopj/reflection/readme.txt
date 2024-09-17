REFLECTION API
___________________
 - java.lang.reflect 
 - Use to get information of any Type (class) at runtime.
 - For every class there is "Class" class created which contains 
   corresponding class's metadata
 - 




demos -
 1.  Class<?> getClass();
 2.  Class<?> java.lang.Class.forName(String className)
                              throws ClassNotFoundException
     Returns the Class object associated with the class or interface with the given
     string name
 3.  Class.getPackage() : Package
     Gets the package of this class.
     If this class represents an array type, a primitive type or void,
     this method returns null.

     Class.getPackageName() : String
     Returns the fully qualified package name.
