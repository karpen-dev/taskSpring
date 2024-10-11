# TestSpring project  
### Commands POST
All tasks - ```GET http://localhost:8080/tasks```   
New task:
```json
POST /tasks
Content-Type: application/json

username: karpen

{
    "description": "Buy milk"
}
```  
Register user:
```json
POST /users/register
Content-Type: application/json
        
{
    "username": "karpen",
    "password": "securePass123",
    "firstName": "karp",
    "lastName": "fish"
}

```
Delete task - ```DELETE http://localhost:8080/tasks/1```     