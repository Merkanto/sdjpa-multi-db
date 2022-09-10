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
@Table(name = "credit_card_pan")
public class CreditCardPAN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = CreditCardConverter.class)
    private String creditCardNumber;

    private Long creditCardId;
}