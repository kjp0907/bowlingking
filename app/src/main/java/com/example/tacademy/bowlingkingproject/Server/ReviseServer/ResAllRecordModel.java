package com.example.tacademy.bowlingkingproject.Server.ReviseServer;

/**
 * Created by Tacademy on 2017-02-28.
 */

public class ResAllRecordModel {
    int code;
    String message;
    AllRecordScore score;

    public ResAllRecordModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AllRecordScore getScore() {
        return score;
    }

    public void setScore(AllRecordScore score) {
        this.score = score;
    }
}
