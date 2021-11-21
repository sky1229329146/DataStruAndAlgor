package Tu;

    //顶点类
public class Vertex {
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value='" + value + '\'' +
                '}';
    }

    public Vertex(String value) {
        this.value = value;
    }

    private String value;


}
