package itheima08;
//老师类
public class Teacher {

    public void checkScore(int score) throws ScoreException {
        if (score<0||score>100){
            throw new ScoreException("你输入的分数有误，应该在0-100之间");
        }
        else {
            System.out.println("分数正常");
        }
    }
}
