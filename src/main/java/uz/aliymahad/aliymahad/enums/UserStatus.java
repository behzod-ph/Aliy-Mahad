package uz.aliymahad.aliymahad.enums;

public enum UserStatus {
    DELETED(-100),
    BLOCKED(-10),
    PENDING(0),
    ACTIVE(1);

    public final int code;

    UserStatus(int code) {
        this.code = code;
    }
}
