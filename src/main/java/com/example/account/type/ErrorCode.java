package com.example.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum ErrorCode {
    USER_NOT_FOUND("사용자가 없습니다."),
    ACCOUNT_NOT_FOUND("계좌가 없습니다."),
    USER_ACCOUNT_UN_MATCH("사용자와 계좌가 일치하지 않습니다."),
    ACCOUNT_ALREADY_UNREGISTERED("계좌가 이미 해제되었습니다."),
    BALANCE_NOT_EMPTY("잔액이 남아있는 계좌는 해지 할 수 없습니다."),
    MAX_ACCOUNT_PER_USER_10("사용자가 최대 계좌는 10개입니다.");


    private final String description;

    public String getDescription() {
        return description;
    }
}
