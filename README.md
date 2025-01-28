<h1 align="center">
  Desafio Estágio Oak Tecnologia
<h1/>

### Tecnologias utilizadas:
- SpringBoot
- Java
- H2 Database

### Descrição do desafio
Requisito: 𝐂𝐚𝐝𝐚𝐬𝐭𝐫𝐨 𝐞 𝐥𝐢𝐬𝐭𝐚𝐠𝐞𝐦 𝐝𝐞 𝐩𝐫𝐨𝐝𝐮𝐭𝐨𝐬

𝐂𝐚𝐝𝐚𝐬𝐭𝐫𝐨:

- Formulário com os campos abaixo:

  - Nome do produto - campo de texto
  - Descrição do produto - campo de texto
  - Valor do produto - campo de valor
  - Disponível para venda - campo com 2 opções: sim / não

𝐋𝐢𝐬𝐭𝐚𝐠𝐞𝐦:

- Colunas da listagem: nome, valor
- Ordenação por valor do menor para o maior
- Quando cadastrar um novo produto é para abrir a listagem automaticamente
- Deve existir um botão para cadastrar um novo produto a partir da listagem

### Aparência
![desafio-oka-pic](https://github.com/user-attachments/assets/37d47214-fd1e-40c7-b90c-0c83db33b50c)

### Instalação

Ele serve como o componente de backend de uma aplicação, utilizando o Spring Boot para funcionalidades de web e gerenciamento de dados.

### Requisitos

- **Java 17** ou superior  
- **Maven 3.8.0** ou superior  

1. Clone o repositório:  
   ```bash
   git clone https://github.com/Lucasdota/desafio-estagio-oak-backend/new/master?filename=README.md
   cd desafio-estagio-oak-backend
   ```
2. Compile o projeto:
   ```bash
   mvn clean install
   ```
3. Inicie a aplicação
   ```bash
   mvn spring-boot:run
   ```
4. Acesse o servidor local
   - URL padrão: http://localhost:8080

**Importante**: Não esqueça de acessar o repositório do [frontend](https://github.com/Lucasdota/desafio-estagio-oak-frontend) e seguir suas instruções para rodar tanto o frontend como o backend ao mesmo tempo para testar a aplicação com sucesso!

### Banco de Dados
O projeto utiliza o banco de dados H2 para desenvolvimento e testes.

- Console do H2: http://localhost:8080/h2-console
- Configurações padrão estão no arquivo application.properties.
