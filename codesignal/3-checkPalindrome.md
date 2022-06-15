```java
boolean solution(String inputString) {
    char[] array = inputString.toCharArray();

    for(int i = 0; i < inputString.length(); i++){
        if(inputString.charAt(i) != array[inputString.length()-1-i])
            return false;
    }

    return true;
}

```
