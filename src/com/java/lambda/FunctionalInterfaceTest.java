package com.java.lambda;

/**
 * @ProjectName: leet-book-code
 * @Package: com.java.lambda
 * @ClassName: FunctionalInterfaceTest
 * @Author: lengjx
 * @Description: 函数式接口
 * @Date: 2021/9/24 10:39
 */
public class FunctionalInterfaceTest {

    @FunctionalInterface
    interface AcFunction{
        void printMessage(String message);
    }


    public static void main(String[] args) {
        // 测试用例
        String messages = "张三王八蛋";
        AcFunction ac =   message -> System.out.println(message);
        ac.printMessage(messages);
    }

}
