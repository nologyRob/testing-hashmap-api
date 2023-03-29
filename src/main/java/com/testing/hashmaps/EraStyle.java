package com.testing.hashmaps;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;

public class EraStyle {
    private String image;
    private ArrayList<String> description;
    private ArrayList<String> keyPieces;

    public EraStyle(String image, ArrayList<String> description, ArrayList<String> keyPieces) {
        this.image = image;
        this.description = description;
        this.keyPieces = keyPieces;
    }

    public EraStyle() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }

    public List<String> getKeyPieces() {
        return keyPieces;
    }

    public void setKeyPieces(ArrayList<String> keyPieces) {
        this.keyPieces = keyPieces;
    }
}
