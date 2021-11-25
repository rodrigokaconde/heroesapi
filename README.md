# heroesapi
## API Gerenciador de Heróis

### Tecnologias utilizadas
- String Data
- Java
- DynamoDB
- Lombok

### Pré-Requisitos:

- Java 8
- Maven
- AWS Cli
- DynamoDB

### Executar DynamoDB:

Na pasta onde se encontra o JAR do DynamoDB: ``java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb``

### Criação das tabelas classe:
src/main/java/com/rfoliveira/heroesapi/config/HeroesTable.java

### Popular tabela:
src/main/java/com/rfoliveira/heroesapi/config/HeroesData.java

### Executar heroesapi:
src/main/java/com/rfoliveira/heroesapi/HeroesapiApplication.java 

### EndPoints
- Listar todos GET: http://localhost:8080/heroes
- Listar por ID GET: http://localhost:8080/heroes/id
- Deletar por ID DELETE: http://localhost:8080/heroes/id
- Cadastrar novo POST: http://localhost:8080/heroes


