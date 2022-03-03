import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;

        stz = new StringTokenizer(br.readLine());
        int[] bd = new int[3];

        for (int i = 0; i < 3; i++) {
            bd[i] = Integer.parseInt(stz.nextToken());
        }

        stz = new StringTokenizer(br.readLine());
        int[] date = new int[3];

        for (int i = 0; i < 3; i++) {
            date[i] = Integer.parseInt(stz.nextToken());
        }

        // 0 년 1 월 2 일

        // 만 나이
        if(date[1]-bd[1]>0){
            System.out.println(date[0]-bd[0]);
        }else if(date[1]-bd[1]<0){
            System.out.println(date[0]-bd[0]-1);
        }else {
            if(date[2]-bd[2]>=0){
                System.out.println(date[0]-bd[0]);
            }else{
                System.out.println(date[0]-bd[0]-1);
            }
        }

        // 세는 나이
        System.out.println(date[0] - bd[0] + 1);
        // 연 나이
        System.out.println(date[0] - bd[0]);

    }

}


//https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=adamdoha&logNo=222048740058
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st=new StringTokenizer(br.readLine());    	
    	int dy=-Integer.parseInt(st.nextToken());
    	int dm=-Integer.parseInt(st.nextToken());
    	int dd=-Integer.parseInt(st.nextToken());
    	
    	st=new StringTokenizer(br.readLine());    	
    	dy+=Integer.parseInt(st.nextToken());
    	dm+=Integer.parseInt(st.nextToken());
    	dd+=Integer.parseInt(st.nextToken());

    	//만 나이
    	if(dm>0) System.out.println(dy);
    	else if(dm<0) System.out.println(dy-1);
    	else {
    		if(dd>=0) System.out.println(dy);
    		else System.out.println(dy-1);
    	}
    	
    	//세는 나이
    	System.out.println(dy+1);
    	
    	//연나이
    	System.out.println(dy);
    }
}
