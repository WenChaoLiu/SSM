package cym.ssm.po;

public class Category {
    private Integer id;

    private String categoryId;

    private Integer categoryNote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public Integer getCategoryNote() {
        return categoryNote;
    }

    public void setCategoryNote(Integer categoryNote) {
        this.categoryNote = categoryNote;
    }
}