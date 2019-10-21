package me.project;

public class Materia {
    private int id;
    private String nombreMateria;

    public Materia(int id, String nombreMateria)
    {
        this.setId(id);
        this.setNombreMateria(nombreMateria);
    }

    public int getId()
    {
        return id;
    }

    public String getNombreMateria()
    {
        return nombreMateria;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setNombreMateria(String nombreMateria)
    {
        this.nombreMateria = nombreMateria;
    }

    @Override
    public String toString()
    {
        return "Materia{id=" +
                id + ", nombre" +
                nombreMateria + "}";
    }
}
