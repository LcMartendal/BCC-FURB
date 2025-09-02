## TEMA: Diagrama UML - diagrama de componentes e diagrama de implantação
METODOLOGIA: Aprendizagem Baseada em Projetos
ENTREGA E APRESENTAÇÃO: 14/08/2025
OBJETIVOS E HABILIDADES ENVOLVIDAS:

• Descrever necessidades e requisitos de um software.
• Entender todas as áreas envolvidas na implantação de um software.
• Entender os componentes que envolvem um software.

## DIAGRAMA DE IMPLANTAÇÃO
Um diagrama de implantação é um tipo de diagrama da UML (Unified Modeling Language)
que representa a arquitetura física de um sistema, mostrando como os componentes de
software são distribuídos em hardware ou nós físicos. Ele ilustra a relação entre os elementos
físicos (como servidores, dispositivos, redes) e os artefatos de software (como aplicações,
bancos de dados, serviços) que são implantados nesses elementos.
Características principais:

• Nós: Representam elementos físicos, como servidores, computadores, dispositivos de
rede ou contêineres.
• Artefatos: Representam componentes de software, como arquivos executáveis,
bibliotecas, bancos de dados ou scripts.
• Conexões: Mostram as interações entre os nós, como redes, protocolos de
comunicação ou dependências.
• Escopo: Focado na implantação física, não nos detalhes internos do software.
Objetivo:
• Mostrar a topologia do sistema, incluindo onde e como os componentes são
executados.
• Auxiliar na gestão de infraestrutura, planejamento de implantação e identificação de
gargalos ou pontos de falha.
• Facilitar a comunicação entre equipes de desenvolvimento, operações e
infraestrutura.
Exemplo de uso:
Imagine um sistema web com:
• Um servidor web (nó) que hospeda a aplicação front-end (artefato).
• Um servidor de banco de dados (nó) que executa um banco de dados relacional
(artefato).
• Uma conexão de rede (como HTTP ou TCP/IP) entre os dois.

## O diagrama de implantação mostraria esses nós, os artefatos implantados neles e as conexões
entre eles.
Exemplo de uso:

## DIAGRAMA DE COMPONENTES
Um diagrama de componentes é um tipo de diagrama da UML (Unified Modeling Language)
que representa a organização e as dependências entre os componentes de software de um
sistema. Ele foca na estrutura lógica do sistema, mostrando como os módulos ou
componentes de software (como classes, bibliotecas, arquivos ou módulos) interagem entre
si por meio de interfaces, sem se preocupar com a implantação física (como em um diagrama
de implantação).
### Características principais:

• Componentes: Representam partes modulares do sistema, como bibliotecas,
módulos, classes, arquivos ou serviços. Cada componente é uma unidade reutilizável
que encapsula funcionalidades específicas.
• Interfaces: Mostram como os componentes se comunicam, divididas em:
o Interfaces fornecidas: Funcionalidades que um componente oferece.
o Interfaces requeridas: Funcionalidades que um componente precisa de outros
para funcionar. Ela consome um recurso.
• Conexões: Representam dependências ou fluxos de dados entre componentes,
geralmente por meio de interfaces.
• Escopo: Focado na organização lógica do software, não na infraestrutura física
(diferentemente do diagrama de implantação).
Objetivo:
• Mostrar a arquitetura lógica do sistema, destacando como os componentes se
relacionam.
• Facilitar o entendimento da modularidade e reusabilidade do software.
• Auxiliar no design, manutenção e integração de sistemas complexos.
• Servir como base para equipes de desenvolvimento entenderem dependências e
pontos de integração.
Exemplo de uso:

APROFUNDE O CONHECIMENTO:
Diagrama de Implantação:
https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-deployment-diagram/
https://www.tutorialspoint.com/uml/uml_deployment_diagram.htm
https://www.ibm.com/docs/pt-br/rsas/7.5.0?topic=topologies-deployment-diagrams
Diagrama de componentes:
http://www.dca.fee.unicamp.br/~gudwin/ftp/ea976/CompDepl.pdf
https://creately.com/blog/pt/diagrama/tutorial-de-diagrama-de-componentes-2/
TRABALHO

## Com base no material estudado sobre diagramas UML, desenvolva os itens a seguir:

1. Definir um problema: descreva textualmente um problema que você gostaria de
resolver por meio de um sistema, ou seja, o enunciado de um sistema que você
imagina desenvolver. Os membros da equipe devem discutir um tema e apresentar
para o professor o texto construído. O professor vai avaliar e liberar a equipe para o
próximo item.

2. Com base no enunciado, faça o diagrama de componentes contendo no mínimo 5
componentes. Esse diagrama deve representar uma parte do sistema, além de
relacionar os componentes que fornecem e os que consomem.

3. Com base no mesmo enunciado, faça o diagrama de implantação (com componentes
do diagrama de networking) representando como funciona a arquitetura do sistema a
nível de implantação (banco de dados, cliente-servidor, navegador, bibliotecas,
firewall, etc).