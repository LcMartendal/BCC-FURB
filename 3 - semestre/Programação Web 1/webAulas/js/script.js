function alteraConteudo() {
    var vElemento = document.getElementsByTagName('h3')[0];
    vElemento.innerHTML = 'Conteúdo alterado';
    vElemento.style.backgroundColor = 'coral';
}

function ativaClasse1() {
    document.getElementById('outro_h3').classList.add('classe1');
}

function insereItem() {
    var vElementoInput = document.getElementById('itemLista');
    var vElementoLista = document.getElementById('listaTarefas');
    var vElementoLI = document.createElement('li');
    vElementoLI.innerHTML = vElementoInput.value;
    vElementoLista.appendChild(vElementoLI);

    vElementoInput.value = '';
    vElementoInput.focus();
}

function insereInicio() {
    var vElementoInput = document.getElementById('itemLista');
    var vElementoLista = document.getElementById('listaTarefas');
    var vElementoLI = document.createElement('li');
    vElementoLI.innerHTML = vElementoInput.value;
    vElementoLista.insertBefore(vElementoLI, vElementoLista.firstChild);

    vElementoInput.value = '';
    vElementoInput.focus();
}

function excluiTarefa() {
    var vElementoLista = document.getElementById('listaTarefas');
    vElementoLista.removeChild(vElementoLista.lastChild);
}

function insLinhaTabela() {
    var vTabela = document.getElementById('tabela');
    /*var vLinha = document.createElement('tr');
    var vCell1 = document.createElement('td');
    var vCell2 = document.createElement('td');
    var vCell3 = document.createElement('td');
    vCell1.innerHTML = 'Cell 1';
    vCell2.innerHTML = 'Cell 2';
    vCell3.innerHTML = 'Cell 3';
    vLinha.appendChild(vCell1);
    vLinha.appendChild(vCell2);
    vLinha.appendChild(vCell3);
    vTabela.appendChild(vLinha);*/

    var vLinha = vTabela.insertRow();
    var vCell1 = vLinha.insertCell();
    var vCell2 = vLinha.insertCell();
    var vCell3 = vLinha.insertCell();
    vCell1.innerHTML = 'Cell 1';
    vCell2.innerHTML = 'Cell 2';
    vCell3.innerHTML = 'Cell 3';
}

function delLinhaTabela() {
    document.getElementById('tabela').deleteRow(-1);
}