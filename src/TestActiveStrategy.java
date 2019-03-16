import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestActiveStrategy {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd");
        LocalDate date = LocalDate.now();
        ActiveStrategy as = ActiveStrategy.getStrategyByTime(date.format(formatter));
        System.out.println("今天是：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:dd")) + ",今天的节日是：" + as.getHolidayName() + ",今天在本店消费的打折是：" + (as.getAtaDiscount() == 0 ? "不打": as.getAtaDiscount() * 10) + "折");
    }
}
