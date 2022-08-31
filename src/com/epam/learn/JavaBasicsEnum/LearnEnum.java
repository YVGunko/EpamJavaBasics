package com.epam.learn.JavaBasicsEnum;

import java.util.Locale;

public class LearnEnum {
    public enum LearnStatus {
        STARTED(false),
        CONTINUED(false),
        FINISHED(true),
        REVIEWED(true);

        private final Boolean learnStatus;

        LearnStatus (Boolean status){
            this.learnStatus = status;
        }
        private String strReadyToInterview(LearnStatus status) {
            return switch (status){
                case FINISHED -> " almost ready";
                case REVIEWED -> " ready";
                case STARTED, CONTINUED -> " not ready";
                default -> " ready or not ready";
            };
        }
        @Override
        public String toString (){
            return "Your learn status is " + super.toString() +". You are"
                    + strReadyToInterview(this) + " to interview!";
        }
    }

    public static void main (String[] args){
        for (LearnStatus ls : LearnStatus.values()) {
            System.out.println(ls.toString());
        }
    }
}
