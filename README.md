<div align="center" style="display: inline_block;">
    <a href="https://www.oracle.com/java/technologies/javase-documentation.html" title="Documentação Java SE" target="_blank" rel='noopener noreferrer'>
        <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="250" alt="Logo Java" />
    </a>
</div>

<div align="center" style="display: inline_block; padding-top: 40px;">
    <a href="https://developer.mozilla.org/pt-BR/docs/Web/HTML/Element" title="Documentação do HTML" target="_blank" rel='noopener noreferrer'>
        <img align="center" alt="HTML5" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/html5/html5-original-wordmark.svg" />
    </a>
    <a href="https://maven.apache.org/" title="site oficial do Apache Maven" target="_blank" rel='noopener noreferrer'>
        <img align="center" alt="Maven" title="Maven" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/maven/maven-original.svg" />
    </a>
    <a href="https://spring.io/" title="Site oficial do Spring" target="_blank" rel='noopener noreferrer'>
        <img align="center" alt="Spring" title="Spring" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" />
    </a>
</div><br />

<div align="center">
<h1>CATRACA TECH BACKEND</h1>
</div><br />

### O Catraca Tech Backend é um projeto Java Spring Boot que simula o backend de um sistema de controle de catraca para uma instituição de ensino. Ele fornece endpoints para saudações personalizadas, liberação de catraca com base no número de registro do aluno (RA) e tratamento de páginas não encontradas.

## Visão Geral

Este projeto contém um conjunto de endpoints RESTful para interagir com o sistema de controle de catraca. Ele inclui as seguintes funcionalidades:

- **Saudação Personalizada:** Endpoint para saudar uma pessoa específica ou "Mundo" se nenhum nome for fornecido.
- **Liberação de Catraca:** Endpoint para liberar a catraca com base no número de registro do aluno (RA).
- **Tratamento de Página Não Encontrada:** Endpoint para lidar com solicitações para URLs não mapeadas.

## Como Executar

### Pré-requisitos

Antes de executar o projeto, certifique-se de ter o seguinte instalado em sua máquina:

- **Java Development Kit (JDK):** O JDK é necessário para compilar e executar o projeto Java. Você pode baixá-lo e instalá-lo a partir do site oficial da Oracle ou usando um gerenciador de pacotes como o OpenJDK.

- **Maven:** O Maven é uma ferramenta de automação de compilação utilizada para gerenciar dependências e construir projetos Java. Você pode baixar e instalar o Maven a partir do site oficial do Apache Maven.

### Executando o Projeto

**1. Clone este repositório:**
```bash
git clone https://github.com/DeboraSou/catracatechbackend.git
```

**2. Navegue até o diretório do projeto:**
```bash
cd catracatechbackend
```

**3. Execute o projeto usando Maven:**
```bash
mvn spring-boot:run
```

## Endpoints

### Olá Mundo

- **URL:** /ola
- **Método:** GET
- **Parâmetros:**
  - **nome (opcional):** Nome da pessoa a ser saudada. Se não fornecido, o padrão é "Mundo".
- **Retorno:** Uma mensagem de saudação em HTML com o nome fornecido.

**Suadação sem o nome:**
```bash
GET http://localhost:8080/ola
```
![Endpoint](/src/public/ola.png)

**Suadação com o nome:**
```bash
GET http://localhost:8080/ola?nome=Cavil
```
![Endpoint](/src/public/ola-Cavil.png)

### Liberar Catraca

- **URL:** /liberarCatraca
- **Método:** GET
- **Parâmetros:**
    - **ra:** Número de registro do aluno.
- **Retorno:**
    - Se o RA corresponder a um dos valores pré-definidos (22135, 22145, 22155), retorna uma mensagem informando que a catraca foi liberada.
    - Se o RA não estiver na lista, retorna uma mensagem informando que o aluno não foi encontrado.
    - Se o RA for 0, retorna uma mensagem de acesso negado.

**Catraca liberada:**
```bash
GET http://localhost:8080/liberarCatraca?ra=22135
```
![Endpoint](/src/public/liberada.png)

**Aluno não encontrado:**
```bash
GET http://localhost:8080/liberarCatraca?ra=22165
```

![Endpoint](/src/public/nao-encontrado.png)

**Acesso negago:**
```bash
GET http://localhost:8080/liberarCatraca?ra=0
```
![Endpoint](/src/public/negado.png)

### Página Não Encontrada

- **URL:** /**
- **Método:** GET
- **Retorno:** Retorna uma mensagem de página não encontrada.

**Página não encontrada:**
```bash
GET http://localhost:8080/sistema
```
![Endpoint](/src/public/404.png)

## Notas

- Todos os retornos são em **HTML** para facilitar a visualização em um navegador.
- Os códigos de cores indicam o status da operação:
    - **Verde:** operação bem-sucedida.
    - **Azul:** aviso ou operação concluída com sucesso, mas com observações.
    - **Vermelho:** erro ou operação mal-sucedida.