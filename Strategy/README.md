a. Pattern Name and Classification<br/>
O Padrão Strategy, também chamado de Policy, é um padrão comportamental que delega responsabilidades, aumentado a coesão e aprimorando a<br/> comuncação entre os objetos. Permite também que o algoritmo varie independentemente dos clientes que o utilizam.<br/>
b. Intent<br/>
Definir novos algoritmos sem alterar as classes dos elementos sobre os quais opera. Definir e encapsular famílias de algoritmos e torná-<br/> las intercambiáveis.
c. Motivation<br/>
Facilitar a escolha dos algoritmos criados para uma determinada função.<br/>
d. Applicability<br/>
Quando um projeto tiver muitas classes que se relacionam e diferem no modo de atuação ou quando há necessidade de variar o algoritmo de acordo<br/> com as condições de chamada.
e. Structure<br/>
![Estrutura do Strategy](https://raw.githubusercontent.com/JSampietri/DesignPatterns/master/Strategy/estrutura.png)<br/>
f. Participants<br/>
Context: define  mantém a referência para uma classe Strategy específica;<br/>
Strategy: Interface(ou classe abstrata) comum a todos os algoritos suportados;<br/>
ConcreteStrategy: Um ou ais algoritmos fornecidos para a aplicação;<br/>
g. Sample Code<br/>
https://github.com/JSampietri/DesignPatterns/tree/master/Strategy/CodigoExemplo<br/>
