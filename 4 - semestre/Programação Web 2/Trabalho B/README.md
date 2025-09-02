## TEMA: Documentação de serviços REST
METODOLOGIA: Aprendizagem Baseada em Projetos
OBJETIVOS E HABILIDADES ENVOLVIDAS:
• Compreender a definição de um serviço
• Compreender o uso de serviços
• Compreender os diferentes tipos de serviço

MATERIAL PARA ESTUDO
O OpenAPI (anteriormente conhecido como Swagger) é uma especificação para descrever,
criar, consumir e visualizar APIs RESTful de forma padronizada. Ele fornece um formato
independente de linguagem (geralmente em JSON ou YAML) para definir a estrutura de uma
API, incluindo endpoints, métodos HTTP, parâmetros, respostas, autenticação e outros
detalhes.

## Principais características do OpenAPI:

1. Definição Estruturada: Permite document financeiros, descrevendo todos os
aspectos de uma API, como:
o Recursos disponíveis (endpoints, como /users ou /products).
o Métodos HTTP suportados (GET, POST, PUT, DELETE, etc.).
o Parâmetros de entrada (query, path, body, headers).
o Formato das respostas (status codes, tipos de dados).
o Esquemas de autenticação (OAuth, API Key, etc.).

2. Interoperabilidade: Como é um padrão aberto, é suportado por diversas ferramentas
e linguagens, facilitando a integração entre sistemas.

3. Geração Automática:
o Documentação: Ferramentas como Swagger UI geram interfaces interativas
para testar e explorar APIs diretamente no navegador.
o Código: Pode gerar clientes (SDKs) e servidores em várias linguagens (Java,
Python, Node.js, etc.) a partir da especificação.
o Validação: Permite validar se as requisições e respostas estão conforme a
especificação.

4. Swagger: O termo "Swagger" é frequentemente usado para se referir às ferramentas
que implementam a especificação OpenAPI, como:
o Swagger UI: Interface gráfica para visualizar e testar APIs.
o Swagger Editor: Editor para criar e editar especificações OpenAPI.
o Swagger Codegen: Gera código cliente/servidor a partir da especificação.
Exemplo

Já o YAML (acrônimo para "YAML Ain't Markup Language") é um formato de serialização de
dados legível por humanos, usado para representar informações de forma estruturada,
semelhante ao JSON ou XML, mas com uma sintaxe mais simples e intuitiva. Ele é
amplamente utilizado em configurações, arquivos de definição (como no OpenAPI/Swagger),
automação e ferramentas de DevOps (ex.: Docker, Kubernetes, Ansible).
Características principais do YAML:

1. Legibilidade: A sintaxe é minimalista, com foco em facilitar a leitura e escrita por
humanos.

2. Estrutura Hierárquica: Usa indentação (geralmente 2 espaços) para representar
hierarquias, evitando caracteres como chaves {} ou colchetes [] do JSON.

3. Tipos de Dados: Suporta tipos básicos (strings, números, booleanos) e estruturas
complexas (listas, dicionários/mapeamentos).

4. Flexibilidade: Pode ser usado em várias linguagens de programação, com bibliotecas
disponíveis para parsear YAML (ex.: PyYAML em Python, SnakeYAML em Java).

Exemplo:

MATERIAL EXTERNO
API: https://youtu.be/tPbK3eOJLXQ
REST: https://youtu.be/S7MduKwvVGk
Especificações: https://www.infoq.com/br/articles/rest-introduction/
Sobre serviços e boas práticas: https://avera.com.br/blog/api-restful-boas-praticas
Exemplos de documentação:
https://petstore.swagger.io/#/
https://documenter.getpostman.com/view/11996532/T17M7R9N
https://editor.swagger.io/

# TRABALHO

## Com base no material estudado sobre REST e documentação, desenvolva os itens a seguir:
1. Após assistir os vídeos e ler o material, discutam dentro dos seus grupos o que
entenderam por API, REST e Serviços REST.

2. Discuta se entenderam como é feita a especificação de um serviço REST

3. Problema: o AVA3 parou de funcionar e alguém removeu todos os serviços de backend que haviam sido implementados para que o professor/aluno/secretários possa
alimentar a página.

4. O que fazer: analise a página do AVA3 e especifique os serviços que sua equipe
acredita ser necessários para a solução desta situação, limitando em uma quantidade
de 15 serviços. Deve-se apresentar no mínimo três serviços de cada tipo (GET, POST,
PUT e DELETE). Os problemas devem seguir alguns dos padrões já vistos na
introdução ao back-end que está em pdf no AVA. Lembre-se de colocar todos os
códigos de estado possíveis para cada serviço, assim como as demais informações
necessárias. Os serviços a serem definidos são fictícios, criados por sua equipe a partir
da interpretação do front-end e de seu conhecimento em serviços.

5. Discutam no grupo como proceder para criar a documentação desses serviços. Utilizar
o Swagger Editor para desenvolver a documentação. Ao final, deve-se entregar um
arquivo único com a documentação, que deverá ser apresentado ao professor de
forma presencial (em sala) por todos os membros da equipe.