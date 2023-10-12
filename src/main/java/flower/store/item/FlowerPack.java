package flower.store.item;

import lombok.Getter;


public class FlowerPack {
    @Getter
    private Flower flower;

    @Getter
    private int quantity;

    public FlowerPack(Flower fl, int quantity2) {
        this.flower = new Flower(fl);
        setQuantity(quantity2);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity < 1 ? 1 : quantity;
    }

    public double getPrice() {
        return getQuantity() * flower.getPrice();
    }
}


