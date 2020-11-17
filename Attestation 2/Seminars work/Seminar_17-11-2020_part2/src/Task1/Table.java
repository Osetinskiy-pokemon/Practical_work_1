package Task1;

public class Table {
    private int place;

    public void setPlace(int place) {
        this.place = place;
    }

    public int getPlace() {
        return place;
    }

    public boolean occupied_free() {
        if (getPlace() > 0) {
            return true;
        } else {
            return false;
        }
    }
    public int lunched(int count){
        if (count>4){
            return 5;
        }else{
            count = count+count;
            return count;
        }
    }
}
