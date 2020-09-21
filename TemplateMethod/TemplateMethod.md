a. Pattern Name and Classification
Template Method, um pattern comportamental.
b. Intent
Utilizado para garantir que um subclasses façam alterações num determinado algoritimo definido na classe pai sem alterar sua estrutura.
c. Motivation
Permitir a divisão em etapas customisáveis que mantém o mesmo padrão estrutural.
d. Applicability
Aplicavel a estruturas hierárquicas que possuem algoritmos que podem ser dividos em etapas
e. Structure
A classe pai possui um método template, que utiliza outros métodos, podendo esses ser abstratos.
f. Participants
Uma classe pai com o método template e classes filhas com as implementações/alterações necessárias nos demais métodos.
g. Sample Code
Um player de video com decoders para mp4 e mkv: 