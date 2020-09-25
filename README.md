# TodoList
Simple todolist with React Spring-Boot and Docker

## Backend
Backend is created using Spring-Boot. Api routes are located at /api/todo. When user tries to send Http request to /api/todo, authentication will be prompted. Upon successful authentication, a token will be handed while the session is active. Only upon successful authentication can the client get a response.

## Frontend
Simple View of Todo List. User can add, delete or update todos.

## Docker
Plan is to dockerize frontend, backend and DB after the project is finished. The containers will then be deployed on heroku.
