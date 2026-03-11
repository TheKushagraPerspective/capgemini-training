package com.capg.microservice.model;

public class BookDepo {
	private int depoId;
    private String depoAddress;

    public BookDepo() {}

    public BookDepo(int depoId, String depoAddress) {
        this.depoId = depoId;
        this.depoAddress = depoAddress;
    }

    public int getDepoId() {
        return depoId;
    }

    public void setDepoId(int depoId) {
        this.depoId = depoId;
    }

    public String getDepoAddress() {
        return depoAddress;
    }

    public void setDepoAddress(String depoAddress) {
        this.depoAddress = depoAddress;
    }
}
