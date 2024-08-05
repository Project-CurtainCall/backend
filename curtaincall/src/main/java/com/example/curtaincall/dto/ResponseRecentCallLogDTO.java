package com.example.curtaincall.dto;

import com.example.curtaincall.domain.RecentCallLog;
import com.example.curtaincall.domain.User;
import lombok.Builder;

import java.util.Date;

public record ResponseRecentCallLogDTO(boolean isMissedCall, String nickName, Date recentCallDate) {
    @Builder
    public ResponseRecentCallLogDTO(boolean isMissedCall, String nickName, Date recentCallDate){
        this.isMissedCall = isMissedCall;
        this.nickName = nickName;
        this.recentCallDate = recentCallDate;
    }

    public RecentCallLog toEntity(String phoneNumber){
        return RecentCallLog.builder()
                .recentCallDate(this.recentCallDate)
                .isMissedCall(this.isMissedCall)
                .nickName(this.nickName)
                .phoneNumber(phoneNumber).build();
    }
}