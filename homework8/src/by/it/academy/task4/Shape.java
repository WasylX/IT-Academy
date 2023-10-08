package by.it.academy.task4;

public abstract class Shape {
    private String color;
    protected String material;
    private String form;

    protected Shape(String color, String material, String form) {
        this.color = color;
        this.material = material;
        this.form = form;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}

