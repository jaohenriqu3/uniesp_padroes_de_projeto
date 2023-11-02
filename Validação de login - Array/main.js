const users = [
    { login:"usuario1", senha:"senha1"},
    { login:"usuario2", senha:"senha2"},
    { login:"usuario3", senha:"senha3"}
];

let botao = document.getElementById('bt-send') 

botao.addEventListener('click', function logar() { 
    
    let validar = false 
    let validar_user = document.getElementById("user").value
    let validar_pass = document.getElementById("pass").value 

    for(let ler in users) { 
        if(validar_user == users[ler].login && validar_pass == users[ler].senha) {
            validar = true
        } 
    }

    if(validar == true){
        alert("Login OK") 
    } else{ 
        alert("Login NULL")
    }
}) 
