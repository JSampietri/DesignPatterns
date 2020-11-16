a. Pattern Name and Classification<br/>
O padrão State é um padrão comportamental que permite que um objeto altere seu comportamento quando o seu estado interno muda.<br/>
b. Intent<br/>
Permitir ao objeto possuir diferentes estados a partir das suas informações contidas na instância e retornar comportamentos diferentes com<br/> base nesse estado.<br/>
c. Motivation<br/>
A necessidade de que uma classe tenha comportamentos específicos determinados por seu estado atual.<br/>
d. Applicability<br/>
Projetos em que se tem a necessidade de gerenciar comportamentos diferentes dependendo de um número de estados diferentes.<br/>
e. Structure<br/>
![Estrutura do State](https://github.com/JSampietri/DesignPatterns/tree/master/State/estrutura.png?raw=true)<br/>
f. Participants<br/>
Context: define a interface com o cliente e mantém a instância d eestado concreto o qual define o estado atual do objeto;<br/>
State: Interface que permite encapsular as responsabilidade associadas ao estado particular de contexto;<br/>
ConcreteState: Um ou mais estados concretos que implementam a interface estado.<br/>
g. Sample Code<br/>
https://github.com/JSampietri/DesignPatterns/tree/master/State/CodigoExemplo<br/>
