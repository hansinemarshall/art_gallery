import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Artwork painting;
    Customer theCustomer;
    @BeforeEach
    void setUp(){
        Artist picasso = new Artist("Picasso");
//        Artist vanGogh = new Artist("van Gogh");
        painting = new Artwork("The Painting", picasso,100,1234);
        theCustomer = new Customer("Hansine");
        theCustomer.setWallet(1000);
    }

    @Test
    void canBuyArtworkAndAddToCollection(){
        theCustomer.buyArtwork(painting);
        assertThat(theCustomer.getWallet()).isEqualTo(900);
        assertThat(theCustomer.getArtCollectionSize()).isEqualTo(1);
    }
}
