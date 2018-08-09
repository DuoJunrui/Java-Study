package day5.exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex0132 {
public static void main(String[] args) {
	
	FileInputStream fis=null;
    InputStreamReader isr=null;
    BufferedReader br=null;
    
    String ss="";
    String ssd="";
   
    try {
    	
        fis=new FileInputStream("article.txt");
        br=new BufferedReader(new InputStreamReader(fis));
        String str=null;
        Set set=new LinkedHashSet();
       
        try {
        	
            while((str=br.readLine())!=null)
            {
                char ch[]=str.toCharArray();
                if(ch[0]!=ch[ch.length-1])
                {
                    for(int i=0;i<ch.length;i++)
                    {
                        ss=ch[i]+"";
                        set.add(ss);
                    }       
                }    
            }
            
            Iterator it =set.iterator();
            
            while(it.hasNext())
            {
                ssd+=it.next();
            }
            System.out.print(ssd);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
