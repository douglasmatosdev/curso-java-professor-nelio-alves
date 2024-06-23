# Configurações para estudar JDBC

## Configurando o MySQL

> Usando Docker com Portainer

1. Acesse o Portainer pelo browser

2. App Templates -> pesquise por MySQL

3. Configurações básicas

```txt
name: JDBC_STUDIES
Root password: 123456789
```
4. Show advanced options :arrow coloque o mapeamento de portas para `3306`

5. Deploy container

6. Acesse o MySQL pelo terminal

```zsh
~$ docker exec -it JDBC_STUDIES /bin/bash
~# mysql -u root -p
mysql> CREATE USER 'developer'@'%' IDENTIFIED BY '123456789';
mysql> GRANT ALL PRIVILEGES ON *.* TO 'developer'@'%';
```

7. Pronto, está configurado, só acessar usando a interface gráfica 
com MySQL Workbanch, DBeaver, etc.

8. Agora crie uma base de dados chamada `coursejdbc`
```SQL
create database coursejdbc
```


## MySQL Connector j

1. Acesse https://dev.mysql.com/downloads/connector/j/

2. Na opção de selecionar o sistema operacional escolha `Platform Independent`

3. Escolha o arquivo `.zip`

4. Descompacte o arquivo

5. Mova o arquivo `mysql-connector-j-8.4.0.jar` para uma pasta adequada, ex.:
```zsh
~$ mkdir ~/www/jdbc_curso_java_nelio_alves/java-libs

~$ mkdir ~/www/jdbc_curso_java_nelio_alves/java-libs/jdbc-connectors

mv ~/Downloads/mysql-connector-j-8.4.0/mysql-connector-j-8.4.0.jar ~/www/jdbc_curso_java_nelio_alves/java-libs/jdbc-connectors
```
## Configurando o Intellij (Se for usar o Eclipse olhe o material de apoio na pasta `resources`)

1. Abra o Intellij -> New Project -> No canto superior esquerdo clique em Empty Project

2. Agora vá em File -> Project Structure -> Project Settings -> Libraries
Clique no ícone de + e procure pelo `mysql-connector-j-8.4.0.jar`, depois clique em apply e OK.

3. Na raiz do projeto vamos criar um arquivo `db.properties` coma seguintes informações

> ### Atenção: Verifique se os campos contém espaços no final da linha!!!!

```txt
user=developer
password=123456789
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false
```

4. Crie um Classe `src/db/DbException`.

```Java
package db;

public class DbException extends RuntimeException {

    public DbException(String message) {
        super(message);
    }
}
```
5. Crie a Classe `src/db/DB`

```Java
package src.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
}

```

6. Agora para testar crie a classe `src/application/Program`
```Java
package src.application;

import src.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}

```