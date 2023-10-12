package flower.store.filters;

import flower.store.item.Item;

public class FlowerFilter implements SearchFilter {
    @Override
    public boolean match(Item item) {
        return true;
    }
}
