package com.clone.ohouse.repository;

public class UserRepository {

    public String getUserInfo(String name){
        if(name.equals("수혁"))return"성공";
        return "실패";
    }

}
