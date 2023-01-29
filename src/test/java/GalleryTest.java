import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    
    Gallery theGallery;
    Artwork drawing1;

    
    @BeforeEach
    void setUp(){
        Artist picasso = new Artist("Picasso");
        Artist vanGogh = new Artist("van Gogh");
        Artwork painting = new Artwork("The Painting", picasso,100,1234);
        drawing1 = new Artwork("The Drawing 1", vanGogh,200,4567);
        Artwork drawing2 = new Artwork("The Drawing 2", picasso,300,7890);
        theGallery = new Gallery("V&A");
        theGallery.addToStock(painting);
        theGallery.addToStock(drawing1);
        theGallery.addToStock(drawing2);
    }

    @Test
    void canGetName(){
        assertThat(theGallery.getName()).isEqualTo("V&A");
    }

    @Test
    void hasDefaultTillValue(){
        assertThat(theGallery.getTill()).isEqualTo(0);
    }

    @Test
    void canAddToTill(){
        theGallery.addToTill(500);
        assertThat(theGallery.getTill()).isNotEqualTo(0);
        assertThat(theGallery.getTill()).isEqualTo(500);
    }

    @Test
    void canGetValueOfStock(){
        double totalValue = theGallery.stock_take();
        assertThat(totalValue).isEqualTo(600);
    }

    @Test
    void canSellArtwork(){
        theGallery.sellStock(drawing1);
        assertThat(theGallery.getTill()).isEqualTo(200);
    }



}
