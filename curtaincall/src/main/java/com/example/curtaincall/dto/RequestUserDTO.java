package com.example.curtaincall.dto;

import com.example.curtaincall.domain.User;
import lombok.Builder;

    public record RequestUserDTO(String phoneNumber,String nickName,  boolean  isCurtainCall) {

    @Builder
    public RequestUserDTO(String phoneNumber,String nickName,  boolean  isCurtainCall){
        this.phoneNumber = phoneNumber;
        this.nickName = nickName;
        this.isCurtainCall = isCurtainCall;
    }
    public User toEntity(String encryptNumber){
        return User.builder().phoneNumber(encryptNumber)
                .nickName(this.nickName).isCurtainCallOnAndOff(this.isCurtainCall).build();
    }

}