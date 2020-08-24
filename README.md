# crudpersonapi <br />
#### Exemplo de aplicação REST <br />
* SpringBoot<br />
* java 8 <br />
* maven <br />
* spring-data-jpa<br />
* bd h2 em memoria <br />
* swagger<br />



SWAGGER<br />

<a> http://localhost:8080/swagger-ui.html <br />

* listarTodos<br />
<a> http://localhost:8080/pessoas/ <br />
...
  
[
  {
    "apelido": "string",
    "cpfOuCnpj": "string",
    "dataNascimento": "2020-08-24T05:52:06.480Z",
    "dependentes": [
      {
        "id_dependente": 0,
        "nomeCompleto": "string",
        "tipoDependente": "Esposa"
      }
    ],
    "enderecos": [
      {
        "bairro": "string",
        "cep": "string",
        "cidade": "string",
        "complemento": "string",
        "estado": "string",
        "id_endereco": 0,
        "nomeLogradouro": "string",
        "numeroLogradouro": 0,
        "pais": "string",
        "tipo": "Comercial",
        "tipoLogradouro": "Rua"
      }
    ],
    "id": 0,
    "nome": "string",
    "profissão": "string",
    "salario": 0,
    "telefones": [
      {
        "codigoPais": "string",
        "ddd": "string",
        "id_telefone": 0,
        "numero": 0,
        "tipo": "Comercial"
      }
    ]
  }
]

... 
  <br />


