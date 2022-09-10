package merkanto.sdjpamultidb.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import merkanto.sdjpamultidb.domain.cardholder.CreditCardHolder;
import merkanto.sdjpamultidb.domain.creditcard.CreditCard;
import merkanto.sdjpamultidb.domain.pan.CreditCardPAN;
import merkanto.sdjpamultidb.repositories.cardholder.CreditCardHolderRepository;
import merkanto.sdjpamultidb.repositories.creditcard.CreditCardRepository;
import merkanto.sdjpamultidb.repositories.pan.CreditCardPANRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {

    private final CreditCardHolderRepository creditCardHolderRepository;
    private final CreditCardRepository creditCardRepository;
    private final CreditCardPANRepository creditCardPANRepository;

    @Override
    public CreditCard getCreditCardById(Long id) {
        //todo impl

        return null;
    }

    @Transactional
    @Override
    public CreditCard saveCreditCard(CreditCard cc) {
        CreditCard savedCC = creditCardRepository.save(cc);
        savedCC.setFirstName(cc.getFirstName());
        savedCC.setLastName(cc.getLastName());
        savedCC.setZipCode(cc.getZipCode());
        savedCC.setCreditCardNumber(cc.getCreditCardNumber());

        creditCardHolderRepository.save(CreditCardHolder.builder()
                        .creditCardId(savedCC.getId())
                        .firstName(savedCC.getFirstName())
                        .lastName(savedCC.getLastName())
                        .zipCode(savedCC.getZipCode())
                .build());

        creditCardPANRepository.save(CreditCardPAN.builder()
                        .creditCardNumber(savedCC.getCreditCardNumber())
                        .creditCardId(savedCC.getId())
                .build());

        return savedCC;
    }
}
