package merkanto.sdjpamultidb.repositories.pan;

import merkanto.sdjpamultidb.domain.pan.CreditCardPAN;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardPANRepository extends JpaRepository<CreditCardPAN, Long> {
}
