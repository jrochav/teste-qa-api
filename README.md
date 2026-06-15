# Teste QA - Dog API

## Descrição

Este projeto contém a automação de testes da Dog API, desenvolvida como parte de um teste técnico para a vaga de QA.

O objetivo da automação é validar os principais endpoints da API, garantindo que as respostas retornadas estejam corretas, que os dados possuam a estrutura esperada e que o comportamento da aplicação esteja de acordo com os cenários definidos.

A automação foi implementada utilizando:

* Java 21
* Maven
* JUnit 5
* Rest Assured

## Cenários Automatizados

Com base nos requisitos propostos, foram automatizados os seguintes cenários:

### 1. Listagem de raças (`BreedsTest.java`)

Valida que o endpoint de listagem de raças retorna sucesso, status HTTP 200 e informações de raças disponíveis.

**Endpoint:**

```http
GET /breeds/list/all
```

### 2. Consulta de imagens por raça (`BreedImagesTest.java`)

Valida que uma raça válida retorna uma lista de imagens associadas.

**Endpoint:**

```http
GET /breed/{breed}/images
```

### 3. Consulta de imagem aleatória (`RandomImageTest.java`)

Valida que a API retorna uma imagem aleatória de cachorro com sucesso.

**Endpoint:**

```http
GET /breeds/image/random
```

### 4. Consulta de raça inexistente (`InvalidBreedTest.java`)

Valida o comportamento da API ao receber uma raça inválida, garantindo o retorno adequado para cenários negativos.

**Endpoint:**

```http
GET /breed/{breed}/images
```

## Estrutura do Projeto

```text
src
└── test
    └── java
        ├── base
        │   └── BaseTest.java
        │
        └── tests
            ├── BreedsTest.java
            ├── BreedImagesTest.java
            ├── RandomImageTest.java
            └── InvalidBreedTest.java

pom.xml
README.md
```

## Pré-requisitos

* Java 21 ou superior
* Apache Maven 3.9+

## Instalação

Clone o repositório:

```bash
git clone <url-do-repositorio>
```

Acesse a pasta do projeto:

```bash
cd dog-api-tests
```

Instale as dependências do projeto:

```bash
mvn clean install
```

## Execução dos Testes

Executar todos os testes:

```bash
mvn test
```

Executar limpeza e testes:

```bash
mvn clean test
```

## Logs e Tratamento de Falhas

O projeto foi configurado para exibir automaticamente os detalhes da requisição e da resposta sempre que uma validação falhar, facilitando a identificação da causa raiz de problemas durante a execução dos testes.

## Considerações

Os cenários foram selecionados para cobrir os principais fluxos da API, incluindo validações positivas e negativas. A estrutura foi organizada de forma simples e escalável, seguindo boas práticas de automação de testes com Java e Rest Assured, visando legibilidade, manutenção e facilidade de expansão futura.
