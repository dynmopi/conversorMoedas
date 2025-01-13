# Projeto Conversor de Moedas

Esta é a página inicial do projeto Conversor de Moedas proposto pelo program ONE Education da Turma 7 e Alura.

## O que é?

- É uma ferramenta de câmbio que verifica o valor equivalente de uma dada moeda em relação a outra.

## Como funciona?

Nesse projeto proposto pela ONE e Alura, nós utilizamos uma API que nos retorna um JSON - JavaScript Object Notation - para consultar os tokens das moedas fiduciárias. O objetivo da criaçao é aprender a consumir uma API e manipular os dados, criando uma aplicação como essa.

Utilizei o framework do Spring para facilitar tanto as requisições, como também escalar o projeto para talvez migrar em uma página Web.

Como que o projeto é executado em linhas de terminal, irei trazer duas soluções para a execução do projeto. Sendo uma a mais recomendada.

### 1. Através da compilação do Maven (Recomendado)

Você deve ter o maven instalado para conseguir executar nessa metodologia através do site https://maven.apache.org/ , e o projeto em seu dispositivo, executando na raíz do diretório.

Para quem não sabe do que se trata do Maven, em poucas palavras, é um gerenciador de dependencias que faz o projeto Spring funcionar.

Siga os passos para conseguir executar o projeto.
 
1. Baixe esse repositório em sua máquina;
2. Extraia os arquivos baixados;
3. Abra o terminal de seu sistema operacional;
4. Vá até a raíz do diretório contendo o arquivo pom (pom.xml);
5. Execute com o seguinte comando:
```mvn spring-boot:run```

Pronto, agora espere a execução do Spring, e use a aplicação.

![image](https://github.com/user-attachments/assets/53a1754f-7b08-4f24-86e3-916af480bdfc)


### 2. Através do Terminal do Intellij

O projeto foi feito por essa IDE, portanto, será muito mais fácil a execução dela. Deixo claro que od métodos executados pelo terminal dos sistemas operacionais não funcionarão - isso não impacta no projeto.

Siga os passos para conseguir a execução:

1. Baixe e Extraia o repositório do projeto;
2. Instale a IDE Intellij no site: https://www.jetbrains.com/idea/ 
3. Abra o projeto pela a IDE
4. Vá até o diretório:

```conversormoeda/src/main/java/br/com/conversordemoeda/conversormoeda/ConversorMoedaApplication.java```

5. Execute o arquivo .java e espere abrir aplicação.


---

No mais, espero que esse projeto tenha sido proveitoso para você.

Programa Oracle ONE e Alura


[![MIT Licence](https://badges.frapsoft.com/os/mit/mit.png?v=103)](https://opensource.org/licenses/mit-license.php)

Made by Danrley
