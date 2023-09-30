<h1 align="center">
<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlnB59Av89g54EcEUpCOYQCDrMQZyRMOReAZT2K4WxvMWtbDc2FIBXwOVeiDmejIvMjQ&usqp=CAU" width="50%">
  TODO List
</h1>

<div align="center"> 
  <a href="https://www.linkedin.com/in/ze-ricardo/">
     <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">
  </a>
    <a href="https://www.buymeacoffee.com/codeandmusic" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/default-orange.png" alt="Buy Me A Coffee" height="28" width="174"></a>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) desafio empresa Simplify.


## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Postman:

- Criar Tarefa 
```
$ http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Listar Tarefas
```
$ http GET :8080/todos

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Atualizar Tarefa
```
$ http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2

[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```

- Remover Tarefa
```
http DELETE :8080/todos/1

[ ]
```
