import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Data_File {
	 public static void main(String[] args) throws Exception
            {
                     
                         File f1=new File("C:/Users/HP/Desktop/Prodapt/tok.txt");
                         f1.createNewFile();
                         FileWriter fw =new FileWriter("tok.txt",false);
                         PrintWriter p= new PrintWriter(fw);
                         
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Employee e=null;
			ArrayList<Employee> a= new ArrayList<>();
			int choice=0;
			int equals=0;
			  do{
				System.out.println("\n1.Create \n2.Display \n3.Raise Salary \n4.Exit \nEnter Choice ");
			    choice=Integer.parseInt(br.readLine());		
				int d=0;		
				if(choice==4) {
					System.out.println("Exiting...!! \n");
					break;
				}
				if(choice==1){
				
                                        
					    do {
					    	System.out.println("\nWhat kind of an employee you would like to create : ");
				            System.out.println("\n1.Clerk \n2.Programmer \n3.Manager \n4.Quit \nEnter Choice ");
				            d= Integer.parseInt(br.readLine());
                                             if(d==4)
                                              {
                                                System.out.println("Quitting....!! \n");
                                                  break;
                                               }
                                               else
                                                {
                                                   equals=0;
				 
				         		    switch(d) {
				         				case 1 :e=new Clerk();
				         					break;
				         				case 2 :e=new Programmer(); 	        
				         					break;
				         				case 3 :e=new Manager();
				         					break;
                                                                         
				         				default : System.out.println("Please enter a valid Choice \n ");
				         			       }
				         			for(Employee e1: a) 
                                                                {
				         				if(e1.equals(e)) 
                                                                        {
				         					equals=1;
				         					System.out.println("The record already exists..!!");
				         				}
				         				 
				         			}
				         			if(equals==0) a.add(e);
                                                      p.println();
                                                        p.print(e.name+"/");
                                                         p.print(e.age+"/");
                                                        p.print(e.sal+"/");
                                                        p.print(e.Designation+"/"); 
                                                      p.println();
                                                 
                                              }
                                             }while(d!=4);
                                         }
					  
                                    if(choice==2){ BufferedReader brr = new BufferedReader(new FileReader("tok.txt"));
                                          String s1=brr.readLine();
                                          boolean data=false;
                                          while(s1!=null)
                                          {
                                             data=true;
                                             StringTokenizer st=new StringTokenizer(s1,"/");
                                              while(st.hasMoreTokens())
                                               {
                                                     String str= st.nextToken();
                                                     System.out.println(str);
                                               }
                                              s1=brr.readLine();
                                            }
                                            if(data==false)
                                             {

                                                       System.out.println("no data");
                                             }
                                       }
                                         
                                   p.flush();
                                   p.close();
                              }while(choice!=4);
                             
                         
                  }
   }


 




