package flower.store.store;

import java.util.List;
import java.util.ArrayList;

import flower.store.item.Item; //  should be this way import flower.item.Item; 
import flower.store.filters.SearchFilter;

public class Store {
    private List<Item> items;

    public Store() {
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> search(SearchFilter searchFilter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (searchFilter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
