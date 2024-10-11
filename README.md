# TestSpring project  
### Commands POST
All tasks - ```GET http://localhost:8080/tasks```   

New task:
```
POST /tasks
Content-Type: application/json
```
```json
{
    "description": "Buy milk"
}
```
Delete task - ```DELETE http://localhost:8080/tasks/1```     