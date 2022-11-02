```java
int solution(int[] statues) {
    int[] copy = new int[20];


    int min = statues[0];
    int max = statues[0];
    for(int i = 0; i < statues.length; i ++){
        int s = statues[i];
        if(s < min){
            min = s;
        }

        if(s > max){
            max = s;
        }

        copy[s] = 1;
    }

    int count = 0;
    for(int i = min; i < max; i ++){
        if(copy[i] == 0){
            count++;
        }
    }




    // Collections.sort(statues);
    // int count = 0;
    // for(int i = 1; i < statues.length; i++){
    //     int si = statues[i];
    //     int s = statues[i - 1];

    //     if(s != si){
    //         count += si-s;
    //     }
    // }

    return count;
}

```
