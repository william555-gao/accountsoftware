package com.shanxi.lvliang.commodity.account;

import java.io.*;

/**
 * @ClassName:FileIOUtil
 * @Descirpiton: TODO
 * @Author: Gaoww
 * @Date: 2020/9/9 17:37
 * @Version: 1.0
 */
public class FileIOUtil {

    public static String fileOutput(String filePath, String  fileName){
        String result = "failed";
        File file = new File(filePath+"\\"+fileName);
        String content = "{\"sex\":\"man\",\r\n\"age\":15,\r\n\"name\":\"张三\"}";
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedWriter bufferedWriter = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream,"UTF-8") );
            bufferedWriter.write(content);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            result = "success";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static String fileInput(String filePath, String fileName) throws IOException {
        StringBuffer result = new StringBuffer();
        File file = new File(filePath + "\\" + fileName);
        if (file.isFile() && file.exists()) {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String lineStr = null;
            while((lineStr = bufferedReader.readLine())!= null){
                lineStr.contains("name");
                result.append(lineStr);
            }
        }
        return result.toString();
    }


    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Administrator\\Desktop";
        String fileName = "user.txt";
        String s = fileOutput(filePath, fileName);
        System.out.println(s);
        String s1 = fileInput(filePath, fileName);
        System.out.println(s1);
    }
}
