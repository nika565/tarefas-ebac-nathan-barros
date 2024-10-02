package tarefa;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Definindo a annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)  // Define que a annotation pode ser usada em classes
public @interface Tabela {
    String nome();
}

