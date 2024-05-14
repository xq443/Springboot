### Object Relation Mapper
- Create a student table
  - set up a student @Entity
  - each @Entity field maps to a table column @Column
  - the primary key column uniquely identifies each record inside the table
 
- Save data into the table
  - Spring JPA provides a CrudRepository
  - make a POST request with payload that consists of JSON
  - save the entity (Java object) from the CrudRepository
    
### Lombok
- The JPA specification requires that all persistent classes (@Entity) have a no-arg constructor.
- This constructor may be public or protected.
- Because the compiler automatically creates a default no-arg constructor when no other constructor is defined, only classes that define constructors must also include a no-arg constructor.
