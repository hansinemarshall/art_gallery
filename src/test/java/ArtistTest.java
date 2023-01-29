import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    @Test
    void canGetName(){
        Artist artist = new Artist("Picasso");
        assertThat(artist.getName()).isEqualTo("Picasso");
    }

    @Test
    void canSetName(){
        Artist artist = new Artist("Picasso");
        artist.setName("van Gogh");
        assertThat(artist.getName()).isNotEqualTo("Picasso");
        assertThat(artist.getName()).isEqualTo("van Gogh");
    }

}
