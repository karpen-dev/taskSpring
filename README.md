# TaskSpring project
![Static Badge](https://img.shields.io/badge/karpen-taskSpring-taskSpring)
![GitHub top language](https://img.shields.io/github/languages/top/karpen-dev/taskSpring)
### Web gui
http://localhost:8080/
### Requests
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
