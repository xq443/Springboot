## three-layer design

- Controller (Presentation)
  - manages the MODEL and presents the VIEW

- Service (Business)
  - contains business-related operations
  - middleman between CONTROLLER and REPOSITORY
 
- Repository (Data access)
  - makes CRUD operations on the datastore
