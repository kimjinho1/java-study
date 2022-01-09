package access.modifier;

public class BirthDay {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (day < 1 || day > 31) {
                    isValid = false;
                } else {
                    isValid = true;
                    this.day = day;
                }
                break;
            }
            case 4, 6, 9, 11 -> {
                if (day < 1 || day > 30) {
                    isValid = false;
                } else {
                    isValid = true;
                    this.day = day;
                }
                break;
            }
            case 2 -> {
                if (day < 1 || day > 28) {
                    isValid = false;
                } else {
                    isValid = true;
                    this.day = day;
                }
                break;
            }
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        }
        else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
        }
        else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }

    public boolean getIsValid() {
        return isValid;
    }
}
