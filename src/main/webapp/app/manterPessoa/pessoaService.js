app.service('pessoaService', function($http) {
	var vm = this;
	vm.consultar = consultar;
	vm.excluir = excluir;
	vm.alterar = alterar;
	vm.salvar = salvar;

	function consultar() {
		return $http.get("http://localhost:8080/crud/rest/pessoa/consulta");
	}

	function excluir(idUsuario) {
		return $http.get("http://localhost:8080/crud/rest/pessoa/excluir/"
				+ idUsuario);
	}
	function alterar(params) {
		return $http.post("http://localhost:8080/crud/rest/pessoa/salvar",
				params);
	}
	function salvar(params) {
		return $http.post("http://localhost:8080/crud/rest/pessoa/salvar",
				params);
	}
});