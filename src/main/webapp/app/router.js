app.config(function($routeProvider) {
    $routeProvider
    .when("/cadastrar", {
        templateUrl : "/crud/app/manterPessoa/manterPessoa.html",
        controller: 'pessoaController'
    })
});