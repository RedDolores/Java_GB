package org.example;


import java.util.List;

public class Notebook {
    private String name;
    private String color;
    private List<String> filteredNotebooks;

    public Notebook(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Название: " + name + ", Цвет: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook example = (Notebook) obj;
        if (((name == null) || name.equals(example.name)) && ((color == null) ||
                color.equals(example.color))) {
            return true;
        } else {
            return false;
        }
    }

}
