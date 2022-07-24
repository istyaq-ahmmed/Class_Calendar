import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;

public  class final_file_system {
    String file_name;
    char ch=(char)126;
    List<String> the_hole_List=Collections.emptyList();
    final_file_system(String month,String year){
        file_name = month+year;
        the_hole_List = readFileInList(file_name);
    }
    private static List<String> readFileInList(String fileName)
    {
        File fl = new File(fileName);
	    List<String> lines = Collections.emptyList();
	    try{
            if(!fl.exists()) fl.createNewFile();
	        lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
	    }
	    catch (IOException e){
	    // do something
	        e.printStackTrace();
	    }
	return lines;
    }
    public evenData[] getEvents(int date){
        evenData[] events=null;
        String s_date ="0"+ String.valueOf(date);
        String event_String=null;
        for (String gg : the_hole_List) {
            if((gg.charAt(0)==s_date.charAt(0)) && (gg.charAt(1)==s_date.charAt(1))){
                event_String=gg;
            }
        }
        String temp=new String();
        if(event_String==null) 
        return events;
        else {
            int count = event_String.length();
            int nuber_of_event=0;
            int co=0;
            int stage=0;
            for (int i=0;i<count;i++) 
                if(event_String.charAt(i)=='^') nuber_of_event++;
            events=new evenData[nuber_of_event];
            events[co]=new evenData();
            for(int i=2;i<count;i++){
                if(event_String.charAt(i)!='^'){
                    co++;
                    if(co<nuber_of_event)
                    events[co]=new evenData();
                }
                while(i<count){
                    if(event_String.charAt(i)=='^') {
                        stage=0;
                        //i++;
                        break;
                    }
                    while(i<count){
                        if(event_String.charAt(i)=='%') {
                            if(stage==0) events[co-1].Name = temp ;
                            else if(stage==1) events[co-1].type = temp ; 
                            else if(stage==2) events[co-1].time = temp ;
                            stage++;
                            i++;
                            temp=new String();
                            if(co<nuber_of_event) break;
                            break;
                        }
                        temp+=event_String.charAt(i);
                        i++;
                    }
                }
            }
            }
             return events;
        }

        public void write_file(evenData write_aEvent, int at) {
        String s_date ="0"+ String.valueOf(at);
        String finalString=new String();
        List <String> lst= new ArrayList<>();
        boolean wasItIn  = false;
        //String toWrite;
            for (String string : the_hole_List) {
            if((string.charAt(0)==s_date.charAt(0)) && (string.charAt(1)==s_date.charAt(1))){
                lst.add(string+write_aEvent.Name+"%"+write_aEvent.type+"%"+write_aEvent.time+"%^");
                wasItIn=true;
            }
            else lst.add(string);
            }
            if(!wasItIn) lst.add(write_aEvent.Name+"%"+write_aEvent.type+"%"+write_aEvent.time+"%^");
            write_file(lst);
        }
        public void write_file(List<String> sti){
            int i=35;
            try {
                FileWriter output= new FileWriter("fileName.txt");
                //output.write();
                output.flush();
                for (String string : sti) {
                    output.write(string+"\n");
                }
                output.close();
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
}
