
function autenticar() {
    var vLogin = document.getElementById('login').value;
    localStorage.setItem('loginUser', vLogin);
    var vPassword = document.getElementById('senha').value;
    localStorage.setItem('passwordUser', vPassword);

    location.replace("./mainPage.html");

}

function autenticarAt() {
    var vLogin = document.getElementById('login').value;
    var vPassword = document.getElementById('senha').value;
    if(vLogin !== "" && vPassword !== ""){
        localStorage.setItem('loginUser', vLogin);
        localStorage.setItem('passwordUser', vPassword);
        alert("Usuário devidamente autenticado!");
    }else{
        alert("Há algum campo vazio!");
    }
    
    location.replace("./mainPage.html");
    
}

if(localStorage.getItem('loginUser') !== null){
    var divNC = document.getElementById('nC');  
    divNC.style.visibility = 'hidden';
    var divC = document.getElementById('c');
    divC.style.visibility = "visible";
}else{
    var divNC = document.getElementById('nC');
    divNC.style.visibility = "visible";
    var divC = document.getElementById('c');
    divC.style.visibility = "hidden";
}   

function remove_estilo_custom() {
    const label = document.getElementsByTagName("label");
    const elementosLabelArray = Array.from(label);

    elementosLabelArray.forEach(label => {
        label.classList.remove('classe_label_custom')
    })

    const input = document.getElementsByTagName("input");
    const elementosinputArray = Array.from(input);

    elementosinputArray.forEach(input => {
        input.classList.remove('classe_input_custom')
    })
}

function estilo_custom() {
    const label = document.getElementsByTagName("label");
    const elementosLabelArray = Array.from(label);

    elementosLabelArray.forEach(label => {
        label.classList.add('classe_label_custom')
    })

    const input = document.getElementsByTagName("input");
    const elementosinputArray = Array.from(input);

    elementosinputArray.forEach(input => {
        input.classList.add('classe_input_custom')
    })
}


