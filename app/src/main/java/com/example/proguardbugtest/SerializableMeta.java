package com.example.proguardbugtest;

import java.io.Serializable;

class SerializableMeta implements Serializable {
    private static final long serialVersionUID = -7822771794489130246L;

    private String nickname;
    private int age;

    SerializableMeta(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }
}
