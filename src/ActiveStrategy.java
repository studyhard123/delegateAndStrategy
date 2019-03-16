import java.io.Serializable;

/**
 * 节日活动策略
 */
public enum ActiveStrategy{

    THENATIONALDAY("国庆节" , 0.8 , "10.01"),

    TEACHERISDAY("元旦节" , 0.6 , "09.10"),

    MIDAUTUMNFESTIVAL("中秋节" , 0.7 , "09.13"),

    FATHERISDAY("父亲节" , 0.6 , "06.16"),

    INTERNATIONALWORKERSISDAY("劳动节" , 0.7 , "05.01" ),

    MOTHERISDAY("母亲节" , 0.6 , "05.12"),

    NOACTIVITY("今天没有节日" , 0 , "00.00");

    private String holidayName;

    private double ataDiscount;

    private String time;

    private ActiveStrategy(String holidayName , double ataDiscount , String time){
        this.holidayName = holidayName;
        this.ataDiscount = ataDiscount;
        this.time = time;
    }

    public static ActiveStrategy getStrategyByTime(String time){
        ActiveStrategy[] strategys = values();
        for(ActiveStrategy strategy : strategys){
            if(strategy.getTime() == time){
                return strategy;
            }
        }
        return ActiveStrategy.NOACTIVITY;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public double getAtaDiscount() {
        return ataDiscount;
    }

    public void setAtaDiscount(double ataDiscount) {
        this.ataDiscount = ataDiscount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
