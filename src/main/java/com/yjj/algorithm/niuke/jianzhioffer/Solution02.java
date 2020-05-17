package com.yjj.algorithm.niuke.jianzhioffer;

/**
 * @author: YinJunJie
 * @date: 2020/5/16 21:16
 * @description:
 */
public class Solution02 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("We Are Happy");
        String res=replaceSpace(sb);
        System.out.println(res);
    }

    public static String replaceSpace(StringBuffer str) {
        if (str==null){
            return null;
        }
        char[] chars = str.toString().toCharArray();
        if (chars==null||chars.length==0){
            return "";
        }
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (' '==(chars[i])){
                sb.append("%20");
            }else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
