import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instancia;

    private Logger() {
        // construtor privado
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String nivel, String mensagem) {
        // Timestamp formatado
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // Nome da thread atual
        String thread = Thread.currentThread().getName();

        // Estrutura final do log
        System.out.println("[" + timestamp + "] [" + nivel + "] [Thread: " + thread + "] " + mensagem);
    }

    // Atalhos úteis (padrão em loggers)
    public void info(String mensagem) {
        log("INFO", mensagem);
    }

    public void warning(String mensagem) {
        log("WARNING", mensagem);
    }

    public void error(String mensagem) {
        log("ERROR", mensagem);
    }
}
