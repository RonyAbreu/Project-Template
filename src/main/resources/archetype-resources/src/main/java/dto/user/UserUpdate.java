#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserUpdate(
        @NotBlank(message = "Campo name não pode ser vazio")
        @Size(min = 3, max = 30, message = "Número de caracteres inválido")
        String name
) {
}
