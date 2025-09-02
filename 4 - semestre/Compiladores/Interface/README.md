# TRABALHO FINAL – parte 1: implementação interface do compilador

## A interface do compilador (para Windows 8 ou superior) deve ser conforme especificado abaixo.
### ITEM DESCRIÇÃO

Geral 1. (0,6 pontos) A interface do compilador deve ter tamanho fixo 1500x800, ou seja, não deve ser possível alterar o
tamanho da janela. No entanto, deve ser possível minimizar e fechar a janela.

2. (0,8 pontos) A interface do compilador deve ter os seguintes componentes: uma barra de ferramentas (com
tamanho n x 70, onde n é o tamanho máximo para que o componente fique totalmente visível), uma área para
edição de programas – editor, uma área para visualização das mensagens e uma barra de status (com tamanho
n x 25, onde n é o tamanho máximo para que o componente fique totalmente visível), dispostos e visualizados
conforme Figura 1.

3. (0,8 pontos) Deve ser possível alterar o tamanho vertical do editor e da área para mensagens movendo a barra
de divisão existente entre eles.
Editor 

4. (0,3 pontos) Deve apresentar o número da linha, à esquerda, iniciando em 1. Não deve ser possível alterar o
número da linha.

5. (0,6 pontos) Deve possuir barras de rolagem (horizontal e vertical), que devem ser visualizadas, mesmo sem
texto editado.
Área para
mensagens

6. (0,3 pontos) Não deve ser possível editar texto na área para mensagens.

7. (0,6 pontos) Deve possuir barras de rolagem (horizontal e vertical), que devem ser visualizadas mesmo sem
mensagens. Barra de status 

8. (0,6 pontos) Deve mostrar a pasta e o nome do arquivo aberto.
Barra de ferramentas

9. (0,8 pontos) Deve possuir botões, todos com o mesmo tamanho, e com ações para: manipulação de arquivos
(novo, abrir, salvar), edição de textos (copiar, colar, recortar), compilação de programas (compilar) e
informações sobre o compilador (equipe). Os botões devem estar dispostos na ordem descrita, ou seja, primeiro
os botões para manipulação de arquivos, seguidos dos botões para edição de texto, e assim sucessivamente.
Cada botão deve possuir: um ícone, um nome e a indicação da tecla de atalho associada. O nome e a indicação
da tecla de atalho associada aos botões devem ser: novo [ctrl-n], abrir [ctrl-o], salvar [ctrl-s], copiar [ctrl-c], colar [ctrl-v], recortar [ctrl-x], compilar [F7], equipe [F1]. Nenhum nome deve ser abreviado.

10. (0,7 pontos) Quando o botão novo for pressionado (ou a tecla de atalho correspondente), a ação deve ser: limpar o editor, limpar a área para mensagens e limpar a barra de status
.
11. (1,2 pontos) Quando o botão abrir for pressionado (ou a tecla de atalho correspondente), a ação deve ser:
possibilitar a seleção de pasta/arquivo, carregar o arquivo selecionado no editor, limpar a área para mensagens
e atualizar a barra de status. Caso nenhum arquivo seja selecionado, o estado da interface, anterior ao botão
abrir ser pressionado (ou a tecla de atalho correspondente), deve ser mantido, ou seja, o editor deve manter o
texto que está sendo editado, a área para mensagens não deve ser limpa e a barra de status não deve ser
atualizada. Devem ser abertos arquivos texto (extensão .txt) compatíveis com o Notepad.

12. (1,2 pontos) Quando o botão salvar for pressionado (ou a tecla de atalho correspondente), a ação deve ser: 
(1) se o arquivo for novo, possibilitar a seleção de pasta/nome do arquivo, salvar o conteúdo do editor no arquivo
com o nome e no local selecionados, manter no editor o texto que está sendo editado, limpar a área para
mensagens e atualizar a barra de status; 
(2) caso contrário, salvar as alterações do arquivo editado, manter no editor o texto que está sendo editado, limpar a área para mensagens e manter a barra de status. Devem ser
salvos arquivos texto (extensão .txt) compatíveis com o Notepad.

13. (0,9 pontos) A ação associada a cada um dos botões de edição e as teclas de atalho associadas (copiar, colar,
recortar) é a mesma encontrada nos editores de texto convencionais.

14. (0,3 pontos) Quando o botão compilar for pressionado (ou a tecla de atalho correspondente), a ação deve ser:
apresentar mensagem (compilação de programas ainda não foi implementada) na área para mensagens. Só a
mensagem correspondente ao botão pressionado deve ser visualizada na área para mensagens.

15. (0,3 pontos) Quando o botão equipe for pressionado (ou a tecla de atalho correspondente), a ação deve ser:
apresentar os nomes dos componentes da equipe de desenvolvimento do compilador na área para mensagens.
Só a mensagem correspondente ao botão pressionado deve ser visualizada na área para mensagens.


1 Limpar o editor: significa “apagar” seu conteúdo.
2 Limpar a área para mensagens: significa “apagar” seu conteúdo.
3 Limpar a barra de status: significa “apagar” seu conteúdo e “esquecer” a pasta e o nome do arquivo editado.
4 Atualizar a barra de status: significa mostrar o nome da pasta e o nome do arquivo aberto.
5 Manter a barra de status: significa continuar mostrando o nome da pasta e o nome do arquivo editado.

## OBSERVAÇÕES:
 O compilador poderá ser desenvolvido em equipes com no mínimo dois e no máximo três estudantes.
 A implementação da interface do compilador deve ser disponibilizada no Ambiente Virtual de Aprendizagem (AVA),
na aba COMPILADOR, na tarefa “parte 1 - interface”. Deve ser disponibilizado um arquivo compactado (com o
nome: interface, seguido do número da equipe) contendo: o projeto completo, incluindo código fonte, executável
(ou .jar) e demais recursos. Basta um integrante da equipe postar o trabalho. Caso não sejam postados todos os
arquivos solicitados ou não seja possível rodar o executável (ou .jar), será atribuída nota 0.0 (zero) à interface.
 Na avaliação da interface será considerada a correta (e completa) implementação de cada item descrito no quadro
anterior.

DATA: entregar o trabalho até às 23h do dia 29/08/2025 (sexta).
Figura 1: Interface solicitada
barra de ferramentas
editor
barra de status
área para mensagens
barra de divisão para alterar tamanho do editor e da área para mensagens