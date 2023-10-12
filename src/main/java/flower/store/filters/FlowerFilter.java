package flower.store.filters;

import flower.store.item.Flower;
import flower.store.item.FlowerColor;
import flower.store.item.FlowerType;
import flower.store.item.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerFilter implements SearchFilter {
    private double sepalLength;
    private double price;
    private FlowerColor color;
    private FlowerType flowerType;

    @Override
    public boolean match(Item item) {
        if (item instanceof Flower) {
            Flower flower = (Flower) item;
            if ((this.sepalLength == flower.getSepalLength()) && 
                (this.price == flower.getPrice()) && 
                (this.color == flower.getColor()) && 
                (this.flowerType == flower.getFlowerType())) {
                return true;
            } else {
                return false; } 
        }
        else {
            return false; } 
        
    }
}
