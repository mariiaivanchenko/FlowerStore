package flower.store.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@AllArgsConstructor
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower() {
    }

    public Flower(Flower fl) {
        this.sepalLength = fl.sepalLength;
        this.flowerType = fl.flowerType;
        this.color = fl.color;
        this.price = fl.price;
    }

    public FlowerColor getColor(){
        return color;
    }
    
}
