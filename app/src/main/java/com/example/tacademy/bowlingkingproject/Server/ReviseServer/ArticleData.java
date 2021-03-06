package com.example.tacademy.bowlingkingproject.Server.ReviseServer;

/**
 * Created by Tacademy on 2017-03-02.
 */

public class ArticleData {
    //int memberIndex; //탈퇴한 경우 (알 수 없음) 이라 표시
    String memberIndex;
    String memberId;   //탈퇴한 경우 (알 수 없음) 이라 표시
    String memberName; //탈퇴한 경우 (알 수 없음) 이라 표시
    String articleContext; // "뀨뀨뀨뀨뀨뀨",
    String articleDate; // "2017/02/15 23:11:23"
    String memberPic;//일반글 프로필사진

    @Override
    public String toString() {
        return "ArticleData{" +
                "memberIndex='" + memberIndex + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", articleContext='" + articleContext + '\'' +
                ", articleDate='" + articleDate + '\'' +
                ", memberPic='" + memberPic + '\'' +
                '}';
    }

    public ArticleData(String memberIndex, String memberId, String memberName, String articleContext, String articleDate, String memberPic) {
        this.memberIndex = memberIndex;
        this.memberId = memberId;
        this.memberName = memberName;
        this.articleContext = articleContext;
        this.articleDate = articleDate;
        this.memberPic = memberPic;
    }

    public String getMemberPic() {
        return memberPic;
    }

    public void setMemberPic(String memberPic) {
        this.memberPic = memberPic;
    }

    public String getMemberIndex() {
        return memberIndex;
    }

    public void setMemberIndex(String memberIndex) {
        this.memberIndex = memberIndex;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getArticleContext() {
        return articleContext;
    }

    public void setArticleContext(String articleContext) {
        this.articleContext = articleContext;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }
}
