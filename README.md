# Desafio técnico DOCK
O desafio foi desenvolvido utilizando a linguagem JAVA na sua versão 11. O JAVA foi escolhido por familiaridade.

Para gravar os dados, foi utilizado o banco de dados H2 já embarcado na aplicação. O acesso ao banco de dados H2 dar-se após subir a aplicação e acessar o link: http://localhost:9180/h2 - Atualmente a porta da aplicação é 9180 (pode ser configurada no arquivo application.properties na propriedade server.port).

# Foram criados 4 endpoints:<br />
# Get<br />
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
# Get with param<br />
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
# Patch with param<br />
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
# Post<br />
  - Metodo.............: addTerminal<br />
  - Entrada............: String
  - Obs................: Para que seja aceito a string enviada, deve-se colocar na requisição o header: Content-Type: text/html. Se for enviado como JSON não será aceito.
  - Body da requisição.: 44332211;123;PWWIN;0;F04A2E4088B;4;8.00b3;0;16777216;PWWIN<br />
  - Retorno............: Retorna o objeto cadastrado no banco de dados.<br />
  - Url................: http://localhost:9180/v1/terminals<br />
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
# COMO EXECUTAR A APLICAÇÃO<br />
- Fazer o clone da aplicação na sua máquina.
- Selecionar a branch <b>MASTER</b>
- Após o clone, importar o projeto para a sua IDE (Eclipse, STS, etc).
- Clicar com o botão direito do mouse em cima do projeto -> Run as -> Maven Clean
- Após o Maven clean, clicar com o botão direito do mouse em cima do projeto -> Run as -> Maven Install
- Após o Maven Install, clicar com o botão direito do mouse em cima do projeto -> Run as -> Spring boot app
- Com os passos acima, o projeto vai subir na porta 9180 e poderá ser acessado assim: http://localhost:9180/v1/terminals e utilizar os endpoinst relatados acima
