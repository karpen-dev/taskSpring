# TestSpring project  
### Commands POST
All tasks - ```GET http://localhost:8080/tasks```   
New task:
```
POST /tasks
Content-Type: application/json
username: karpen
```
```json
{
    "description": "Buy milk"
}
```  
Register user:
```
POST /users/register
Content-Type: application/json
```
```json
{
    "username": "karpen",
    "password": "securePass123",
    "firstName": "karp",
    "lastName": "fish"
}

```
Delete task - ```DELETE http://localhost:8080/tasks/1```     