function validaCampos(){

	nome = document.getElementById("form:nome").value();
	email = document.getElementById("form:email").value();
	senha = document.getElementById("form:senha").value();
	confirmar = document.getElementById("form:confirmacao").value();
	endereco = document.getElementById("form:endereco").value();
	
	if(nome == ""){
		alert("Favor informar o nome.");
		document.getElementById("form:nome").focus();
		return false;
	}

	return true;

}