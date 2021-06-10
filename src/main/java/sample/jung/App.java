package sample.jung;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        File file = new File("D:\\project framework\\spring boot jpa\\workspace\\jung\\src\\main\\java\\sample\\jung\\web\\board");
        createPackage(file,"Board", "sample.jung.web.board");
    }
    
    public static void createPackage(File file , String clsssName, String packageName) {
    	String controllerFolder = "controller";
    	String servicePacFolder =  "service";
    	String mapperPacFolder =  "mapper";
    	
    	createFolder(new File(file.getAbsolutePath() + File.separator + controllerFolder));
    	createFolder(new File(file.getAbsolutePath() + File.separator + servicePacFolder));
    	createFolder(new File(file.getAbsolutePath() + File.separator + mapperPacFolder));
    	
    	String controllerFile = clsssName + "Controller.java";
    	String serviceFile =  clsssName + "Service.java";
    	String mapperFile =  clsssName + "Mapper.java";
    	
    	createFile(new File(file.getAbsolutePath() + File.separator + controllerFolder + File.separator + controllerFile));
    	createFile(new File(file.getAbsolutePath() + File.separator + servicePacFolder + File.separator + serviceFile));
    	createFile(new File(file.getAbsolutePath() + File.separator + mapperPacFolder + File.separator + mapperFile));
    	
    	String controllerPackage = packageName + ".controller;";
    	String servicePackage =  packageName + ".service;";
    	String mapperPackage =  packageName + ".mapper;";
    	
    	String controllerClassNm = clsssName + "Controller";
    	String serviceClassNm =  clsssName + "Service";
    	String mapperClassNm =  clsssName + "Mapper";
    	
    	createControllerClassPrintWrite(new File(file.getAbsolutePath() + File.separator + controllerFolder + File.separator + controllerFile), controllerClassNm, controllerPackage, "class");
    	createServiceClassPrintWrite(new File(file.getAbsolutePath() + File.separator + servicePacFolder + File.separator + serviceFile), serviceClassNm, servicePackage, "class");
    	createMapperClassPrintWrite(new File(file.getAbsolutePath() + File.separator + mapperPacFolder + File.separator + mapperFile), mapperClassNm, mapperPackage, "interface");
    }
    
    public static void createFolder(File file) {
    	if(!file.isDirectory()) {
    		if(file.mkdirs()) {
    			System.out.println("폴더 생성");
    		}else {
    			System.out.println("폴더 생성 실패");
    		}
    	}
    }
    
    public static void createFile(File file) {
    	if(!file.isFile()) {
    		try {
    			if(file.createNewFile()) {
        			System.out.println("폴더 생성");
        		}else {
        			System.out.println("폴더 생성 실패");
        		}
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    		
    	}
    }
    
    
    public static void createControllerClassPrintWrite(File file,String className, String packageName, String calssType) {
    	if(file.isFile()) {
    		try {
    			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
    			PrintWriter printWriter = new PrintWriter(bufferedWriter);
    			printWriter.write("package " + packageName);
    			printWriter.write("\n");
    			printWriter.write("\n");
    			printWriter.write("import org.springframework.stereotype.Controller;");
    			printWriter.write("\n");
    			printWriter.write("\n");
    			printWriter.write("@Controller");
    			printWriter.write("\n");
    			printWriter.write("public "+ calssType + " " + className + "{");
    			printWriter.write("\n");
    			printWriter.write("\n");
    			printWriter.write("}");
    			printWriter.flush();
    			printWriter.close();
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    		
    	}
    }
    
    public static void createServiceClassPrintWrite(File file,String className, String packageName, String calssType) {
    	if(file.isFile()) {
    		try {
    			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
    			PrintWriter printWriter = new PrintWriter(bufferedWriter);
    			printWriter.write("package " + packageName);
    			printWriter.write("\n");
    			printWriter.write("\n");
    			printWriter.write("import org.springframework.stereotype.Service;");
    			printWriter.write("\n");
    			printWriter.write("\n");
    			printWriter.write("@Service");
    			printWriter.write("\n");
    			printWriter.write("public "+ calssType + " " + className + "{");
    			printWriter.write("\n");
    			printWriter.write("\n");
    			printWriter.write("}");
    			printWriter.flush();
    			printWriter.close();
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    		
    	}
    }
    
    public static void createMapperClassPrintWrite(File file,String className, String packageName, String calssType) {
    	if(file.isFile()) {
    		try {
    			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
    			PrintWriter printWriter = new PrintWriter(bufferedWriter);
    			printWriter.write("package " + packageName);
    			printWriter.write("\n");
    			printWriter.write("\n");
    			printWriter.write("import org.apache.ibatis.annotations.Mapper;");
    			printWriter.write("\n");
    			printWriter.write("\n");
    			printWriter.write("@Mapper");
    			printWriter.write("\n");
    			printWriter.write("public "+ calssType + " " + className + "{");
    			printWriter.write("\n");
    			printWriter.write("\n");
    			printWriter.write("}");
    			printWriter.flush();
    			printWriter.close();
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    		
    	}
    }
    
    
    
 
}
