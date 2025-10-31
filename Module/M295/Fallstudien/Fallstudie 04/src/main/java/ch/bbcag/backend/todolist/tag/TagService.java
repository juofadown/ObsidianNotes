package ch.bbcag.backend.todolist.tag;

import ch.bbcag.backend.todolist.FailedValidationException;
import jakarta.persistence.EntityNotFoundException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TagService {
    public TagService(TagRepository tagRepository) {this.tagRepository = tagRepository;}
    private final TagRepository tagRepository;

    public List<Tag> findByNameContains(String name) {
        return tagRepository.findByNameContains(name);
    }
    public List<Tag> findByName(String name){
        return tagRepository.findByName(name);
    }

    public Tag findById(Long id) {
        return tagRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Tag update(Tag updatedTag, Long id) {
        Tag existingTag = this.findById(id);
        mergeTags(existingTag, updatedTag);
        return tagRepository.save(existingTag);
    }

    private void mergeTags(Tag existing, Tag incoming) {
        if (incoming.getName() != null) {
            existing.setName(incoming.getName());
            }
    }
}
