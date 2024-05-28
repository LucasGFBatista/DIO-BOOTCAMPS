<div align="center">
  <h1>- Desafio: POO -</h1>
</div>

Este repositório, concebido com propósitos didáticos, representa um desafio de modelagem e diagramação, utilizando UML, para um componente iPhone, abrangendo suas funcionalidades como reprodutor musical, aparelho telefônico e navegador na internet, criado em colaboração entre a [Digital Innovation One](https://www.dio.me/) e o Santander, como parte do Bootcamp Santander 2024 - Backend com Java.

## Objetivo

Aprender e aplicar os fundamentos de Programação Orientada a Objetos (POO) e Linguagem de Modelagem Unificada (UML), os quais incluem:

- Conceito de POO;
- Classes e pacotes;
- Visibilidade dos recursos;
- PIlares do POO;
- Interface.

## Ferramentas e tecnologias

![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)
![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)
![Java](https://img.shields.io/badge/Java-000?style=for-the-badge&logo=openjdk&logoColor=ED8B00)
![VSCode](https://img.shields.io/badge/vscode-000?style=for-the-badge&logo=visualstudiocode&logoColor=blue)

## Diagrama UML

O diagrama UML foi criado utilizando o [drawio](https://draw.io//), uma ferramenta de desenho grafico multiplataforma.

![](UML_Desafio_Iphone.drawio)

## Descrição das Interfaces e Classes

### Interfaces

#### AparelhoTelefonico

Interface responsavel por implementar as funcionalidades de um aparelho telefonico.

- **Métodos**
  - **protected**
    - redeMovelDisponivel(): boolean
  - **public**
    - ligar() - Utilizei Overload, pois há duas possibilidades de realizar ligação
      - ligar(numero:  String): void
      - ligar(numeroContato: Contato): void
    - atender(): void
    - vivaVoz(): void
    - iniciarCorreioVoz(): void
    - silenciar(): void

#### ReprodutorMusical

Interface responsavel por implementar as funcionalidades de um reprodutor demúsica.

- **Atributos**
  - **protected**
    - volume: int

- **Métodos**
  - **public**
    - tocar(): void
    - pausar(): void
    - selecionarMusica(musica: Musisca): void
    - aumetarVolume(): void
    - diminuirVolume(): void

#### NavegadorInternet

Interface responsavel por implementar as funcionalidades de um navegador de internet.

- **Métodos**
  - **protected**
    - conexaoComInternet(): boolean
  - **public**
    - exibirPagina(): void
    - adicionarNovaAba(): void
    - fecharAbaNavegador(): void
    - atualizarPagina(): void
    - fecharPagina(): void

### Classes

#### Iphone

Esta classe implementa as classes anteriores, como solicitada no desafio. Ou seja, a classe irá constar os atributos (caso tenha) e os métodos das interfaces que são implementadas.

- **Atributo**
  - **private**
    - volume: int

- **Métodos**
  - **private**
    - redeMovelDisponivel(): boolean
    - conexaoComInternet(): boolean
  - **public**
    - ligar(numero:  String): void
    - ligar(numeroContato: Contato): void
    - atender(): void
    - vivaVoz(): void
    - iniciarCorreioVoz(): void
    - silenciar(): void
    - tocar(): void
    - pausar(): void
    - selecionarMusica(musica: Musisca): void
    - aumetarVolume(): void
    - diminuirVolume(): void
    - exibirPagina(): void
    - adicionarNovaAba(): void
    - fecharAbaNavegador(): void
    - atualizarPagina(): void
    - fecharPagina(): void

#### Contato

- **Atributo**
  - **private**
    - nome: String
    - numero: String

- **Método**
  - **public**
    - getNome(): String
    - setNome(novoNome: String): void
    - getNumero(): String
    - setNumero(novoNumero: String): void

#### Musica

- **Atributo**
  - **private**
    - nomeMusica: String
    - nomeBanda: String

- **Método**
  - **public**
    - getNomeMusica(): String
    - setNomeMusica(novoNomeMusica: String): void
    - getNomeBanda(): String
    - setNomeBanda(novoNomeBanda: String): void

## Funcionamento

Os dados são solicitados e inseridos através do terminal, onde o usuário receberá um menu indicando as opções a serem escolhidas e seus repectivos números. Por exemplo:

- Programa:  
---- Escolha o aplicativo ----  

1. Reprodutor musical  
2. Aparelho telefônico  
3. Navegador de internet  
4. Encerrar aparelho

- Usuário: 1 *(depois ENTER para o próximo passo)*

</br>
