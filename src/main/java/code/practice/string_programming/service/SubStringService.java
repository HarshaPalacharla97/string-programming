package code.practice.string_programming.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubStringService {

    public List<String> dynamicLengthSubString(String string){
        string = string.toLowerCase();
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<string.length(); i++){
            stringBuilder.setLength(0);
            for(int j=i; j<string.length(); j++){
                stringBuilder.append(string.charAt(j));
                list.add(stringBuilder.toString());
            }
        }
        System.out.println(list);
        return list;
    }

    public void fixedLengthSubString(String string, int subStringLength) {
        string = string.toLowerCase();
        List<String> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<=string.length()-subStringLength; i++){
            stringBuilder.setLength(0);
            for(int j=i; j< i+subStringLength; j++){
                stringBuilder.append(string.charAt(j));
            }
            arrayList.add(stringBuilder.toString());
        }
        System.out.println("Sub Strings :: "+arrayList);
    }

    public void largestSubString(String string){
        List<String> subStringList = dynamicLengthSubString(string);
        /*List<String> subStringList = new ArrayList<>();
        StringBuffer sBuffer = new StringBuffer();
        for(int i=0; i<string.length(); i++){
            sBuffer.setLength(0);
            for(int j=i; j<string.length(); j++){
                sBuffer.append(string.charAt(j));
                subStringList.add(sBuffer.toString());
            }
        }*/
        int largest = 0;
        String temp = "";
        for(String subString : subStringList){
            if(largest < subString.length()){
                largest = subString.length();
                temp = subString;
            }
        }
        System.out.println("largest subString :: "+ temp);
    }


    public void smallestSubString(String string){
        List<String> list = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0; i<string.length(); i++){
            stringBuffer.setLength(0);
            for(int j=i; j<string.length(); j++) {
                stringBuffer.append(string.charAt(j));
            }
            list.add(stringBuffer.toString());
        }
        int subStringLength = 0;
        String smallestStr = "";
        for(String strList : list){
            if(subStringLength < strList.length()){
                smallestStr = strList;
            }
        }
        System.out.println("Smallest Sub String :: "+smallestStr);


    }
}
