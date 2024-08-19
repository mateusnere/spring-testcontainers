<!--- # "Can be a image or a gift from the project pages" -->

# TestContainers + SpringBoot

Esse é um projeto feito para estudos onde o objetivo era aprender sobre TestContainers e fazer um exemplo prático para o uso do mesmo. Além disso também foi possível explorar o uso da imagem do PgAdmin para executar o Postgres no navegador, evitando que seja preciso baixar a ferramenta. Para esse projeto foi utilizado algumas tecnologias como:

1. **TestContainers**
2. **Docker**
3. **SpringBoot**
4. **SpringData**
5. **Postgres**

## Tech Stack

<!--- # "Verify icons availability here https://github.com/tandpfun/skill-icons" -->

[![My Skills](https://skillicons.dev/icons?i=java,spring,maven,docker,posgres)](https://skillicons.dev)

## Execução do projeto:

**Obs: Para verificar as funcionalidades abordadas no projeto é necessário ter o docker instalado.**

- Para verificar o TestContainers em funcionamento, basta fazer um clone do projeto e localizar o arquivo `SpringTestcontainersApplicationTests` e rodar o teste. Ao executar, é possível ver o container do postgres sendo criado e rodando para execução dos testes e ao fim ele sendo derrubado pois já cumpriu o seu papel.

- Para verificar o uso do PgAdmin no navegador, basta rodar o comando `docker-compose up` e após a criação dos containers, acessar o endereço `localhost:5050` (configurações de login e senha podem ser vistos no arquivo docker-compose.yaml).

## License

This software is available under the following licenses:

- [MIT](https://rem.mit-license.org)