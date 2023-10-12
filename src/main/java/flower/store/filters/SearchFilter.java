package flower.store.filters;

import flower.store.item.Item; 

public interface SearchFilter {
    boolean match(Item item);
}
