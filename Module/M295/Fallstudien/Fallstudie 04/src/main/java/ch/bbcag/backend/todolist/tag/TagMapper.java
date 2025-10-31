package ch.bbcag.backend.todolist.tag;

import ch.bbcag.backend.todolist.item.Item;

import java.util.List;
import java.util.stream.Collectors;

public class TagMapper {
    public static TagResponseDTO toResponseDTO(Tag tag){
        TagResponseDTO dto = new TagResponseDTO();
        dto.setId(tag.getId());
        dto.setName(tag.getName());
        List<Integer> itemsIds = tag.getItems().stream()
                .map(Item::getId)
                .collect(Collectors.toList());
        dto.setItemIds(itemsIds);
        return dto;
    }

    public static Tag fromRequestDTO(TagRequestDTO tagRequestDTO){

    }
}
