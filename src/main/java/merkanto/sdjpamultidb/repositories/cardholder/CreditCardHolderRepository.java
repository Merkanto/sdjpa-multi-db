package merkanto.sdjpamultidb.repositories.cardholder;

import merkanto.sdjpamultidb.domain.cardholder.CreditCardHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardHolderRepository extends JpaRepository<CreditCardHolder, Long> {
}
