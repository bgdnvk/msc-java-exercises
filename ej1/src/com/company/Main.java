package com.company;

import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack<UnedObj> objStack = new Stack<>();
        UnedObj myObj = new UnedObj(1, "primerObj");
        UnedObj myObj2 = new UnedObj(2, "segundoObj");
        UnedObj myObj3 = new UnedObj(3, "tercerObj");

        objStack.push(myObj);
        objStack.push(myObj2);
        objStack.push(myObj3);

        //iterator
        Iterator iterator = objStack.iterator();
        iterator.forEachRemaining( (e) -> {
            /*
            UnedObj popd = objStack.pop();
            UnedObj peekd = objStack.peek();
            System.out.println("popd"+ popd + " peekd "+ peekd);
             */
            System.out.println(e);

        });



        //ternary in java?
        //iterator.hasNext() ? System.out.println(iterator.next()): System.out.println("nothing here");

        /* works fine
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //System.out.println(iterator.getClass());
        }
        */

        /* 2nd iterator doesn't work?
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(iterator.getClass());
        }
         */

        //streams
        //backticks in java? ex ` text${arg} text`
        System.out.println("---STREAMS---");
        Stream stream = objStack.stream();
        Stream stream2 = objStack.stream();
        stream.forEach( (e) -> System.out.println("from stream " +e));
        stream2.forEach( (e) -> System.out.println("from stream2 " +e));


        /*
        stream.forEach((e) -> {
            System.out.println("removing "+e);
            objStack.pop();
            System.out.println("stack now is "+ objStack);
        });
        System.out.println("stack now is "+ objStack);
         */
        System.out.println("---EMPTYING STACK---");
        while (!objStack.empty()){
            UnedObj leavingObj = objStack.pop();
            System.out.println("emptied "+leavingObj);
        }

    }
}
