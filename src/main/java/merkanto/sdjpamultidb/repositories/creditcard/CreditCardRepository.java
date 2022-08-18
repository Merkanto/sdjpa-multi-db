package merkanto.sdjpamultidb.repositories.creditcard;

import merkanto.sdjpamultidb.domain.creditcard.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
