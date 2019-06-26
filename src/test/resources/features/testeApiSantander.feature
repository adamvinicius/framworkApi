#language: pt
Funcionalidade: JsonPlaceHolder
	@sprint1
  Esquema do Cenario: testeApiSantander
    Dado que adiciono o endpoint "<EndPoint>"
    E que adiciono o campo "Content-Type" com o valor "<type>" no objeto header
    Quando adiciono o campo "1" com o valor "<v1>" no objeto parameters
    E adiciono o campo "2" com o valor "<v2>" no objeto parameters
    E adiciono o campo "3" com o valor "<v3>" no objeto parameters
    E adiciono o campo "4" com o valor "<v4>" no objeto parameters
    E adiciono o campo "5" com o valor "<v5>" no objeto parameters
    E adiciono o campo "9" com o valor "<v9>" no objeto parameters
    E adiciono o campo "102" com o valor "<v102>" no objeto parameters
    E adiciono o campo "104" com o valor "<v104>" no objeto parameters
    E adiciono o campo "350" com o valor "<v350>" no objeto parameters
    E adiciono o campo "351" com o valor "<v351>" no objeto parameters
    E adiciono o campo "370" com o valor "<v370>" no objeto parameters
    E adiciono o campo "1707" com o valor "<v1707>" no objeto parameters
    E adiciono o campo "181" com o valor "<v181>" no objeto objDados
    E adiciono o campo "182" com o valor "<v182>" no objeto objDados
    E adiciono o objeto objDados na lista listObjDados
    E adiciono o campo "180" com a lista listObjDados no objeto parameters
    E adiciono o campo "parameters" com o objeto parameters no objeto json
    Entao recebo o objeto json

    Exemplos: 
      | EndPoint                                   | type             | v1  | v2         | v3 | v4 | v5 | v9                      | v102           | v104 | v181                | v182        | v350 | v351      | v370                    | v1707     |status|
      | https://jsonplaceholder.typicode.com/posts | application/json |  10 | EMAILAGE_1 |  1 |  1 | 52 | 2019-06-05 15:17:00.000 | 42256106000109 | J    | Luciana Lima Marion | 31804832880 |   11 | 988517676 | lucianal.snts@gmail.com | 10.68.1.1 |200|
      | https://jsonplaceholder.typicode.com/posts | application/json | 101 | EMAILAGE_1 | 11 |  1 | 52 | 2019-06-05 15:17:00.000 | 42256106000109 | J    | Luciana Lima Marion | 31804832880 |   11 | 988517676 | lucianal.snts@gmail.com | 10.68.1.1 |400|
