package merkanto.sdjpamultidb;

import merkanto.sdjpamultidb.domain.creditcard.CreditCard;
import merkanto.sdjpamultidb.services.CreditCardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SdjpaMultiDbApplicationTests {

    @Autowired
    CreditCardService creditCardService;

    @Test
    void testSaveAndGetCreditCard() {
        CreditCard cc = CreditCard.builder()
                .firstName("Miro")
                .lastName("Ivanov")
                .zipCode("12345")
                .creditCardNumber("1234556")
                .cvv("123")
                .expirationDate("12/26")
                .build();

        CreditCard savedCC = creditCardService.saveCreditCard(cc);

        assertThat(savedCC).isNotNull();
        assertThat(savedCC.getId()).isNotNull();
        assertThat(savedCC.getCreditCardNumber()).isNotNull();
    }


    @Test
    void contextLoads() {
    }

}
