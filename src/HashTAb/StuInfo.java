package HashTAb;

public class StuInfo {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAge() {
        return age;
    }

    public int getCount() {
        return count;
    }

    private int count;

    public StuInfo(int age, int count) {
        this.age = age;
        this.count = count;
    }

    public int hashCode(){
        return age;
    }

    public StuInfo(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StuInfo{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
}
