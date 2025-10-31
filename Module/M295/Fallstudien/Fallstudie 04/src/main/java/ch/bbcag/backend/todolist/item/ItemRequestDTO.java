package ch.bbcag.backend.todolist.item;

import java.util.Objects;

public class ItemRequestDTO {

    private String name;
    private String description;
    private Integer personId;
    private Boolean done;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemRequestDTO that = (ItemRequestDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(personId, that.personId) && Objects.equals(done, that.done);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, personId, done);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
