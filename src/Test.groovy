import java.awt.Robot
import java.awt.event.InputEvent
import java.text.SimpleDateFormat

class Test {
    static void main(String[] args) {
        Date date = new Date()
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm")
        dateFormat.format(date)
        while(!dateFormat.parse(dateFormat.format(date)).after(dateFormat.parse("19:00"))){
            Thread.sleep(60000)

            int x = 50
            int y = 50
            Robot bot = new Robot()
            bot.mouseMove(x,y)
            bot.mousePress(InputEvent.BUTTON1_MASK)
            bot.mouseRelease(InputEvent.BUTTON1_MASK)

        }

    }
}
