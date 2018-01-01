app.controller('pessoaController', function($scope, pessoaService, toastr) {
	consultar();
	function consultar(){
		pessoaService.consultar().then(function(response) {
			$scope.listaPessoa = response.data
		});
	}
	
	$scope.excluir = function(idUsuario) {
		pessoaService.excluir(idUsuario).then(function(response) {
			$scope.success = "Removido com sucesso";
			consultar();
		}, function(error) {
			toastr.error('Unable to load customer data: ' + error.message);
		});

	}

	$scope.alterar = function(pessoa) {
		$scope.pessoa = angular.copy(pessoa)
//		pessoaService.alterar($scope.pessoa).then(function(response) {
//			$scope.success = "Salvo com sucesso";
//		}, function(error) {
//			$scope.error = 'Unable to load customer data: ' + error.message;
//		});

	}
	
	$scope.salvar = function(){
		pessoaService.salvar($scope.pessoa)
		.then(function (response){
			toastr.success("Salvo com sucesso");
			consultar();
        },function (error){
            $scope.error = 'Unable to load customer data: ' + error.message;
        });	
	}

})