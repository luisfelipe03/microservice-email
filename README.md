<hgroup><center><h1><b>API para envio de email</b></h1></center>
 
![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=dark&style=for-the-badge)

## Tecnologias usadas no projeto

<img align="center" alt="Felipe-java" height="60" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg"> -
<img align="center" alt="Felipe-java" height="60" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg"> -
<img align="center" alt="Felipe-java" height="60" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-plain-wordmark.svg" />

 
## Objetivo
Criar uma API Rest que faça o envio e email atraveis de requisições POST.

### Métodos

As requisições para a API devem seguir os padrões:

| Método   | Descrição                                             |
|:---------|-------------------------------------------------------|
| `GET`    | Retorna listar de todos os email já mandado.          |
| `POST`   | Utilizado para criar um novo registro.                |

### Respostas

| Código | Descrição                                                                  |
|:-------|----------------------------------------------------------------------------|
| `200`  | Requisição executada com sucesso.                                          |
| `201`  | Recurso cadastrado.                                                        |
| `204`  | Sem conteúdo. 
| `400`  | Campos não válidos para requisição.                                        ||
| `404`  | Registro pesquisado não encontrado. (Referente a interação com o recurso). |
| `500`  | Erro interno no servidor.  

# Grupo de Recursos

***

