package exp8;

public class Poem {
    String name;
    int lines;
    Poem(String name, int lines){
        this.name = name;
        this.lines = lines;
    }
    String getName(){
        return name;
    }
    int getLine(){
        return lines;
    }
}
