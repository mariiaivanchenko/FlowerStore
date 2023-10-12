package flower.store.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@AllArgsConstructor
public class Flower extends Item {
    @Getter
    private double sepalLength;
    @Getter
    private double price;
    private FlowerColor color;
    @Getter
    private FlowerType flowerType;

    public Flower () {
    }

    public Flower (Flower fl) {
        this.sepalLength = fl.sepalLength;
        this.flowerType = fl.flowerType;
        this.color = fl.color;
        this.price = fl.price;
    }

    public FlowerColor getColor() {
        return color;
    }
    
}
