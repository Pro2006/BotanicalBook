package com.example.botanicalbook;

public class Plant {
    // поля сущности
    private String name; // поле названия животного
    private String plantDescription; // поле описания животного
    private int plantResource; // поле ресурса животного
    private String populationSize; // поле численности популяции

    public String getPlantDescription() {
        return plantDescription;
    }

    public void setPlantDescription(String plantDescription) {
        this.plantDescription = plantDescription;
    }

    public int getPlantResource() {
        return plantResource;
    }

    public void setPlantResource(int plantResource) {
        this.plantResource = plantResource;
    }

    // конструктор
    public Plant(String name, String plantDescription, int plantResource, String populationSize) {
        this.name = name;
        this.plantDescription = plantDescription;
        this.plantResource = plantResource;
        this.populationSize = populationSize;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }
}
