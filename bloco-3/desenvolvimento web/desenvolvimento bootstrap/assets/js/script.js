var nome = window.document.getElementById('nome')
var email = window.document.getElementById('email')
var assunto = window.document.getElementById('assunto')
var txtok = false;



function validationText() {
    var txtWarning = window.document.getElementById('txtWarning')
    if (nome.value.length < 3 || email.value.length < 5 || assunto.value.length < 2) {
        txtWarning.innerHTML = "preencha todos os campos!";
        txtWarning.style.color = "red";
        var txtok = false;

    } else {
        txtWarning.innerHTML = "";
        var txtok = true;
    }

}




function enviar() {
    if (txtok) {
        alert("enviado com sucesso!")
    } else {
        alert("insira os dados nos campos corretamente!")
    }
}