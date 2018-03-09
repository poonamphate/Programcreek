import java.util.*;
public class BalancedParenthesis {
	public static void main(String[] args){
        char[] charArr= {'{','(',')','}','[',']'};
        System.out.println(isBalanced(charArr));
    }//main
    
    public static boolean isBalanced(char[] charArr){
        //create a stack object
        Stack<Character> stack = new Stack<Character>();
        //iterate ove char array
        
        for(int i = 0; i< charArr.length; i++){
            //if char is opening bracket
            if(charArr[i] == '(' || charArr[i] == '{' || charArr[i] == '['){
                stack.push(charArr[i]);
            }
            
            if(charArr[i] == ')' || charArr[i] == '}' || charArr[i] == ']'){
                //if stack is empty, return false;
                if(stack.isEmpty()){
                    return false;
                }
                
                else if(!isMatching(stack.pop(), charArr[i])){
                    return false;
                }
            }
            
        }
        
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }//method
    
    static boolean isMatching(char ch1, char ch2){
        if(ch1 == '(' && ch2 == ')'){
            return true;
        }
        
        else if(ch1 == '{' && ch2 == '}'){
            return true;
        }
        
        else if(ch1 == '[' && ch2 == ']'){
            return true;
        }
        
        
        else {
            return false;
        }
    }
}
