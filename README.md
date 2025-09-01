# Logger Singleton em Java

## Descrição
Este projeto demonstra a implementação do **padrão de projeto Singleton** em Java.  
O foco é criar um **Logger customizado**, que centraliza o registro de logs da aplicação, garantindo que **toda a aplicação utilize uma única instância** do logger.

O Logger implementa:
- Timestamp da mensagem
- Nível do log (INFO, WARNING, ERROR)
- Nome da thread atual
- Saída formatada no console


## Funcionalidades
- Registrar logs de diferentes métodos da aplicação
- Estrutura de logs consistente e legível
- Uso do padrão Singleton para centralizar a instância do Logger
- Métodos utilitários: `info()`, `warning()`, `error()`

---

## Estrutura do Projeto
index.java -> Classe principal com métodos de exemplo

Logger.java -> Classe Logger Singleton customizada


---

## Exemplo de Uso
```java
Logger logger = Logger.getInstancia();
logger.info("Iniciando a aplicação");
logger.warning("Aviso importante");
logger.error("Erro crítico detectado");

//Saída no console:
[2025-09-01 19:22:11] [INFO] [Thread: main] Iniciando a aplicação
[2025-09-01 19:22:11] [WARNING] [Thread: main] Aviso importante
[2025-09-01 19:22:11] [ERROR] [Thread: main] Erro crítico detectado
```

