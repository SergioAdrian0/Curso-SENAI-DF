```
#Neste documento estarão as configurações do nosso BANCO DE DADOS

#CONFIGURAÇÃO BD
spring.datasource.url = jdbc:mysql://localhost:3306/parkingspot

#NOME USUÁRIO
spring.datasource.username= root

#SENHA
spring.datasource.password=

#APLICAÇÃO MOSTRARÁ TODAS AS REQUISIÇÕES DE SQL no LOG
spring.jpa.show_sql = true

#AS ALTERAÇÕES NO BANCO DE DADOS SERÃO ATUALIZADAS AUTOMATICAMENTE
#spring.jpa.hibernate.ddl-auto = update

#CRIAR UMA TABELA
spring.jpa.hibernate.ddl-auto = create

#CONFIGURAÇÃO DA VERSÃO BANCO DE DADOS
spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL8Dialect

```