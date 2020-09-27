Tecnologias:

-Código Desenvolvido em Java com o Framework Spring
-Banco de Dados Mysql vs 8.0.21
-Servidor web: TomCat 
-Ambiente desenvolvimento:Spring Tool Suite 4/Eclipse

Testes da API

1. Para Gerar url encurtada:
Método: POST
URL: //ENDERECO/encurtador/gerador
Dados em JSON:
              { "idUsuario":"usuarioteste",
                "urlOriginal":"inserir a url"
              }

2. Para listar as url's de um determinado usuário
Método: GET
URL: //ENDERECO/encurtador/listar/idusuario, onde idusuario deverá ser substituído pelo id correto do usuário


3. Para listar as informações a partir de uma url encurtada
Método: GET
URL: //ENDERECO/encurtador/urlencurtada, onde urlencurtada deverá ser substituído pela url encurtada que deseja buscar mais informações

4. Para listar todas as url's cadastradas
Método: GET
URL: //ENDERECO/encurtador/listar


Obs: a tabela criada no banco de dados para armazenamento dos dados encontra-se no diretório: ../resources/db/migration/V001__cria-tabela-url.sql. 
Ao executar o projeto ela é criada automaticamente pelo Flyway.
