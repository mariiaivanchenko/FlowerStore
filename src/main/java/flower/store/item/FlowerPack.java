package flower.store.item;

import lombok.Getter;


public class FlowerPack {
    @Getter
    private Flower flower;

    @Getter
    private int quantity;

    public FlowerPack(Flower fl, int quantFl) {
        this.flower = new Flower(fl);
        setQuantity(quantFl);
    }

    public void setQuantity(int newQuantity) {
        // this.quantity = newQuantity < 1 ? 1 : newQuantity;
        if (newQuantity < 1) {
            this.quantity = 1;
        }
        else {
            this.quantity = newQuantity;
        }
    }

    public double getPrice() {
        return getQuantity() * flower.getPrice();
    }
}


