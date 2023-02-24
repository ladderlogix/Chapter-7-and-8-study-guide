public class StudyGuide2DArray {
    public static void main(String[] args){
        String[][] names = {{"Stephen", "Christine"}, {"Clare", "Ivan"}};
        for(String[] row : names){
            for(String name : row){
                System.out.println(name);
            }
        }
    }
}
