package test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test01 {
	
 public static void main(String[] args) {
	StringBuilder strB1 = new StringBuilder();//题目容器
	StringBuilder strB2 = new StringBuilder();//答案容器
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	while(flag) {
		System.out.println("请选择：教师登陆：1;学生登陆：2");
		switch(sc.nextInt()) {
			case 1://教师登陆
				
				System.out.println("------- 教师登陆 -----------");
				
				System.out.println("请输入您的名字：");
				String name = sc.next();
				System.out.println("请输入您的职位：");
				String pro = sc.next();
				System.out.println("请输入您所属的班级：");
				String className = sc.next();
				System.out.println("请输入您的年龄：");
				int age = sc.nextInt();
				Teacher  teacher = new Teacher(name,age,pro,className);
				System.out.println("欢迎"+teacher.getName()+"老师！");
				
				System.out.println("请选择：录入试题：3；统计结果：4");
				int num = sc.nextInt();
				if(num == 3) {//录入试题
					
					strB1.append("出题老师：").append(teacher.getName()).append(" 所属班级：").append(teacher.getClassName()).append(" 职称：")
					.append(teacher.getProfessional()).append("\n");
					int i = 1;//题目序号
					boolean goOn = true;//继续写入
					while(goOn) {
						System.out.println("请您输入试题：");
						strB1.append("第").append(i).append("题：").append(sc.next()).append("\n");
						System.out.println("请输入答案选项：");
						System.out.print("A.");
						strB1.append("A.").append(sc.next()).append("\r");
						System.out.print("B.");
						strB1.append("B.").append(sc.next()).append("\r");
						System.out.print("C.");
						strB1.append("C.").append(sc.next()).append("\r");
						System.out.print("D.");
						strB1.append("D.").append(sc.next()).append("\r\n");
						System.out.println("请输入正确答案：");
						strB2.append(i).append(".").append(sc.next()).append("\n");
						i++;//下一题
						System.out.println("按 Y 继续添加试题，N 结束添加：");
						goOn =  sc.next().equalsIgnoreCase("Y");
					}
					teacher.writeHomeWork(strB1.toString());//题目写入文本文档中test.txt
					teacher.writeAnswer(strB2.toString());//正确答案写入answer.txt中
					System.out.println("试题已添加成功！");
				}else if(num == 4){//统计
					
					List<Student> stuList = teacher.getStudentInfo();//获取学生的信息
					System.out.println("dddd"+stuList.size());
					Student[] stus = teacher.sortgrate(stuList);//统计并排名
					if(stus.length>0) {
						for (Student student : stus) {
							System.out.println(student.toString());
						}
					}
				}else {
					
					System.out.println("输入有误！");
				}
				break;
				
			case 2://学生登陆
				
				System.out.println("-----------学生登陆------------");
				
				System.out.println("请输入您的名字：");
				String stuName = sc.next();
				System.out.println("请输入您所属的班级：");
				String stuClassName = sc.next();
				Student student = new Student(stuName,stuClassName);//创建一个学生对象
				System.out.println("欢迎"+student.getName()+"同学,现在开始答题！");
				String homework = student.getHomeWork();//获取试题
				System.out.println(homework);//打印试题
				Map<String, Object> rightAnswerMap = student.getRightAnswer();//获取试题答案
				
				if(rightAnswerMap.size() == 0) {
					System.out.println("无法获取试题答案");
					break;
				}
				Map<String,Object> putAnswerMapMap = new HashMap<>();//用户答案容器
				for(String key:rightAnswerMap.keySet()) {
					System.out.println("请输入第"+key+"题答案：");
					String str = sc.next();
					putAnswerMapMap.put(key, str);//把答案放入用户答案容器中
				}
				Map<String,Object> result = student.getAnswer(rightAnswerMap, putAnswerMapMap);//获取结果
				//打印结果
				if(result.size() != 0 && result != null) {
					System.out.println("您答对"+result.get("count")+"题； "+"得分："+result.get("grate"));
					student.setGrate((int)result.get("grate"));
					student.saveStudentInfo(student.toString()+"\n");//把学生成绩信息写入student.txt中
				}else {
					System.out.println("无结果返回！");
				}
				break;
			default:
				System.out.println("输入有误！");
				break;
			}
		System.out.println("继续运行程序：Y；结束程序：N");
		flag = sc.next().equalsIgnoreCase("y");
	}
}
}
