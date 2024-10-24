import java.io.File;
import java.io.IOException;

public class Program1 {
    public static void main(String[] args){
        try{
            File mahi = new File("Documents\\test.txt");
            if(mahi.createNewFile()){
                System.out.println("File Created : "+mahi.getName());
            }else{
                System.out.println("File Already Created");
            }
        }catch (IOException e){
            System.out.println("One Error Found");
            e.printStackTrace();
        }

    }
}
