package ch.bbcag.backend.todolist.item;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item findById(Integer id) {
        return itemRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<Item> findByName(String name) {
        return itemRepository.findByName(name);
    }

    public Item insert(Item item) {
        return itemRepository.save(item);
    }

    public Item update(Item changingItem, Integer id) {
        Item existingItem = this.findById(id);
        mergeItems(existingItem, changingItem);
        return itemRepository.save(existingItem);
    }

    public void deleteById(Integer id) {
        findById(id); // throws exception if not found!
        itemRepository.deleteById(id);
    }


    private void mergeItems(Item existingItem, Item changingItem) {
        if (changingItem.getName() != null) {
            existingItem.setName(changingItem.getName());
        }
        if (changingItem.getDescription() != null) {
            existingItem.setDescription(changingItem.getDescription());
        }
        if (changingItem.getDone() != null) {
            existingItem.setDone(changingItem.getDone());
        }
        if (changingItem.getPerson() != null) {
            existingItem.setPerson(changingItem.getPerson());
        }
    }
}
