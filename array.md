# 배열 (Array)

* __배열__ : 같은 자료형의 변수를 하나의 묶음으로 다루는 것이며, 배열은 저장된 값마다 인덱스 번호가 0부터 시작하여 설정한다. 

```java
int a;
int a1;
int a2;//....하나씩 선언하여 값을 대입하기 보다는 배열을 통해 쉽고 빠르게 선언과 값 대입을 한다.

int arr[] = new int[10];
```

---



* __2차원 배열__ : 자료형이 같은 1차원 배열의 묶음으로 배열 안에 다른 배열 존재하며, 2차원 배열은 할당된 공간마다 인덱스 번호 두 개 부여한다. (앞 번호는 행, 뒷 번호는 열 ([0][0]) )

```java
int arr[][] = new arr[10][10];
//값 대입
for(int i = 0; i < arr.length; i++){
    for(int j = 0;j < arr[i].length; j++){
        arr[i][j] = j;
    }
}
```

