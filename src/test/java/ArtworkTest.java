import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork painting;
    Artist artist;
    final String PICASSO = "Picasso";

    @BeforeEach
    void setUp(){
        artist = new Artist(PICASSO);
        painting = new Artwork("The Painting", artist);
    }

    @Test
    void canGetArtist(){
        assertThat(painting.getArtist()).isEqualTo(artist);
    }

    @Test
    void canRenameArtistOfArtwork(){
        Artist renamedArtist = new Artist("van Gogh");
//        Artwork artwork = new Artwork("The Drawing", renamedArtist);
        painting.renameArtistOfArtwork(renamedArtist);
        assertThat(renamedArtist.getName()).isNotEqualTo(PICASSO);
        assertThat(renamedArtist.getName()).isEqualTo("van Gogh");
        assertThat(painting.getArtist().getName()).isEqualTo("van Gogh");
        assertThat(painting.getArtist().getName()).isNotEqualTo("Picasso");
    }

    // Test default values of Artwork constructor

    @Test
    void hasSimpleConstructorDefaultValues(){
        assertThat(painting.getPrice()).isEqualTo(0);
        assertThat(painting.getNft()).isEqualTo(0);
    }

    @Test
    void canSetPrice(){
        painting.setPrice(1000);
        assertThat(painting.getPrice()).isNotEqualTo(0);
        assertThat(painting.getPrice()).isEqualTo(1000);
    }

    @Test
    void canSetNft(){
        painting.setNft(1234);
        assertThat(painting.getNft()).isNotEqualTo(0);
        assertThat(painting.getNft()).isEqualTo(1234);
    }


}
