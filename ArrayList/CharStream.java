import java.util.*;
import java.io.*;


class Student{
	int roll;
	String name;
	double marks;
	
	Student(){
		
	}
	Student(int roll, String name, double marks){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		
	}
	public String toString(){
		return "Student [roll = "+roll+", Name = "+name+" Marks = "+marks+"]";
	}
}

class CharStream{
	public static void main (String args[])throws IOException{
		File fin = new File("/java programs/ArrayList/InputOutput.txt") ;
		File fos = new File ("/java programs/ArrayList/target.txt");
		if(!fin.exists()){
			System.out.println("Not Exists");
			return;
			
		}
		FileReader fr = new FileReader(fin);
		FileWriter fw = new FileWriter(fos);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		int ch;
		String line;
		/*while ((ch=br.read())!=-1){
			System.out.print((char)(ch));
			bw.write(ch);
		}*/
		List<Student> list1 = new LinkedList<>();
		while((line = br.readLine())!=null){
			line = line.trim(); 
			if(line.isEmpty())
				continue;
			String str[] = line.split(",");
			int roll = Integer.parseInt(str[0]);
			String name =str[1];
			double marks = Double.parseDouble(str[2]);
			Student s = new Student(roll,name,marks);
			list1.add(s);
			
			
			
			
		}
		//br.close();
		FileWriter fw1 = new FileWriter(fos);
		BufferedWriter bw1 = new BufferedWriter(fw);
		for(Student s : list1){
			s.marks +=5;
			String str = s.roll+","+s.name+","+s.marks+"\n";
			bw.write(str);
			 
		}
		for(Student s: list1){
			System.out.println(s);
			
		}
		bw.flush();
		bw.close();
		bw.flush();
		bw.close();
		
	}
}