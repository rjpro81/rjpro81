import java.util.*;

class CodeChallenge {
    public static void main(String[] args) {        
        Foo obj = new Foo();
        List<Integer> myList = new ArrayList<>();
        
        myList.add(4);
        myList.add(3);
        myList.add(8);
        myList.add(7);
        myList.add(2);
        
        System.out.println(obj.aboveBelow(myList, 5));
        System.out.println(obj.stringRotation("RTSLabs", 9));
    }
}

class Foo {

private Map<String,Integer> aboveBelowMap;

    public Map aboveBelow(List<Integer> list, int compareValue){
        int aboveCounter = 0;
        int belowCounter = 0;
        aboveBelowMap = new HashMap<>();
        for (Integer num : list){
            if (num > compareValue){
                aboveCounter++;
            } else if (num < compareValue){
                belowCounter++;
            }
        }
        aboveBelowMap.put("above", aboveCounter);
        aboveBelowMap.put("below", belowCounter);

        return aboveBelowMap;
    }

    public String stringRotation(String originalString, int positiveInt){
        char[] newString = new char[originalString.length()];
        int index = 0;
        
        if (positiveInt > originalString.length()){
            positiveInt = positiveInt % originalString.length();
        }
        
        for (int i = positiveInt; i < originalString.length(); i++){
            newString[i] = originalString.toCharArray()[index]; 
            index++;
        }
        for (int i = 0; index < originalString.length(); i++){
            newString[i] = originalString.toCharArray()[index];
            index++;
        }
        
        return new String(newString);
    }
}

