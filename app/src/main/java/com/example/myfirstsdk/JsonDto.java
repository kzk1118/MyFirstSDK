package com.example.myfirstsdk;

/**
 * JSONのDTOクラス。
 *
 * @author Kazuki Itoh
 * @since 1.0
 */
public class JsonDto {

    /** ユーザID */
    private String userId;

    /** ID */
    private String id;

    /** タイトル */
    private String title;

    /** 本文 */
    private String body;

    /**
     * ユーザIDを取得する。
     * @return ユーザID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザIDを設定する。
     * @param userId ユーザID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * IDを取得する。
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * IDを設定する。
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * タイトルを取得する。
     * @return タイトル
     */
    public String getTitle() {
        return title;
    }

    /**
     * タイトルを設定する。
     * @param title タイトル
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 本文を取得する。
     * @return 本文
     */
    public String getBody() {
        return body;
    }

    /**
     * 本文を設定する。
     * @param body 本文
     */
    public void setBody(String body) {
        this.body = body;
    }
}
