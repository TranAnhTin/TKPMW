package behavioral.Observer.CA6;

public class DataPlayer {
    int thoiGian,countdown,grade;
    IPlayerdata dashBoard;
    public DataPlayer(int thoiGian, int countdown, int grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        dashBoard.Update(countdown,thoiGian,grade);
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        dashBoard.Update(countdown,thoiGian,grade);
    }

    public void setGrade(int grade) {
        this.grade = grade;
        dashBoard.Update(countdown,thoiGian,grade);
    }
    public static interface IPlayerdata{
        void Update(int c, int t, int g);
    }
    @Override
    public String toString() {
        return "thoiGian=" + thoiGian +
                "\ncountdown=" + countdown +
                "\ngrade=" + grade;
    }
}
