# spring-boot
  springboot-demo - Created a demo of RESTfull APIs of resource elearning without DB.
    
    Get Request
        http://localhost:8080/elearnings
        http://localhost:8080/elearnings/345
    Post
        http://localhost:8080/elearnings (create new)
        Headers : Content-Type:application/json
        Body:Raw: - {"id":321,"name":"JavaScript321","description":"JavaScript Basic321"}
    Put
        http://localhost:8080/elearnings/345 (update existing one)
        Headers : Content-Type:application/json
        Body:Raw: - {"id":321,"name":"JavaScript321","description":"JavaScript Basic321"}
    Delete
        http://localhost:8080/elearnings/345 (Delete)
        

# springboot-demo with DB connection
  spring-boot/springboot-demo/src/main/java/com/simplilearn/pjspringboot/demo/dbconnection/
  
  Application.propertis
  
    spring.jpa.hibernate.ddl-auto=update (For 1st time keep the value as "create", once table created then change to "update" )
        
  Sample APIs URL
        
        http://localhost:8080/dbdemo/all
        http://localhost:8080/dbdemo/findById?id=3
        http://localhost:8080/dbdemo/add?name=PMP&description=PMP%20basic (for demo purpose, both GET & POST will support)
