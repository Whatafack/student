package com.example.demo.entity;

import java.io.Serializable;

public class DpdouyVideoEntity implements Serializable {
    private String videoId;
    private String videoName;
    private String videoUrl;
    private int videoPlaybackVolume;
    private int videoGoodCount;
    private String userId;

    @Override
    public String toString() {
        return "DpdouyVideoEntity{" +
                "videoId='" + videoId + '\'' +
                ", videoName='" + videoName + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", videoPlaybackVolume=" + videoPlaybackVolume +
                ", videoGoodCount=" + videoGoodCount +
                ", userId=" + userId +
                '}';
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getVideoPlaybackVolume() {
        return videoPlaybackVolume;
    }

    public void setVideoPlaybackVolume(int videoPlaybackVolume) {
        this.videoPlaybackVolume = videoPlaybackVolume;
    }

    public int getVideoGoodCount() {
        return videoGoodCount;
    }

    public void setVideoGoodCount(int videoGoodCount) {
        this.videoGoodCount = videoGoodCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
