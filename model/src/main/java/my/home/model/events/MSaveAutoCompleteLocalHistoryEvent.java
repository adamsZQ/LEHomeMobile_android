package my.home.model.events;

/**
 * Created by legendmohe on 15/2/19.
 */
public class MSaveAutoCompleteLocalHistoryEvent {
    public static final int SUCCESS = 0;
    public static final int ERROR = 1;

    private int returnCode;

    public MSaveAutoCompleteLocalHistoryEvent(int code) {
        this.returnCode = code;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }
}