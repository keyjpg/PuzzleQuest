package gameObject;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class Chest extends GameObject{

    public Chest() {
        name = "Chest";
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/chest.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
