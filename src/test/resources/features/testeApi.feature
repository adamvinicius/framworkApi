#language: pt
Funcionalidade: JsonPlaceHolder

  Esquema do Cenario: Inicia Abertura de Contas
    Dado que adiciono o endpoint "<EndPoint>"
    E que adiciono o campo "Content-Type" com o valor "<type>" no objeto header
    Quando adiciono o campo "title" com o valor "<title>" no objeto json
    E adiciono o campo "body" com o valor "<body>" no objeto json
    E adiciono o campo "userId" com o valor "<userId>" no objeto json
    E adiciono o campo "nome" com o valor "<nomeCliente1>" no objeto clienteUm
    E adiciono o campo "nome" com o valor "<nomeCliente2>" no objeto clienteDois
    E adiciono o objeto clienteUm na lista clientes
    E adiciono o objeto clienteDois na lista clientes
    E adiciono o campo "clientes" com a lista clientes no objeto json
    Entao recebo o objeto json

    Exemplos: 
      | EndPoint                                   | type             | title | body | userId | nomeCliente1 | nomeCliente2 | status |
      | https://jsonplaceholder.typicode.com/posts | application/json | foo   | bar  |      1 | Santander    | Itau         |    200 |
      | https://jsonplaceholder.typicode.com/posts | application/json | foo   | bar  |      2 | Bradesco     | Safra        |    200 |
