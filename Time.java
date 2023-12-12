public class Time {
// Instance variables
private int hours;
private int minutes;
private int seconds;

// Constructors
public Time(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
}


public void tick() {
    seconds++;
    if (seconds == 60) {
        seconds = 0;
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
            if (hours == 24) {
                hours = 0;
            }
        }
    }
}


  public void add(Time otherTime) {
      this.hours += otherTime.hours;
      this.minutes += otherTime.minutes;
      this.seconds += otherTime.seconds;

      if (this.seconds >= 60) {
          this.seconds -= 60;
          this.minutes++;
      }

      if (this.minutes >= 60) {
          this.minutes -= 60;
          this.hours++;
      }

      if (this.hours >= 24) {
          this.hours -= 24;
      }
}


    String formattedHours = String.format("%02d", hours);
    String formattedMinutes = String.format("%02d", minutes);
    String formattedSeconds = String.format("%02d", seconds);
    return formattedHours + ":" + formattedMinutes + ":" + formattedSeconds;
}
}
