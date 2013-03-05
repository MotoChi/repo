package bowling2;

import java.util.Calendar;
import java.util.Random;

public class PinsKnockedDown {
  private static Random ran = new Random(Calendar.getInstance().getTimeInMillis());
  
  public static int getNumberPinsKnockedDown(int totalPinsStanding) {
    return ran.nextInt(totalPinsStanding + 1);
  }
}
