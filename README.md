# Desafio técnico DOCK
O desafio foi desenvolvido utilizando a linguagem JAVA na sua versão 11. O JAVA foi escolhido por familiaridade.

Para gravar os dados, foi utilizado o banco de dados H2 já embarcado na aplicação. O acesso ao banco de dados H2 dar-se após subir a aplicação e acessar o link: http://localhost:9180/h2 - Atualmente a porta da aplicação é 9180 (pode ser configurada no arquivo application.properties na propriedade server.port).

Foram criados 4 endpoints:<br />
-> Get<br />
  - Metodo...........: getAllTerminals<br />
  - Retorno..........: Retorna uma lista de todos os terminais cadastrados<br />
  - Url..............: http://localhost:9180/v1/terminals<br />
  - Modelo de retorno:<br />
      {<br />
        "logic": 44332211,<br />
        "serial": "123",<br />
        "model": "PWWIN",<br />
        "sam": 0,<br />
        "ptid": "F04A2E4088B",<br />
        "plat": 4,<br />
        "version": "8.00b3",<br />
        "mxr": 0,<br />
        "mxf":16777216,<br />
        "PVERFM":”PWWIN"<br />
      }<br />
      <br />
-> Get with param<br />
  - Metodo...........: getAllTerminalsById<br />
  - Entrada..........: id (equivalente ao campo 'logic')<br />
  - Retorno..........: Retorna o objeto pesquisado caso exista no banco de dados.<br />
  - Url..............: http://localhost:9180/v1/terminals/44332211<br />
  - Modelo de retorno:<br />
      {<br />
        "logic": 44332211,<br />
        "serial": "123",<br />
        "model": "PWWIN",<br />
        "sam": 0,<br />
        "ptid": "F04A2E4088B",<br />
        "plat": 4,<br />
        "version": "8.00b3",<br />
        "mxr": 0,<br />
        "mxf":16777216,<br />
        "PVERFM":”PWWIN"<br />
      }<br />
      <br />
-> Patch with param<br />
  - Metodo.............: changeTerminal<br />
  - Entrada............: id (equivalente ao campo 'logic')<br />
  - Body da requisição.:<br />
      {<br />
        "serial": "123",<br />
        "model": "PWWIN",<br />
        "sam": 0,<br />
        "ptid": "F04A2E4088B",<br />
        "plat": 4,<br />
        "version": "8.00b3",<br />
        "mxr": 0,<br />
        "mxf":16777216,<br />
        "PVERFM":”PWWIN"<br />
      }<br />
  - Retorno............: Retorna o objeto alterado caso exista no banco de dados.<br />
  - Url................: http://localhost:9180/v1/terminals/44332211<br />
  - Modelo de retorno..:<br />
      {<br />
        "logic": 44332211,<br />
        "serial": "123",<br />
        "model": "PWWIN",<br />
        "sam": 0,<br />
        "ptid": "F04A2E4088B",<br />
        "plat": 4,<br />
        "version": "8.00b3",<br />
        "mxr": 0,<br />
        "mxf":16777216,<br />
        "PVERFM":”PWWIN"<br />
      }<br />
