package ch.bbcag.backend.todolist.tag;

import java.util.Objects;

public class TagRequestDTO {
    public TagRequestDTO() {}
    public TagRequestDTO(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TagRequestDTO that = (TagRequestDTO) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
