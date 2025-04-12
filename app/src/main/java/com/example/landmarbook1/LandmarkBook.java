package com.example.landmarbook1;

import java.io.Serializable;
// serileştirmek yani bir veriyi bir yerden bir yere yollarken bunu veriye çevirip diğer taraftan diğer eski haline çevirir.
public class LandmarkBook implements Serializable {

    String name;
    String country;
    int image;

    public LandmarkBook(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }
}

//listview da 1000 eleman varken 1000 tane xml oluşturuyor fakat recyclerview daha az oluşturur kullanıcının göreceği kadar oluşturur
// kullanıcı scroll ettikçe onları tekrar kullanıyor ismi gibi geri ordaki görünümleri geri dönüştürüryor bu yüzden eleman sayısı 5000
// de olsa sorun ama listview da verim düşüyor reacycler view da hiçbişey farketmiyor.
