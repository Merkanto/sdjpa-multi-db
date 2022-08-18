package merkanto.sdjpamultidb.domain.pan;

import jakarta.persistence.*;
import lombok.*;
import merkanto.sdjpamultidb.domain.CreditCardConverter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditCardPAN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = CreditCardConverter.class)
    private String creditCardNumber;
}