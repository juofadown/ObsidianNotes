package ch.bbcag.backend.todolist.tag;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag,Long> {
    @Query("SELECT t FROM Tag t WHERE t.name LIKE CONCAT('%', :name,'%')")
    List<Tag> findByName(String name);
    List<Tag> findByNameContains(String name);
}
