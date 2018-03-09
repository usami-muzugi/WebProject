package Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Food: wzard
 * Date: 2018-02-05
 * Time: 15:43
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class Student {
    private int nubmer;
    private String name;
    private int score;

    public Student(int nubmer, String name, int score) {
        this.nubmer = nubmer;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [id=" + getNubmer() + ",name=" + getName() + ",score=" + getScore()+"]";
    }

    public int getNubmer() {
        return nubmer;
    }

    public void setNubmer(int nubmer) {
        this.nubmer = nubmer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
