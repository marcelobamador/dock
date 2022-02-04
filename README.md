# Desafio técnico DOCK
O desafio foi desenvolvido utilizando a linguagem JAVA na sua versão 11. O JAVA foi escolhido por familiaridade.

Para gravar os dados, foi utilizado o banco de dados H2 já embarcado na aplicação. O acesso ao banco de dados H2 dar-se após subir a aplicação e acessar o link: http://localhost:9180/h2 - Atualmente a porta da aplicação é 9180 (pode ser configurada no arquivo application.properties na propriedade server.port).

Foram criados 4 endpoints:<br />
-> Get
    - Metodo...........: getAllTerminals
    - Retorno..........: Retorna uma lista de todos os terminais cadastrados
    - Url..............: http://localhost:9180/v1/terminals
    - Modelo de retorno:
      {
        "logic": 44332211,
        "serial": "123",
        "model": "PWWIN",
        "sam": 0,
        "ptid": "F04A2E4088B",
        "plat": 4,
        "version": "8.00b3",
        "mxr": 0,
        "mxf":16777216,
        "PVERFM":”PWWIN"
      }
      
-> Get with param
  - Metodo...........: getAllTerminalsById
  - Entrada..........: id (equivalente ao campo 'logic')
  - Retorno..........: Retorna o objeto pesquisado caso exista no banco de dados.
  - Url..............: http://localhost:9180/v1/terminals/44332211
  - Modelo de retorno:
      {
        "logic": 44332211,
        "serial": "123",
        "model": "PWWIN",
        "sam": 0,
        "ptid": "F04A2E4088B",
        "plat": 4,
        "version": "8.00b3",
        "mxr": 0,
        "mxf":16777216,
        "PVERFM":”PWWIN"
      }
      
-> Patch with param
  - Metodo.............: changeTerminal
  - Entrada............: id (equivalente ao campo 'logic')
  - Body da requisição.:
      {
        "serial": "123",
        "model": "PWWIN",
        "sam": 0,
        "ptid": "F04A2E4088B",
        "plat": 4,
        "version": "8.00b3",
        "mxr": 0,
        "mxf":16777216,
        "PVERFM":”PWWIN"
      }
  - Retorno............: Retorna o objeto alterado caso exista no banco de dados.
  - Url................: http://localhost:9180/v1/terminals/44332211
  - Modelo de retorno..:
      {
        "logic": 44332211,
        "serial": "123",
        "model": "PWWIN",
        "sam": 0,
        "ptid": "F04A2E4088B",
        "plat": 4,
        "version": "8.00b3",
        "mxr": 0,
        "mxf":16777216,
        "PVERFM":”PWWIN"
      }
